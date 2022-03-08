package com.ba.LoginApp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ba.LoginApp.model.User;

public interface UserRepository extends JpaRepository<User, Integer>
{
   User findByUsername(String username);
}
