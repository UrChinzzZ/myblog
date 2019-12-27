package com.urchin.bg.service.userServiceImpl;

import com.urchin.bg.dao.loginDao;
import com.urchin.bg.entity.user;
import com.urchin.bg.service.userService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * @ClassName userServiceImpl
 * @Description: TODO
 * @Author Administrator
 * @Date 2019/8/30 0030
 * @Version V1.0
 **/
@Service
public class userServiceImpl implements userService {
    @Autowired
    private loginDao user ;
    @Override
    public Map getUser() {
        return user.getUser();
    }
    @Override
    public int inUser() {
        System.out.println(user.inUser());
        return user.inUser();
    }

    @Override
    public int delUser() {
        return delUser();
    }
    @Override
    public int upUser(com.urchin.bg.entity.user user) {
        return upUser(user);
    }
}
