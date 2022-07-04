
package com.shelly.coupons.logic;

import com.shelly.coupons.dao.IUserDao;
import com.shelly.coupons.entities.UserEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserLogic {

    @Autowired
    private IUserDao userDao;

    public long createUser(UserEntity user) {
        userDao.save(user);
        return user.getId();
    }

    public void updateUser(UserEntity user) {
        userDao.save(user);
    }

    public UserEntity getUser(long id) {
        UserEntity user = userDao.findById(id).get();
        return user;
    }

    public void deleteUser(long id) {
        UserEntity user = getUser(id);
        userDao.delete(user);
    }

    public List<UserEntity> findByName(String name) {
        return this.userDao.findByName(name);
    }

    public List<UserEntity> getByData(String name, int age) {
        return this.userDao.getByData(name, age);
    }
}

