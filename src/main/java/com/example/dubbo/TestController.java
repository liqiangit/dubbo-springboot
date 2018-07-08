package com.example.dubbo;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Lazy;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.dubbo.service.HelloService;

@RestController
public class TestController {
	
@Lazy
@Resource(name="helloService")
HelloService helloService;

@Value("${control}")
private String control;

	 @RequestMapping("/")
	    String index() {
//	        return "book name is:bookName and book author is: bookAuthor";
		 return control+helloService.sayHello();
	    }
}
