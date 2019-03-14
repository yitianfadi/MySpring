package com.zzkun.service;

import com.zzkun.dao.UserDao;
import com.zzkun.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Service用于标注业务层组件
 * Created by kun on 2016/5/5.
 */
@Service
public class UserService {

    @Autowired
    private UserDao userDao;

    public boolean register(User resource) {
        User u = userDao.findIsbnNumber(resource.getIsbnNumber());
        if(u.getId() == 0) {
            userDao.register(resource);
            return true;
        }
        return false;
    }

    public boolean loginCheck(User resource) {
        User u = userDao.findIsbnNumber(resource.getIsbnNumber());
        return resource.getPath().equals(u.getPath());
    }
}
