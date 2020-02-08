package com.example.demo;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.exmple.vo.UserVO;

@Controller
public class GetPostController {
	
	@RequestMapping(value="/confirm/{userid}/{city}/{name}/{gender}", method=RequestMethod.POST)
	public String confirm(@PathVariable String userid,
								@PathVariable String name,
								@PathVariable String gender,
								@PathVariable String city,
								Model model) {
		UserVO userVo = new UserVO(userid, name, gender, city);
		model.addAttribute("userVO", userVo);
		return "create"; // /WEB-INF/views/confirm.jsp
	}
		
	
	
	/*	public String confirm(HttpServletRequest request, Model model) {		

		model.addAttribute("userid", request.getParameter("userid"));
		model.addAttribute("name", request.getParameter("name"));
		model.addAttribute("gender", request.getParameter("gender"));
		model.addAttribute("city", request.getParameter("city"));
		return "create"; // /WEB-INF/views/confirm.jsp
		*/
		/*
		ModelAndView mav = new ModelAndView();
		mav.addObject("name", "한지민");
		mav.addObject("gender", "여성");
		mav.addObject("city", "서울시 강남구");
		mav.addObject("userid", "jimin");
		mav.setViewName("create"); //WEB-INF/views/create.jsp
		
		return mav;
		}
		*/
	
}
