package com.wang.ordering.util;

import lombok.Getter;
import lombok.Setter;
import org.apache.commons.lang3.builder.ToStringBuilder;

@Setter
@Getter
public class ApiResult {
	private int code;
	private String msg;
	private Object data;

	public ApiResult() {
	}

	public ApiResult(int code, String msg) {
		this(code,msg,null);
	}

	public ApiResult(int code, String msg, Object data) {
		this.code = code;
		this.msg = msg;
		this.data = data;
	}

	public static ApiResult success(){
		return new ApiResult(200,"success",null);
	}

	public static ApiResult error(){
		return new ApiResult(101,"error",null);
	}

	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}
}