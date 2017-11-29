package org.timeriver.example.service.impl;

import org.springframework.stereotype.Service;
import org.timeriver.example.base.ServiceException;
import org.timeriver.example.dao.UserDAO;
import org.timeriver.example.domain.UserDO;
import org.timeriver.example.query.QueryUser;
import org.timeriver.example.service.UserService;

import javax.annotation.Resource;
import java.util.List;

/**
 * @auther naijiang.wang
 * @date 17-11-28 下午8:54
 */
@Service
public class UserServiceImpl implements UserService{

    @Resource
    private UserDAO userDAO;

    @Override
    public UserDO getUserById(Integer id) throws ServiceException {
        return null;
    }

    @Override
    public List<UserDO> listUser(QueryUser queryUser) throws ServiceException {
        return userDAO.listUser(queryUser);
    }

    @Override
    public UserDO insertUser(UserDO userDO) throws ServiceException {
        userDAO.insertUser(userDO);
        return userDO;
    }

    @Override
    public Integer updateUserById(UserDO userDO) throws ServiceException {
        return null;
    }
}
