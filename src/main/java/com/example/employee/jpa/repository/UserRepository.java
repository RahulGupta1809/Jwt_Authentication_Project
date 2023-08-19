package com.example.employee.jpa.repository;

import com.example.employee.jpa.dto.ResponseDto;

public interface UserRepository {
	ResponseDto getUser(int userId);

}
