/**
 * 
 */
package com.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.example.repository.AccountRepository;

/**
 * @author NDcruz
 *
 */
@Service
public class AccountUserDetailService implements UserDetailsService {

	private final AccountRepository accountRepository;

	@Autowired
	public AccountUserDetailService(AccountRepository accountRepository) {
		this.accountRepository = accountRepository;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.springframework.security.core.userdetails.UserDetailsService#
	 * loadUserByUsername(java.lang.String)
	 */
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		return this.accountRepository.findByUsername(username)
				.map(account -> new User(account.getUsername(), account.getPassword(), account.isEnabled(),
						account.isAccountNonExpired(), account.isCredentialsNonExpired(), account.isAccountNonLocked(),
						username.equals("admin") ? AuthorityUtils.createAuthorityList("ROLE_ADMIN")
								: AuthorityUtils.createAuthorityList("ROLE_USER")))
				.orElseThrow(() -> new UsernameNotFoundException("Could not find username : " + username));
	}

}
