package com.hschefu.car.provider.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import com.hschefu.common.DataContext;

@ControllerAdvice()
public class CommonConroller {

//	@ResponseBody
//	@ExceptionHandler(value = Exception.class)
//	public DataContext<String> errorHandler(HttpServletRequest req, Exception e) {
//		DataContext<String> result = new DataContext<>();
//		result.setInfo(e.getMessage());
//		result.setText("请求异常");
//		result.setCode(-1);
//		return result;
//	}
}
