package com.CSR.technology.controller;

import javax.servlet.http.HttpServletResponse;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.CSR.technology.entity.User;
import com.CSR.technology.service.UserService;

@RestController
public class TestController {

	@Autowired
	private StringRedisTemplate stringRedisTemplate;

	@Autowired
	private UserService userSerivce;
	
	@RequestMapping("/hello")
	public String index() {
		stringRedisTemplate.opsForValue().set("aaa", "111");
		return stringRedisTemplate.opsForValue().get("aaa");
	}

	@GetMapping("/h")
	public String hello(HttpServletResponse response) {
		System.out.println("1111");
		response.setStatus(HttpServletResponse.SC_NO_CONTENT);
		return "hello";
	}
	
	@GetMapping("/name")
	public User findUser(){
		
		return userSerivce.getUserByName("yao");
	}
	
}
