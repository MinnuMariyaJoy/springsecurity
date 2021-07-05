package com.myprojects.springmvc.service;

import com.myprojects.springmvc.sharedDto.UserDto;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface UserService extends UserDetailsService {
    UserDto createUser(UserDto user);
    UserDto getUSer(String email);
    UserDto getUserByUserId(String userId);

}
