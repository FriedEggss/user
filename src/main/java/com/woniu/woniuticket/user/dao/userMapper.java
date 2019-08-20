package com.woniu.woniuticket.user.dao;

import com.woniu.woniuticket.user.pojo.User;

public interface userMapper {
    int deleteByPrimaryKey(Integer userId);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer userId);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
}