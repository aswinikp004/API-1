package com.ba.LoginApp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ba.LoginApp.dto.LoginDto;
import com.ba.LoginApp.dto.LoginResponseDto;
import com.ba.LoginApp.service.UserService;

@RestController
public class LoginController 
{
	@Autowired
	UserService userService;
	
  @PostMapping(value="/login", consumes="application/json")
  public LoginResponseDto login(@RequestBody LoginDto loginDto)
  {
	  return userService.login(loginDto);
  }
}
