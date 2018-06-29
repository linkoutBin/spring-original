package com.bin.spring.service.impl;

import com.bin.spring.dao.UserDao;
import com.bin.spring.domain.User;
import com.bin.spring.service.Service;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ServiceImpl implements Service {

    private UserDao userDao;

    public String showTime() {
        return new SimpleDateFormat("yyyy-MM-dd").format(new Date());
    }

    public String sayHello(String name) {
        return "Hello " + name;
    }

    @Override
    public int add(User user) {
        return userDao.save(user);
    }

    public UserDao getUserDao() {
        return userDao;
    }

    public void addByJpa(User user){
        userDao.saveByJpa(user);
    }

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }
}
