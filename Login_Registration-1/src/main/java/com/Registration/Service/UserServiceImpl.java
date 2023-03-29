package com.Registration.Service;

import java.util.Arrays;
import java.util.Collection;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.Registration.Repository.UserRepository;
import com.Registration.Web.dto.UserRegistrationDto;
import com.Registration.model.User;
import com.Registration.model.Role;



@Service
public class UserServiceImpl implements UserService {
	
	private UserRepository userRepository;
	
	@Autowired
	private BCryptPasswordEncoder passwordEncoder;
	
	
	public UserServiceImpl(UserRepository userRepository) {
		super();
		this.userRepository=userRepository;
	}

	
	
	@Override
	public User save(UserRegistrationDto registrationDto) {
		BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
		String encodePWD = passwordEncoder.encode(registrationDto.getPassword());
		registrationDto.setPassword(encodePWD);
		User user= new User(registrationDto.getName(),
					registrationDto.getUsername(), 
					passwordEncoder.encode(registrationDto.getPassword()), 
					Arrays.asList(new Role("Role_USER")));
		return userRepository.save(user);
		

	}



	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		User user = userRepository.findByUsername(username);
		if(user==null) {
			throw new UsernameNotFoundException("Invalid Username or password.");
		}
		return new org.springframework.security.core.userdetails.User(user.getUsername(),user.getPassword(),mapRoleGrantedAuthorities(user.getRole()));
	}
	
	
	
	private Collection<? extends GrantedAuthority> mapRoleGrantedAuthorities(Collection<Role> roles){
		return roles.stream()
		.map(role -> new SimpleGrantedAuthority(role.getName()))
		.collect(Collectors.toList());
		//return roles.stream().map(role --> new SimpleGrantedAuthority(role.getName())).collect(Collectors.toList());
 

		 
	}
}