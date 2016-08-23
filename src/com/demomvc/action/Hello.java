package com.demomvc.action;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.demomvc.pojo.Account;
import com.demomvc.service.UserService;

@Controller
public class Hello {

	@Autowired
	private UserService userService;
	private String reponse;

	@RequestMapping(value = "/addu", method = { RequestMethod.POST,
			RequestMethod.GET })
	public @ResponseBody
	Object validate(String param) {// 请求返回数据方法
		Account user = new Account();
		user.setNickname("demo");
		user.setState(4);
		int result = userService.insertUser(user);
		System.out.println("执行完成");
		return "index";
	}

	public String getReponse() {
		return reponse;
	}

	public void setReponse(String reponse) {
		this.reponse = reponse;
	}

}
