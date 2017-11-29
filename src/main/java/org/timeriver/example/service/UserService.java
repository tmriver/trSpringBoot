/**
* @Description UserService is generate by Tools. 
* @author naijiang.wang
* @Time  2017-07-06 11:34:39
*/

package org.timeriver.example.service;

import org.timeriver.example.base.ServiceException;
import org.timeriver.example.domain.UserDO;
import org.timeriver.example.query.QueryUser;

import java.util.List;


public interface UserService {

	public UserDO getUserById(Integer id) throws ServiceException;
	public List<UserDO> listUser(QueryUser queryUser) throws ServiceException;
	public UserDO insertUser(UserDO userDO) throws ServiceException;
	public Integer updateUserById(UserDO userDO) throws ServiceException;

}



