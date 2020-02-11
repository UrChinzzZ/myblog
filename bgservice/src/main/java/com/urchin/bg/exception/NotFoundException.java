package com.urchin.bg.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * @program: test
 * @description: 博客为空异常
 * @author: Mr.Wang
 * @create: 2020-02-11 22:28
 **/
//捕获状态码
@ResponseStatus(HttpStatus.NOT_FOUND)
public class NotFoundException extends  RuntimeException {
    public NotFoundException() {
    }

    public NotFoundException(String message) {
        super(message);
    }

    public NotFoundException(String message, Throwable cause) {
        super(message, cause);
    }
}
