package com.urchin.bg.dao;
import com.urchin.springboot.entity.user;
import org.springframework.stereotype.Repository;

import java.util.Map;

@Repository
public interface loginDao {
/**
 * @MethodName: a
 * @Description: TODO
 * @Param: []
 * @Return: java.util.List
 * @Author: Administrator
 * @Date: 下午 4:13
**/
    Map getUser();
    /**
     * @MethodName: inUser
     * @Description: TODO
     * @Param: []
     * @Return: int
     * @Author: Administrator
     * @Date: 下午 4:15
    **/
    int    inUser();
    int     delUser();
    int     upUser(user user);
}
