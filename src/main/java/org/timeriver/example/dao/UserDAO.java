package org.timeriver.example.dao;


import org.apache.ibatis.annotations.Mapper;
import org.timeriver.example.domain.UserDO;
import org.timeriver.example.query.QueryUser;

import java.util.List;

@Mapper
public interface UserDAO {

	public UserDO getUserById(Integer id) ;

	public List< UserDO >listUser(QueryUser queryUser) ;

	public int insertUser(UserDO UserDO) ;

	public int updateUserById(UserDO UserDO) ;

}

