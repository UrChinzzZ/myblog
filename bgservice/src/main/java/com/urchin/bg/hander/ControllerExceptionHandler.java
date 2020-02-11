package com.urchin.bg.hander;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.annotation.AnnotationUtils;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.servlet.ModelAndView;
import javax.servlet.http.HttpServletRequest;

/**
 * @program: test
 * @description: 拦截异常信息
 * @author: Mr.Wang
 * @create: 2020-02-11 21:41
 **/
@ControllerAdvice
//拦截所有Contriller控制器
public class ControllerExceptionHandler {
    //获取当前的日志对象
    private final Logger logger= LoggerFactory.getLogger(this.getClass());
    //表示这个方法用来做异常处理 Exception级别处理
    @ExceptionHandler(Exception.class)
    public ModelAndView exceptHandler(HttpServletRequest request,Exception e) throws Exception {
        logger.error("Requst URL;{},Exception:{}",request.getRequestURL(),e);
        if (AnnotationUtils.findAnnotation(e.getClass(), ResponseStatus.class)!= null){
            throw e;
        }
        //返回错误对象
        ModelAndView   mv=new ModelAndView();
        mv.addObject("url",request.getRequestURL());//获取地址
        mv.addObject("excption",e);//获取错误信息
        mv.setViewName("error/error");
        return  mv;
    }
}


