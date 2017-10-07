/**
 * 
 */
package com.GEMS.service;

import java.util.HashMap;
import java.util.Map;

import com.GEMS.JSON.SetJsonValue;
import com.GEMS.dao.UserDAO;
import com.GEMS.entity.User;

/**
 * @author Administrator
 * user业务包括登录、注册
 */
public class UserService {
	Map<String, Object> map;
	private UserDAO userDAO;
	private User user;
	private String account;
	private String password;
	private int type;
	
	public UserService(){
		userDAO=new UserDAO();
		map=new HashMap<String, Object>();
	}
	
	public UserService(String newAcc,String newPsw,int newType){
		userDAO=new UserDAO();
		map=new HashMap<String, Object>();
		this.account=newAcc;
		this.password=newPsw;
		this.type=newType;
	}
	
	//登录方法
	//1.查询数据库中是否存在此用户
	//2.不存在就返回不存在信息
	//3.存在就判断密码和用户类型是否正确
	//4.正确就返回正确登录信息
	//5.不正确就返回密码错误信息
	public Map<String, Object> doSignin() {
		user=userDAO.findById(account);
		if(user==null){
			SetJsonValue setJsonValue=new SetJsonValue(true,"不存在此账号");
			map=setJsonValue.getJsonData();
			System.out.println("不存在此账号");
		}
		else if ((!password.equals(user.getPassword()))||(type!=user.getType())) {
			SetJsonValue setJsonValue=new SetJsonValue(true,"密码错误");
			map=setJsonValue.getJsonData();
			System.out.println("密码错误");
		}
		else{
			System.out.println("登录成功");
			SetJsonValue setJsonValue=new SetJsonValue(user.getAccountNum(),user.getType());
			map=setJsonValue.getJsonData();
		}
		
		return map;
	}
}
