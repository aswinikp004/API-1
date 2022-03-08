package com.ba.springbootJPADemo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootJpaDemoApplication implements CommandLineRunner{
	
	@Autowired
	private UserRepository userRepository;

	public static void main(String[] args) 
	{
		SpringApplication.run(SpringbootJpaDemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception 
	{
		
		System.out.println("Spring demo");
	List<User> users= userRepository.findAll();
		
		for(User user:users) 
		{
		System.out.println(user);
		}
	}
	
	

	
}
