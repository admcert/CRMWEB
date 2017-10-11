package com.sjy.service;


import com.sjy.entities.User;
import com.sjy.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

/**
 * 自定义CustomUserService，实现UserDetailsService接口
 * @author Administrator
 *
 */
public class CustomUserService implements UserDetailsService{ 
	
	@Autowired
	UserRepository userRepository;
	
	/**
	 * 重写loadUserByUsername方法获得正在登陆用户
	 */
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

		User user=userRepository.findByAccount(username);
		if (user==null) {
			throw new UsernameNotFoundException("该用户不存在");
		}
	
		return new org.springframework.security.core.userdetails.User(user.getUsername(), user.getPassword(), user.getAuthorities());
	}
}
