package com.woniu.woniuticket.user.dao;

import com.woniu.woniuticket.user.pojo.Wallet;

public interface walletMapper {
    int deleteByPrimaryKey(Integer walletId);

    int insert(Wallet record);

    int insertSelective(Wallet record);

    Wallet selectByPrimaryKey(Integer walletId);

    int updateByPrimaryKeySelective(Wallet record);

    int updateByPrimaryKey(Wallet record);
}