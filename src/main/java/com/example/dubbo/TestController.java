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

	@RequestMapping("/merger")
	String index() {
		// return "book name is:bookName and book author is: bookAuthor";
		return control + helloService.sayHello();
	}

	@RequestMapping("/cluster")
	String cluster() {
		// return "book name is:bookName and book author is: bookAuthor";
		return control + clusterService.sayHello();
	}
	
	@RequestMapping("/broadcast")
	String broadcast() {
		// return "book name is:bookName and book author is: bookAuthor";
		return control + broadcastService.sayHello();
	}	
}
