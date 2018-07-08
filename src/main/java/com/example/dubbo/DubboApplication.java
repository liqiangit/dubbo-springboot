package com.example.dubbo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DubboApplication {

	public static void main(String[] args) {
//		Cluster
//		BroadcastCluster
//		Merger
//		ListMerger
		SpringApplication.run(DubboApplication.class, args);
	}
}
