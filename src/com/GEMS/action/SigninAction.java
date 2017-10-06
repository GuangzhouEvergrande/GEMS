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
 * ������: ���ǽ��е�¼��Ϊ���࣬���������ļ���action����ִ���ض�����
 *   ��Ŀ: ��ҵ����ҵ����ϵͳ
 */
public class SigninAction extends ActionSupport {
	private String username;
	private String password;
	private int user_type;
	private Map<String, Object> map;
	
	/* (non-Javadoc)
	 * @see com.opensymphony.xwork2.ActionSupport#execute()
	 * Ĭ��ִ�еķ���
	 * ��һ��ִ��
	 */
	@Override
	public String execute() throws Exception {
		System.out.println("ִ����execute����");
		return SUCCESS;
	}
	
	/* (non-Javadoc)
	 * @see com.opensymphony.xwork2.ActionSupport#executeSignin()
	 * struts2ָ��ִ�еķ���
	 * һ��ִ��
	 */
	public String executeSignin() throws Exception{
		map=new HashMap<String, Object>();
		SetJsonValue setJsonValue=new SetJsonValue(username,user_type);
		map=setJsonValue.getJsonData();
		System.out.println("ִ����executeSignin����");
		return SUCCESS;
	}
	
	
	/* (non-Javadoc)
	 * @see com.opensymphony.xwork2.ActionSupport#validate()
	 * ������
	 */
	@Override
	public void validate() {
		System.out.println("ִ����validate����");
	}
	
	/**
	 * @return the username
	 * �����û��˺�ֵ
	 */
	public String getUsername() {
		return username;
	}
	/**
	 * @param username the username to set
	 * �����û��˺�ֵ
	 */
	public void setUsername(String username) {
		this.username = username;
	}
	/**
	 * @return the password
	 * �����û�����ֵ
	 */
	public String getPassword() {
		return password;
	}
	/**
	 * @param password the password to set
	 * �����û�����ֵ
	 */
	public void setPassword(String password) {
		this.password = password;
	}
	/**
	 * @return the user_type
	 * �����û����͵Ĵ���ֵ
	 */
	public int getUser_type() {
		return user_type;
	}
	/**
	 * @param user_type the user_type to set
	 * �����û����͵Ĵ���ֵ
	 */
	public void setUser_type(int user_type) {
		this.user_type = user_type;
	}

	/**
	 * @return the map
	 * ����json��ֵ
	 */
	public Map<String, Object> getMap() {
		return map;
	}

	/**
	 * @param map the map to set
	 * ����json�����ֵ
	 */
	public void setMap(Map<String, Object> map) {
		this.map = map;
	}
	
	
}
