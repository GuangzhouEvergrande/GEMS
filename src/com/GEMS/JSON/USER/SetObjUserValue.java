/**
 * 
 */
package com.GEMS.JSON.USER;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Administrator
 * ����ǰ�˵�json�������и�obj����
 * ����һ���û�user����
 * �������˺š��û����͡��ǳ�
 */
public class SetObjUserValue {
	private String acc_num;
	private String name;
	private int type;
	private Map<String, Object> userMap;
	
	public SetObjUserValue(){
		userMap=new HashMap<String, Object>();
	}
	
	public SetObjUserValue(String newAcc,String newName,int newType){
		userMap=new HashMap<String, Object>();
		this.acc_num=newAcc;
		this.name=newName;
		this.type=newType;
	}
	
	public Map<String, Object> getUserObj() {
		userMap.put("acc_num", acc_num);
		userMap.put("name", name);
		userMap.put("type", type);
		return userMap;
	}
	
	public String getAcc_num() {
		return acc_num;
	}
	public void setAcc_num(String acc_num) {
		this.acc_num = acc_num;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getType() {
		return type;
	}
	public void setType(int type) {
		this.type = type;
	}
	public Map<String, Object> getUserMap() {
		return userMap;
	}
	public void setUserMap(Map<String, Object> userMap) {
		this.userMap = userMap;
	}
	
}
