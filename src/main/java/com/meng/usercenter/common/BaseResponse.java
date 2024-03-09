package com.meng.usercenter.common;

import lombok.Data;

@Data
public class BaseResponse<T> {
    /**
     * 返回码
     */
    private int code;
    /**
     * 返回数据
     */
    private T data;
    private String message;

    private String description;

    public BaseResponse(int code, T data, String message, String description) {
        this.code = code;
        this.data = data;
        this.message = message;
        this.description = description;
    }

    public BaseResponse(int code, T data, String message) {
        this(code, data, message, "");
    }

    public BaseResponse(int code, T data) {
        this(code, data, "", "");
    }

    public BaseResponse(ErrorCode errorCode) {
        this(errorCode.getCode(), null, errorCode.getMessage(), errorCode.getDescription());
    }

}
