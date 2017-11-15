package com.CSR.technology.mapper;

import org.springframework.stereotype.Repository;

import com.CSR.technology.entity.User;

@Repository
public interface UserMapper {

	User selectUserByName(String name);

}
