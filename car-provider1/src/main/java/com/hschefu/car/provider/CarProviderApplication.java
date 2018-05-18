package com.hschefu.car.provider;

import java.util.Random;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.transaction.annotation.EnableTransactionManagement;


@EnableDiscoveryClient 
//@EnableEurekaClient
@SpringBootApplication
@EnableHystrix
@EnableCircuitBreaker
@EnableFeignClients()
@EnableTransactionManagement
@EnableAspectJAutoProxy
public class CarProviderApplication {

	public static void main(String[] args) {
		int port =0;
		
		Random rmd = new Random(System.currentTimeMillis());
		//port = rmd.nextInt(50)+8860;
		System.out.println("CarProvider is start .....");
		SpringApplicationBuilder applicationBuilder = new SpringApplicationBuilder(CarProviderApplication.class);
		applicationBuilder.web(true).run(args);

		System.out.println("CarProvider haved started  .....");
	}
}
