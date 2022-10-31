
package com.shelly.coupons.logic;

import com.shelly.coupons.dao.IUserDao;
import com.shelly.coupons.entities.UserEntity;
import com.shelly.coupons.exception.ApplicationException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserLogic {


    private final IUserDao userDao;

    @Autowired
    public UserLogic(IUserDao userDao) {
        this.userDao = userDao;
    }

    public void createUser(UserEntity user) throws ApplicationException {
        userDao.save(user);
    }

    public void updateUser(UserEntity user)throws ApplicationException {
        userDao.save(user);
    }

    public UserEntity getUser(long id)throws ApplicationException {
        return userDao.findById(id).get();
    }

    public void deleteUser(long id) throws ApplicationException{
        UserEntity user = getUser(id);
        userDao.delete(user);
    }
}

