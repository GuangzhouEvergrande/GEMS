package com.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 * User entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name="user")
public class User implements java.io.Serializable {

	// Fields
	@Id @Column(name="account_num")
	private String accountNum;
	private String password;
	private String name;
	private Integer type;
	
	@OneToOne(targetEntity=PersonalUser.class,mappedBy="user")
	private PersonalUser personalUser;

	// Constructors

	/** default constructor */
	public User() {
	}

	/** minimal constructor */
	public User(String accountNum, String password, Integer type) {
		this.accountNum = accountNum;
		this.password = password;
		this.type = type;
	}

	/** full constructor */
	public User(String accountNum, String password, String name, Integer type) {
		this.accountNum = accountNum;
		this.password = password;
		this.name = name;
		this.type = type;
	}

	// Property accessors

	public String getAccountNum() {
		return this.accountNum;
	}

	public void setAccountNum(String accountNum) {
		this.accountNum = accountNum;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getType() {
		return this.type;
	}

	public void setType(Integer type) {
		this.type = type;
	}
    
	@OneToOne(targetEntity=PersonalUser.class,mappedBy="user")
	public PersonalUser getPersonalUser() {
		return personalUser;
	}

	public void setPersonalUser(PersonalUser personalUser) {
		this.personalUser = personalUser;
	}
    
}