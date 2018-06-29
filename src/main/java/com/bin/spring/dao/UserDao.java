package com.bin.spring.dao;

import com.bin.spring.domain.User;

public interface UserDao {
    int save(User user);
    void saveByJpa(User user);
}
