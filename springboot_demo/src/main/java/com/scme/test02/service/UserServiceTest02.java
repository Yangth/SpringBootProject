
package com.scme.test02.service;

import com.scme.test02.dao.UserMapperTest02;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UserServiceTest02 {
	@Autowired
	private UserMapperTest02 userMapperTest02;

	@Transactional
	public String insertTest002(String title,String content, Integer id) {
		userMapperTest02.insert(title, content,id);
//		int i =1/0;
		return "success";
	}

}
