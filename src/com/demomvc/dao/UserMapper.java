package com.demomvc.dao;

import com.demomvc.pojo.Account;

public interface UserMapper {
	 
    /**
     * 添加新用户
     * @param user
     * @return
     */
    public int insertUser(Account user);
     
     
}
