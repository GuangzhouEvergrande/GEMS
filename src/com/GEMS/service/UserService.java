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
 * userҵ�������¼��ע��
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
	
	//��¼����
	//1.��ѯ���ݿ����Ƿ���ڴ��û�
	//2.�����ھͷ��ز�������Ϣ
	//3.���ھ��ж�������û������Ƿ���ȷ
	//4.��ȷ�ͷ�����ȷ��¼��Ϣ
	//5.����ȷ�ͷ������������Ϣ
	public Map<String, Object> doSignin() {
		user=userDAO.findById(account);
		if(user==null){
			SetJsonValue setJsonValue=new SetJsonValue(true,"�����ڴ��˺�");
			map=setJsonValue.getJsonData();
			System.out.println("�����ڴ��˺�");
		}
		else if ((!password.equals(user.getPassword()))||(type!=user.getType())) {
			SetJsonValue setJsonValue=new SetJsonValue(true,"�������");
			map=setJsonValue.getJsonData();
			System.out.println("�������");
		}
		else{
			System.out.println("��¼�ɹ�");
			SetJsonValue setJsonValue=new SetJsonValue(user.getAccountNum(),user.getType());
			map=setJsonValue.getJsonData();
		}
		
		return map;
	}
}
