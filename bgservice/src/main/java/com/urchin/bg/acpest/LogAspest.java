package com.urchin.bg.acpest;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import java.util.Arrays;

/**
 * @program: test
 * @description: 日志处理
 * @author: Mr.urchin
 * @create: 2020-02-11 22:43
 **/
//启用切面操作
@Aspect
//开启组件扫描
@Component
public class LogAspest {
    private  final Logger logger= LoggerFactory.getLogger(this.getClass());
    //创建切面方法 execution规定来切那些类
    @Pointcut("execution(* com.urchin.bg.web.*.*(..))")
    public void log(){

    }
    @Before("log()")
    public void dobefore(JoinPoint joinPoint){
        ServletRequestAttributes attributes= (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        HttpServletRequest request=attributes.getRequest();
        String url=request.getRequestURI();
        String ip=request.getRemoteAddr();
        String classMethod = joinPoint.getSignature().getDeclaringTypeName()+"."+joinPoint.getSignature().getName();
        Object[] args=joinPoint.getArgs();
        RepuestLog repuestLog=new RepuestLog(url,ip,classMethod,args);
        logger.info("RepuestLog:{}",repuestLog );
    }
    @After("log()")
    public void doAfter(){
//        logger.info("-----------切面方法执行  请求方法后执行");
    }
    @AfterReturning(returning = "result",pointcut = "log()")
    public void doAfterReturn(Object result){
        logger.info("Result:{}",result);
    }
    private  class RepuestLog{
        private  String url;
        private  String ip;
        private  String classMethod;
        private  Object[] args;

        public RepuestLog(String url, String ip, String classMethod, Object[] args) {
            this.url = url;
            this.ip = ip;
            this.classMethod = classMethod;
            this.args = args;
        }

        @Override
        public String toString() {
            return "{" +
                    "url='" + url + '\'' +
                    ", ip='" + ip + '\'' +
                    ", classMethod='" + classMethod + '\'' +
                    ", args=" + Arrays.toString(args) +
                    '}';
        }
    }
}
