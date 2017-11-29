package org.timeriver.example.dao;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.timeriver.AppMain;
import org.timeriver.example.domain.UserDO;
import org.timeriver.example.query.QueryUser;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = AppMain.class)
public class UserDAOTest {

    @Resource
    private UserDAO userDAO;

    @Test
    public void insertUser() {
        UserDO userDO = new UserDO();
        userDO.setName("timeriver");
        userDO.setCreateTime(new Date());
        userDAO.insertUser(userDO);
        System.out.println(userDO);
    }

    @Test
    public void listUser() {
        QueryUser queryUser = new QueryUser();
        queryUser.setName("t");
        List<UserDO> userDOList = userDAO.listUser(queryUser);
        for (UserDO userDO : userDOList) {
            System.out.println(userDO);
        }
    }

}
