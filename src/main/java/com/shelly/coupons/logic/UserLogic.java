
package com.shelly.coupons.logic;

import ch.qos.logback.core.net.ObjectWriter;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.shelly.coupons.beans.UserLoginDetails;
import com.shelly.coupons.beans.UserLoginToken;
import com.shelly.coupons.dao.IUserDao;
import com.shelly.coupons.dto.User;
import com.shelly.coupons.entities.UserEntity;
import com.shelly.coupons.enums.ErrorType;
import com.shelly.coupons.enums.UserType;
import com.shelly.coupons.exception.ApplicationException;
import com.shelly.coupons.utils.JWTUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

@Service
public class UserLogic {


    private final IUserDao userDao;

    @Autowired
    public UserLogic(IUserDao userDao) {
        this.userDao = userDao;
    }

    public void createUser(UserEntity user) throws ApplicationException {
        validateUser(user);
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

    private boolean passwordValidation(String password) {
        String regex = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=\\S+$).{8,}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(password);
        return matcher.matches();
    }

    private boolean usernameValidation(String username) {
        String regex = "^[a-zA-Z0-9_!#$%&'*+/=?`{|}~^.-]+@[a-zA-Z0-9.-]+$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(username);
        return matcher.matches();
    }

    private void validateUser(UserEntity user) throws ApplicationException {
        if (!usernameValidation(user.getUsername())) {
            throw new ApplicationException(ErrorType.EMAIL_NOT_VALID_ERROR);
        }
        if (!passwordValidation(user.getPassword())) {
            throw new ApplicationException(ErrorType.PASSWORD_ERROR);
        }
        if (user.getFirstName() == null) {
            throw new ApplicationException(ErrorType.INCORRECT_VALUE);
        }
        if (user.getLastName() == null) {
            throw new ApplicationException(ErrorType.INCORRECT_VALUE);
        }
}

    public UserLoginToken login(UserLoginDetails userLogin) throws ApplicationException, JsonProcessingException {
        UserEntity userEntity = userDao.login(userLogin.getUsername(), userLogin.getPassword());

        if (userEntity ==null){
            throw new ApplicationException(ErrorType.LOGIN_FAILED);
        }
        ObjectMapper objectMapper = new ObjectMapper();
        String userJson = objectMapper.writeValueAsString(userEntity);
        String token = JWTUtils.createJWT(userJson);
        User user = User.from(userEntity);
        return new UserLoginToken(token,user);
    }
}

