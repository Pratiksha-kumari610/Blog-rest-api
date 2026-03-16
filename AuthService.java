package com.thepratiksha.blog.rest.api.service;

import com.thepratiksha.blog.rest.api.payload.LoginDto;
import com.thepratiksha.blog.rest.api.payload.RegisterDto;

public interface AuthService {
    String login(LoginDto loginDto);
    String register(RegisterDto registerDto);
}
