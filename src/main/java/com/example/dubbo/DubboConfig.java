package com.example.dubbo;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

@Configuration
@ImportResource(locations={"classpath:config/application-service.xml"})
@ComponentScan(basePackages = "com.example.dubbo.service")
public class DubboConfig {

}
