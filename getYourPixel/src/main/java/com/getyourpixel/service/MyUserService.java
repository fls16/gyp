package com.getyourpixel.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.getyourpixel.domain.MyUser;
import com.getyourpixel.repository.MyUserRepository;

@Service
public class MyUserService {

	@Autowired
	private MyUserRepository myUserRepository;

	public Optional<MyUser> findByUsername(String username) {
		return myUserRepository.findByUsername(username);
	}

}
