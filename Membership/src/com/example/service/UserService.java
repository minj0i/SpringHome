package com.example.service;

import java.util.List;

import com.exmple.vo.UserVO;

public interface UserService {
	void insertUser(UserVO user);
	void deleteUser(String id);
	void updateUser(UserVO user);
	List<UserVO> getUserList();
	UserVO getUser(String id);
}
