package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dao.MemberDao;
import com.example.vo.MemberVO;

@Service("MemberService")
public class MemberServiceImpl implements MemberService {

	@Autowired
	MemberDao memberDao;
	
	@Override
	public int insertMember(MemberVO member) {
		return memberDao.insert(member);
	}

	@Override
	public MemberVO selectMember(String userid) {
		return memberDao.select(userid);
	}

	@Override
	public List<MemberVO> selectAllMember() {
		return memberDao.selectAll();
	}

	@Override
	public int updateMember(MemberVO member) {
		return memberDao.update(member);
	}

	@Override
	public int deleteMember(String userid) {
		return memberDao.delete(userid);
	}

}
