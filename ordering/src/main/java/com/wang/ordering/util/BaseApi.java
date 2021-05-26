package com.wang.ordering.util;


public abstract class BaseApi {
    protected ApiResult result(int code, Object data) {
        ApiResult res = new ApiResult();
        res.setCode(AppException.buildErrorCode(code));
        res.setData(data);
        return res;
    }

    protected ApiResult result(int code, String msg, Object data) {
        ApiResult res = new ApiResult();
        res.setCode(AppException.buildErrorCode(code));
        res.setMsg(msg);
        res.setData(data);
        return res;
    }

    protected ApiResult result(int code, String msg) {
        ApiResult res = new ApiResult();
        res.setCode(AppException.buildErrorCode(code));
        res.setMsg(msg);
        return res;
    }

    protected ApiResult success(Object data) {
        return result(200, "操作成功", data);
    }

    protected ApiResult success(String msg) {
        return result(200, msg, null);
    }

    protected ApiResult success() {
        return result(200, "操作成功", "操作成功");
    }

    protected ApiResult error(int error) {
        return result(error, "error");
    }

    protected ApiResult error(int error, String msg) {
        return result(error, msg);
    }



}