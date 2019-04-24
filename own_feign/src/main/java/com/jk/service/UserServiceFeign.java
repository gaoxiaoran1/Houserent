package com.jk.service;

import org.springframework.cloud.openfeign.FeignClient;

@FeignClient("service-user") //声明为feign的客户端 , 指名要调用的服务
public interface UserServiceFeign extends UserService_api{
}
