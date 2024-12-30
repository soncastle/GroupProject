package com.example.demo.controller;

import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttribute;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.example.demo.domain.MemberRequest;
import com.example.demo.service.MemberService;

import jakarta.servlet.http.HttpSession;

@Controller
@RequestMapping("/member")
public class MemberController {
	
//	@Autowired
//	private MemberRequest memberRequest;
//	
//	@Autowired
//	private MemberService memberService;
	
	@GetMapping("/login")
	public String Login() {
		return "/member/login";
	}
	
	@GetMapping("/register")
	public String Register() {
		return "/member/register";
	}
	
	@PostMapping("/login")
	public String LoginRequest(@RequestParam("userid") String userid,
								@RequestParam("password") String password,
								HttpSession session,
								Model model) {
		if(userid.equals("userid") && password.equals("password")) {
			session.setAttribute("user", userid);
			return "/member/main";
		}
		else {
			String msg = "비밀번호 및 패스워드가 틀렸습니다.";
			model.addAttribute("msg", msg);
			return "member/login";
		}
	}
	
	@PostMapping("/register")
	public String RegisterRequest(@RequestParam("password") String password,
								@RequestParam("passwordConform") String passwordConform,
								Model model) {
		if(password.equals(passwordConform)) {
			return "/member/registerConform";
		}
		else {
			String msg = "비밀번호와 패스워드가 일치하지 않습니다.";
			model.addAttribute("msg", msg);
	            return "redirect:/member/register";
		}
	}
}
