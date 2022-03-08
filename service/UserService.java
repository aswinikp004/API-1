package com.ba.LoginApp.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.ba.LoginApp.dto.LoginDto;
import com.ba.LoginApp.dto.LoginResponseDto;
import com.ba.LoginApp.model.User;
import com.ba.LoginApp.repository.UserRepository;

public class UserService 
{
	@Autowired
	UserRepository userRepository;
	
	public LoginResponseDto login (LoginDto loginDto)
	{
		LoginResponseDto loginResponseDto= new LoginResponseDto();
		 String username=loginDto.getUsername(); 
		 String password=loginDto.getPassword();
		  
		  User user= userRepository.findByUsername(username);
		  String usernameFromDB=user.getUsername();
		  
		  if(user==null)
		  {
			  loginResponseDto.setStatus("401");
			  loginResponseDto.setMessage("User not found");
		  }
		  String psswordFromDb=user.getPassword();
		  
		  if(password.equals(psswordFromDb))
		  {
			  loginResponseDto.setStatus("200");
			  loginResponseDto.setMessage("authorized");
		  }
		  
		  else if(!password.equals(psswordFromDb))
		  {
			  loginResponseDto.setStatus("401");
			  loginResponseDto.setMessage("Unauthorized");
		  }
		  else
		  {
			  loginResponseDto.setStatus("500");
			  loginResponseDto.setMessage("Internal server error");
		  }
		  
				  
		return loginResponseDto;
	}

}


 
 