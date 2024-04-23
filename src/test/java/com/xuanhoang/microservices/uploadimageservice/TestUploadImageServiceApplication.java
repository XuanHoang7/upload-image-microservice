package com.xuanhoang.microservices.uploadimageservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.test.context.TestConfiguration;

@TestConfiguration(proxyBeanMethods = false)
public class TestUploadImageServiceApplication {

	public static void main(String[] args) {
		SpringApplication.from(UploadImageServiceApplication::main).with(TestUploadImageServiceApplication.class).run(args);
	}

}
