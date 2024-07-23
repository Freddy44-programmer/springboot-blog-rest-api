package com.springboot.blog.service;

import com.springboot.blog.dto.auth.LoginDto;
import com.springboot.blog.dto.auth.SignupDto;

public interface AuthService {
    String login(LoginDto loginDto);

    String signup(SignupDto signupDto);
}
