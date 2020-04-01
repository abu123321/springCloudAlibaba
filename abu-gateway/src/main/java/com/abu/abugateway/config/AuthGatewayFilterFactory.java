package com.abu.abugateway.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.gateway.filter.GatewayFilter;
import org.springframework.cloud.gateway.filter.factory.AbstractGatewayFilterFactory;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;


@Component
public class AuthGatewayFilterFactory extends AbstractGatewayFilterFactory<Object> {

    @Resource
    private AuthGatewayFilter authGatewayFilter;


    @Override
    public GatewayFilter apply(Object config) {
        return authGatewayFilter;
    }
}
