package com.example.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.service.MemberService;
import com.example.vo.MemberVO;

@Controller
public class HelloController {
	@Autowired
	MemberService memberservice;

	@RequestMapping(value = "/members", method = RequestMethod.GET)
	@ResponseBody
	public Map members() {
		List<MemberVO> list = this.memberservice.selectAllMember();
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("code", "success");
		map.put("data", list);
		return map;
	}

	@RequestMapping(value = "/members/{userid}", method = RequestMethod.GET)
	@ResponseBody
	public Map memberInfo(@PathVariable String userid) {
		// System.out.println("userid = " + userid);
		MemberVO member = this.memberservice.selectMember(userid);
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("code", "success");
		map.put("data", member);
		return map;
	}

	@RequestMapping(value = "/members", method = RequestMethod.POST)
	@ResponseBody
	public Map insert(@RequestBody MemberVO memberVO) {
		// System.out.println(memberVO);
		this.memberservice.insertMember(memberVO);
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("code", "success");
		return map;
	}

	@RequestMapping(value = "/members", method = RequestMethod.PUT)
	@ResponseBody
	public Map update(@RequestBody MemberVO memberVO) {
		this.memberservice.updateMember(memberVO);
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("code", "success");
		return map;
	}

	@RequestMapping(value = "/members/{userid}", method = RequestMethod.DELETE)
	@ResponseBody
	public Map delete(@PathVariable String userid) {
		this.memberservice.deleteMember(userid);
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("code", "success");
		return map;
	}
}
