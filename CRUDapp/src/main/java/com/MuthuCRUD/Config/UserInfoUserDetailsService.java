package com.MuthuCRUD.Config;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import com.MuthuCRUD.dao.UserDAO;
import com.MuthuCRUD.model.Userinfo;
public class UserInfoUserDetailsService implements UserDetailsService {
	@Autowired
	private UserDAO repository; 

	@Override
	public UserDetails loadUserByUsername(String name) throws UsernameNotFoundException {
		Optional<Userinfo> userInfo=repository.findByName(name);
		return userInfo.map(UserInfoUserDetails::new)
		.orElseThrow(()->new UsernameNotFoundException("User not found"+ name));
	}
}

