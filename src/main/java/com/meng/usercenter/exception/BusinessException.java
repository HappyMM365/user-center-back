package com.meng.usercenter.exception;

import com.meng.usercenter.common.ErrorCode;
import lombok.Getter;

public class BusinessException extends RuntimeException {

    /**
     * 错误码
     */
    @Getter
    private final int code;

    /**
     * 错误描述
     */
    @Getter
    private final String description;


    public BusinessException(String message, int code, String description) {

        super(message);
        this.code = code;
        this.description = description;
    }

    public BusinessException(ErrorCode errorCode) {
        super(errorCode.getMessage());
        this.code = errorCode.getCode();
        this.description = errorCode.getDescription();
    }

    public BusinessException(ErrorCode errorCode, String description) {
        super(errorCode.getMessage());
        this.code = errorCode.getCode();
        this.description = description;
    }

}
