package com.urchin.bg.service;

import com.urchin.bg.entity.user;
import java.util.Map;

/**
 * @ClassName userService
 * @Description: TODO
 * @Author Administrator
 * @Date 2019/8/30 0030
 * @Version V1.0
 **/

public interface userService {
    Map getUser();
    int  delUser();
    int  upUser(user user);
    int  inUser();
}
