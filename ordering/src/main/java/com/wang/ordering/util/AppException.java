package com.wang.ordering.util;

public class AppException extends RuntimeException
{
    private int errorCode;

    public static int buildErrorCode(int code)
    {
        return code;
    }

    public int getErrorCode() {
        return this.errorCode;
    }

    public AppException(String msg, int code) {
        super(msg);
        this.errorCode = code;
    }
}