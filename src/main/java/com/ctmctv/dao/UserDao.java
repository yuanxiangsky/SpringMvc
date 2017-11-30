package com.ctmctv.dao;

import com.ctmctv.entity.User;
import org.apache.ibatis.annotations.Param;

/**
 * Created by YuanXiang on 2017/11/30.
 */
public interface UserDao {

    /**
     * 通过ID查询用户
     * @param id
     * @return
     */
    User queryById(@Param("userid") int id);

}
