
package com.scme.test01.service;

import com.scme.test01.dao.UserMapperTest01;
import com.scme.test02.dao.UserMapperTest02;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
public class UserServiceTest01 {
	@Autowired
	private UserMapperTest01 userMapperTest01;
//	@Autowired
//	private UserMapperTest02 userMapperTest02;

	// private UserServiceTest02 userServiceTest02;
	@Transactional
	public String insertTest001(String title,String content, String id) {
		userMapperTest01.insert(title, content,id);
//		userMapperTest02.insert(title, content,id);
//		int i = 1 / 0;
		return "success";
	}

	@Async
	public String sendSms() {
		// new UserThread().start();
		System.out.println("###sendSms###3");
		for (int i = 1; i <= 3; i++) {
			System.out.println("i:" + i);
		}
		System.out.println("###sendSms###4");
		return "success";
	}

	// class UserThread extends Thread {
	// @Override
	// public void run() {
	// System.out.println("###sendSms###3");
	// for (int i = 1; i <= 3; i++) {
	// System.out.println("i:" + i);
	// }
	// System.out.println("###sendSms###4");
	// return "success";
	// }
	// }

}
