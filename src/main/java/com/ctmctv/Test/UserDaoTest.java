package com.ctmctv.Test;

import com.ctmctv.dao.UserDao;
import com.ctmctv.entity.User;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by YuanXiang on 2017/11/30.
 */
public class UserDaoTest extends BaseTest {

    @Autowired
    private UserDao userDao;

    @Test
    public void testQueryById (){
        int id = 2;
        User user = userDao.queryById(id);
        System.out.println(user);
    }
}
