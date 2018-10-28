package com.getyourpixel.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.getyourpixel.domain.MyUser;

public interface MyUserRepository extends JpaRepository<MyUser, Long> {

	Optional<MyUser> findByUsername(String username);

}
