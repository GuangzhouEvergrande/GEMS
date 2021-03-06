package com.GEMS.entity;

/**
 * User entity. @author MyEclipse Persistence Tools
 */

public class User implements java.io.Serializable {

	// Fields

	private String accountNum;
	private String password;
	private String name;
	private Integer type;

	// Constructors

	/** default constructor */
	public User() {
	}

	/** minimal constructor */
	public User(String accountNum) {
		this.accountNum = accountNum;
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

}