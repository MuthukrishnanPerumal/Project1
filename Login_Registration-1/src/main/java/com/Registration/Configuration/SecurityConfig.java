package com.Registration.Configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.security.SecurityProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.ldap.EmbeddedLdapServerContextSourceFactoryBean;
import org.springframework.security.config.ldap.LdapBindAuthenticationManagerFactory;
import org.springframework.security.core.userdetails.MapReactiveUserDetailsService;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

import com.Registration.Service.UserService;

@Configuration
@EnableWebSecurity
public class SecurityConfig {
	
	@Autowired
	private UserService userService;
	
	@Bean
	public BCryptPasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}
		    @Bean
	    public AuthenticationManager authenticationManager(HttpSecurity http, BCryptPasswordEncoder bCryptPasswordEncoder, UserDetailsService userDetailService) 
	      throws Exception {
	        return http.getSharedObject(AuthenticationManagerBuilder.class)
	          .userDetailsService(userDetailService)
	          .passwordEncoder(bCryptPasswordEncoder)
	          .and()
	          .build();
	    }

	
	@Bean
	public DaoAuthenticationProvider daoAuthenticationProvider() {
		DaoAuthenticationProvider auth =new DaoAuthenticationProvider();
		auth.setUserDetailsService(userService);
		auth.setPasswordEncoder(passwordEncoder());
		return auth;
	}
	 /*@Bean
	 public void configure(AuthenticationManagerBuilder auth) throws Exception {
	     auth
	         .userDetailsService(new MapReactiveUserDetailsService(this.mongoTemplate))
	         .passwordEncoder(new BCryptPasswordEncoder(256));
	 }*/
	
	@Bean
	public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
		http.csrf().disable()
		.authorizeHttpRequests()
		.requestMatchers("/registration","/js/**","/css/**","/img/**").permitAll()
		.anyRequest().authenticated()
		.and().formLogin()
		.loginPage("/login").permitAll()
		.and()
		.logout()
		.invalidateHttpSession(true)
		.clearAuthentication(true)
		.logoutRequestMatcher(new AntPathRequestMatcher("/logout"))
		.logoutSuccessUrl("/login?logout").permitAll();
		return http.build();
		}
	

}
