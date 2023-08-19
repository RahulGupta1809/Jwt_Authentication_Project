package com.example.employee.jpa.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.employee.jpa.model.UserInfo;

public interface UserInfoJpaRepository extends JpaRepository<UserInfo, Integer> {
	Optional<UserInfo> findByName(String username);

}
