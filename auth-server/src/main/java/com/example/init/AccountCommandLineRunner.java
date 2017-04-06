/**
 * 
 */
package com.example.init;

import java.util.Date;
import java.util.stream.Stream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import com.example.entity.Account;
import com.example.repository.AccountRepository;

/**
 * @author NDcruz
 *
 */
@Profile("default")
@Component
public class AccountCommandLineRunner implements CommandLineRunner {

	private final AccountRepository accountRepository;

	@Autowired
	public AccountCommandLineRunner(AccountRepository accountRepository) {
		this.accountRepository = accountRepository;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.springframework.boot.CommandLineRunner#run(java.lang.String[])
	 */
	@Override
	public void run(String... args) throws Exception {
		Stream.of("user,password", "admin,admin").map(tupl -> tupl.split(",")).forEach(tuple -> accountRepository
				.save(new Account(tuple[0], tuple[1], true, true, true, true, new Date(), null)));
	}

}
