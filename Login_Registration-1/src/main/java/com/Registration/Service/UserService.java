package com.Registration.Service;

import org.springframework.security.core.userdetails.UserDetailsService;

import com.Registration.Web.dto.UserRegistrationDto;
import com.Registration.model.User;

public interface UserService extends UserDetailsService {
	User save(UserRegistrationDto registrationDto);

}
