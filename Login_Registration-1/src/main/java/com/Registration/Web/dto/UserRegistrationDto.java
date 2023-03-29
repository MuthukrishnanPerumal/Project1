package com.Registration.Web.dto;

import com.Registration.Service.UserService;

public class UserRegistrationDto {
	private String name;
	private String username;
	private String password;
	
	
	//private UserService userService;
	
	
	
	public UserRegistrationDto(String name, String username, String password) {
		super();
		this.name = name;
		this.username = username;
		this.password = password;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
	public UserRegistrationDto(){
		super();
	}
}
