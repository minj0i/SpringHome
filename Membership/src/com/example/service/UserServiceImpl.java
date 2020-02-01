package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dao.UserDAO;
import com.exmple.vo.UserVO;

@Service("userService")
public class UserServiceImpl implements UserService {

	@Autowired
	UserDAO userDao;
	
	@Override
	public void insertUser(UserVO user) {
		this.userDao.insert(user);
	}

	@Override
	public void deleteUser(String id) {

	}

	@Override
	public void updateUser(UserVO user) {

	}

	@Override
	public List<UserVO> getUserList() {
		return userDao.readAll();
	}

	@Override
	public UserVO getUser(String id) {
		return this.userDao.read(id);
	}

}
