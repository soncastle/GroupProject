package com.example.demo.service;

import com.example.demo.domain.Member;
import com.example.demo.domain.MemberRequest;


public interface MemberService {
	
	public void registerMember(MemberRequest dto) throws Exception;
	//회원조회
	public Member selectMember(String userid) throws Exception;
	//회원인증
	public Member selectWithPass(String userid, String pw) throws Exception;
	
}