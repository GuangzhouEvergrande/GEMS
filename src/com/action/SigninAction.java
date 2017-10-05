package com.action;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.websocket.Session;

import org.apache.struts2.json.annotations.JSON;

import com.dao.UserDAO;
import com.entity.User;
import com.json.OverallJSON;
import com.opensymphony.xwork2.ActionSupport;
import com.service.SigninService;

import net.sf.json.JSONObject;
import sun.net.www.content.image.jpeg;

public class SigninAction extends ActionSupport {
	private String username;
	private String password;
	private int user_type;
    private Map<String, Object> map;
    private String msg;
    
	@Override
	public String execute() throws Exception {
		return SUCCESS;
	}
	
	@Override
	public void validate() {
		map=new HashMap<String, Object>();
		map.put("msg", "fail");
		map.put("obj", getFieldErrors());
	}

	public String signin() throws Exception {
		SigninService service=new SigninService();
		msg=service.doSignin(username,password,user_type);     //执行数据库查询
		List list=service.getList();//数据库查询到的数据写入List
		getDataToMap(list);         //将返回前台数据写入map
		return SUCCESS;
	}
	
	public String signup() throws Exception{
		SigninService service=new SigninService();
		msg=service.doSignup(username,password,user_type);          //执行注册操作
		getDataToMap(service.getList()); //数据库查询到的数据写入List
		return SUCCESS; 
	}
	
	public void getDataToMap(List list) {
		map=new HashMap<String, Object>();
		map.put("msg", msg);
		if(!list.isEmpty()){
			OverallJSON overallJSON=new OverallJSON(list);
			overallJSON.writeMap();
			map.put("obj", overallJSON.getMap());
		}
		else map.put("obj", "null");
	}

	
	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public Map<String, Object> getMap() {
		return map;
	}


	public void setMap(Map<String, Object> map) {
		this.map = map;
	}

	/**
	 * @return the username
	 */
	public String getUsername() {
		return username;
	}

	/**
	 * @param username
	 *            the username to set
	 */
	public void setUsername(String username) {
		this.username = username;
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password
	 *            the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	public int getUser_type() {
		return user_type;
	}

	public void setUser_type(int user_type) {
		this.user_type = user_type;
	}
    
}
