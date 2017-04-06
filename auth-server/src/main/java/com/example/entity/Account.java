/**
 * 
 */
package com.example.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Data;

/**
 * @author NDcruz
 *
 */
@Data
@Entity
public class Account {

	@Id @GeneratedValue
	private Long id;
	private String username;
	private String password;
	private boolean accountNonExpired;
	private boolean accountNonLocked;
	private boolean credentialsNonExpired;
	private boolean enabled;
	private Date createDate;
	private Date updateDate;
	
	
	public Account(){
		//Why JPA why?
	}
	
	public Account(String username, String password, boolean accountNonExpired, boolean accountNonLocked,
			boolean credentialsNonExpired, boolean enabled, Date createDate, Date updateDate) {
		super();
		this.username = username;
		this.password = password;
		this.accountNonExpired = accountNonExpired;
		this.accountNonLocked = accountNonLocked;
		this.credentialsNonExpired = credentialsNonExpired;
		this.enabled = enabled;
		this.createDate = createDate;
		this.updateDate = updateDate;
	}
	
	
	
	
	
}
