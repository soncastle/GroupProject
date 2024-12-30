package com.example.demo.domain;

import java.util.Date;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class MemberRequest {
	private String userid;
	private String name;
	private Date birth;
	private String password;
	private String gender;
	private String address;
	private String phone;
}