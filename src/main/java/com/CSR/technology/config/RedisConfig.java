package com.CSR.technology.config;

import java.lang.reflect.Method;
 
import org.springframework.cache.interceptor.KeyGenerator;
import org.springframework.context.annotation.Bean;

public class RedisConfig {

	@Bean
	public KeyGenerator keyGenerator(){
		return new KeyGenerator() {
			@Override
			public Object generate(Object arg0, Method arg1, Object... arg2) {
				StringBuilder sb= new StringBuilder();
				sb.append(arg0.getClass().getName());
				sb.append(arg1.getName());
				for (Object object : arg2) {
					sb.append(object.toString());
				}
				return sb.toString();
			}
		};
		
		
		
		
	
		
		
		
		
		
		
	}
	
	
	
	
}
