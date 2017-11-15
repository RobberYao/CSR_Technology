package com.CSR.technology.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.util.Assert;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

	@Autowired
	private StringRedisTemplate stringRedisTemplate;
	
	
	@RequestMapping("/hello")
	public String index() {
		stringRedisTemplate.opsForValue().set("aaa", "111");
		return stringRedisTemplate.opsForValue().get("aaa");
	}

}
