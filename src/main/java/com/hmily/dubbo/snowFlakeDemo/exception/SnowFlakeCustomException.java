package com.hmily.dubbo.snowFlakeDemo.exception;



/**
 * 统一的运行时异常类，方便全局异常拦截器返回自定义异常信息
 * @author ly-oushim
 *
 */
public class SnowFlakeCustomException extends RuntimeException {

	private int code;

	public SnowFlakeCustomException(String message) {
		super(message);
	}

	public SnowFlakeCustomException(int code, String message) {
		super(message);
		this.code = code;
	}


	
}
