package com.urchin.springboot.controller;

import com.urchin.springboot.service.userService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @ClassName controller
 * @Description: TODO
 * @Author Administrator
 * @Date 2019/8/30 0030
 * @Version V1.0
 **/
@Controller
@ResponseBody
@RequestMapping("/user/")
public class usercontroller {
    @Autowired
    userService userService;
    @RequestMapping("getuser")
  public  Object   getUser(){
        System.out.println(userService.getUser().toString());
      return userService.getUser();
    };
   /**
   * @Description:
   * @Param:
   * @return:
   * @Author: urchin
   * @Date: 0:07
   */
    public  Object   inUser(){
        return "inUser";
    };
    public  Object   upUser(){
        return null;
    };
    public  Object   delUser(){
        return null;
    };
}