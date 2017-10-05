package com.service;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

import com.dao.UserDAO;
import com.entity.User;


public class SigninService {
	private UserDAO userDAO;
	private User user;
	private List list;
	
	public SigninService() {
		userDAO=new UserDAO();
		list=new ArrayList();
	}
	
	//执行登录操作
	//1.根据账号查询是否存在此账号
	//2.判断返回数据是否为空
	//3.返回数据不为空则判断密码是否正确
	//4.根据结果返回提示信息
	public String doSignin(String username,String password,int type) {
		user=userDAO.findById(username);
		if(user!=null){
			if(password.equals(user.getPassword())&&(type==user.getType()))
				return "登录成功";
			return "账号或者密码错误";
		}
		return "此账号不存在";
	}
	
	//查询数据库所有数据
	public void getAll() {
		list=userDAO.findAll();
	}
	
	//根据用户类型查询数据
	private void getByType(int type) {
		list=userDAO.findByType(type);
	}
	
	//执行注册信息
	//1.根据账号来得到是否存在此用户
	//2.返回信息为空则可以执行注册操作
	//3.返回信息不为空则返回提示信息
	public String doSignup(String username,String password,int type) {
		user=userDAO.findById(username);//先判断是否存在此账号
		if(user==null){                 //为空则执行注册流程
			user=new User();
			user.setAccountNum(username);
			user.setPassword(password);
			user.setType(type);
			userDAO=new UserDAO();
			userDAO.save(user);        //保存注册信息
			list.add(user);
			return "注册成功";         //返回成功信息
		}
		else {
			return "账号已存在";       //返回账号存在信息
		}
	}
	
	public Boolean isEmptyBoolean() {
		if(list.isEmpty()) return true;
		return false;
	}
	
	public String judgeList() {
		if(!list.isEmpty()) return "success";
		return "查询不到数据";
	}
	
	public List getList() {
		return list;
	}
	
}
