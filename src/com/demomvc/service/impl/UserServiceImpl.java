package com.demomvc.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.demomvc.dao.UserMapper;
import com.demomvc.pojo.Account;
import com.demomvc.service.UserService;

@Service
@Transactional(readOnly = true, propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
public class UserServiceImpl implements UserService {
	@Autowired
	private UserMapper udao;

	@Override
	// 方法上注解属性会覆盖类注解上的相同属性
	public int insertUser(Account user) {
		// TODO Auto-generated method stub
		try {
			return udao.insertUser(user);
		} catch (Exception e) {
			// TODO: handle exception
			return 0;
		}
	}
}
