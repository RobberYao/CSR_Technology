package com.CSR.technology.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.CSR.technology.entity.User;
import com.CSR.technology.mapper.UserMapper;

@Service
public class UserServiceImpl {

	@Autowired
	UserMapper userMapper;

	public User getUserByName(String name) {

		return userMapper.selectUserByName(name);
		
	}

}
