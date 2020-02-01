package com.example.dao;

import java.util.List;

import com.exmple.vo.UserVO;

public interface UserDAO {
	void insert(UserVO user);

	List<UserVO> readAll();

	void update(UserVO user);

	void delete(String id);

	UserVO read(String id);
}
