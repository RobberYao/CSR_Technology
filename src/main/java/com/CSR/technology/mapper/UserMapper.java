package com.CSR.technology.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.CSR.technology.entity.User;

@Repository
@Mapper
public interface UserMapper {

	User selectUserByName(String name);

}
