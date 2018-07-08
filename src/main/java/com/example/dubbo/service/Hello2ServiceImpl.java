package com.example.dubbo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class Hello2ServiceImpl implements HelloService{

	public List<String> sayHello() {
		List<String> list=new ArrayList<>();
		System.err.println("sayHello");
//		return "Hello"+msg;
		list.add(msg);
		return list;
	}
	 @Value("${msg}")
	private String msg;
}
