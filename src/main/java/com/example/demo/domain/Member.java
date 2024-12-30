package com.example.demo.domain;

import java.util.Date;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@RequiredArgsConstructor
@Setter
@Getter
public class Member {
	private String userid;
	private String name;
	private Date birth;
	private String password;
	private String gender;
	private String address;
	private String phone;
	private Date timestamp; 
	private String role;
}