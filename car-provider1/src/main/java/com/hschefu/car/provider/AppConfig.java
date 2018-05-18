package com.hschefu.car.provider;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.hschefu.common.db.TemplateUtil;

@Configuration
@MapperScan("com.hschefu.car.provider.repository")
public class AppConfig {

	public static void main(String[] args) {
		String url= "jdbc:mysql://119.23.12.94:3306/hscarbasic?characterEncoding=utf8&useSSL=false";
		TemplateUtil.generateMapper(url, "hscarbasic", "root", "root", "com.hschefu.user.provider.repository","c:/src/");
	}
}
