package com.urchin.bg.web;

import com.urchin.bg.exception.NotFoundException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import javax.websocket.server.PathParam;

/**
 * @program: test
 * @description: 异常页面控制器
 * @author: Mr.Wang
 * @create: 2020-02-11 21:34
 **/
@Controller
public class indexController {
    @GetMapping("/{id}/{name}")
    public String index(@PathVariable Integer id,@PathVariable String name){
//         int i=9/0;
//        String blog=null;
//        if (blog == null){
//            throw  new NotFoundException("博客丢失");
//        }
        System.out.println("-----index-----");
        return "index";
    }
}
