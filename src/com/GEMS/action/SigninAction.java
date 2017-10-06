/**
 * 
 */
package com.GEMS.action;

import java.util.HashMap;
import java.util.Map;

import com.GEMS.JSON.SetJsonValue;
import com.GEMS.JSON.USER.SetObjUserValue;
import com.opensymphony.xwork2.ActionSupport;

/**
 * @author Administrator
 * 类描述: 这是进行登录行为的类，根据配置文件的action动作执行特定方法
 *   项目: 毕业生就业管理系统
 */
public class SigninAction extends ActionSupport {
	private String username;
	private String password;
	private int user_type;
	private Map<String, Object> map;
	
	/* (non-Javadoc)
	 * @see com.opensymphony.xwork2.ActionSupport#execute()
	 * 默认执行的方法
	 * 不一定执行
	 */
	@Override
	public String execute() throws Exception {
		System.out.println("执行了execute方法");
		return SUCCESS;
	}
	
	/* (non-Javadoc)
	 * @see com.opensymphony.xwork2.ActionSupport#executeSignin()
	 * struts2指定执行的方法
	 * 一定执行
	 */
	public String executeSignin() throws Exception{
		map=new HashMap<String, Object>();
		SetJsonValue setJsonValue=new SetJsonValue(username,user_type);
		map=setJsonValue.getJsonData();
		System.out.println("执行了executeSignin方法");
		return SUCCESS;
	}
	
	
	/* (non-Javadoc)
	 * @see com.opensymphony.xwork2.ActionSupport#validate()
	 * 拦截器
	 */
	@Override
	public void validate() {
		System.out.println("执行了validate方法");
	}
	
	/**
	 * @return the username
	 * 返回用户账号值
	 */
	public String getUsername() {
		return username;
	}
	/**
	 * @param username the username to set
	 * 设置用户账号值
	 */
	public void setUsername(String username) {
		this.username = username;
	}
	/**
	 * @return the password
	 * 返回用户密码值
	 */
	public String getPassword() {
		return password;
	}
	/**
	 * @param password the password to set
	 * 设置用户密码值
	 */
	public void setPassword(String password) {
		this.password = password;
	}
	/**
	 * @return the user_type
	 * 返回用户类型的代号值
	 */
	public int getUser_type() {
		return user_type;
	}
	/**
	 * @param user_type the user_type to set
	 * 设置用户类型的代号值
	 */
	public void setUser_type(int user_type) {
		this.user_type = user_type;
	}

	/**
	 * @return the map
	 * 返回json的值
	 */
	public Map<String, Object> getMap() {
		return map;
	}

	/**
	 * @param map the map to set
	 * 设置json对象的值
	 */
	public void setMap(Map<String, Object> map) {
		this.map = map;
	}
	
	
}
