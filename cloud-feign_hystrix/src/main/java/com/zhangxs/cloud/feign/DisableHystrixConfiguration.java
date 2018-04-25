package com.zhangxs.cloud.feign;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import feign.Feign;

//@Configuration 一定要去掉这个注解，不然全局都会关闭hystrix服务 
public class DisableHystrixConfiguration {
    @Bean
	@Scope("prototype")
	public Feign.Builder feignBuilder() {
		return Feign.builder();
	}
}
