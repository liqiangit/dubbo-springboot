package com.example.dubbo;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Lazy;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.dubbo.service.BroadcastService;
import com.example.dubbo.service.ClusterService;
import com.example.dubbo.service.HelloService;

@RestController
public class TestController {

	@Lazy
	@Resource(name = "helloService")
	HelloService helloService;

	@Lazy
	@Resource(name = "clusterService")
	ClusterService clusterService;
	
	@Lazy
	@Resource(name = "broadcastService")
	BroadcastService broadcastService;	

	@Value("${control}")
	private String control;
/**
 * 测试分组聚合（接口多种实现）
 * @return
 */
	@RequestMapping("/merger")
	String index() {
		return control + helloService.sayHello();
	}
/**
 * 测试广播合并
 * @return
 */
	@RequestMapping("/cluster")
	String cluster() {
		return control + clusterService.sayHello();
	}
/**
 * 测试广播	
 * @return
 */
	@RequestMapping("/broadcast")
	String broadcast() {
		return control + broadcastService.sayHello();
	}	
}
