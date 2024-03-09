package com.meng.usercenter.exception;


import com.meng.usercenter.common.BaseResponse;
import com.meng.usercenter.common.ErrorCode;
import com.meng.usercenter.common.ResultUtils;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
@Slf4j
public class GlobalExceptionHandler {


    //拦截登录异常
    @ExceptionHandler(BusinessException.class)
    public BaseResponse<?> businessExceptionHandler(BusinessException e) {
        log.error("用户不存在：{}", e.getMessage());
        return ResultUtils.error(e.getCode(), e.getMessage(), e.getDescription());
    }

    //拦截登录异常
    @ExceptionHandler(RuntimeException.class)
    public BaseResponse<?> runtimeExceptionHandler(RuntimeException e) {
        log.error("用户不存在：{}", e.getMessage());
        return ResultUtils.error(ErrorCode.SYSTEM_ERROR, e.getMessage(),"");
    }

}
