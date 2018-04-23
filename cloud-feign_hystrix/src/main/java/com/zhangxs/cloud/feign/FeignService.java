package com.zhangxs.cloud.feign;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.zhangxs.cloud.hystrix.HystrixFallback;

//@FeignClient(name="feign-hystrix-service",fallback = HystrixFallback.class) //添加降级服务方法
@FeignClient(name="feign-hystrix-service",configuration = DisableHystrixConfiguration.class)  //自定义不启用hystrix服务
public interface FeignService {
	
	@RequestMapping(value="/getUserName", method =RequestMethod.GET)
	public String getUserName(@RequestParam(required = true, value = "user_name")String user_name);
}
