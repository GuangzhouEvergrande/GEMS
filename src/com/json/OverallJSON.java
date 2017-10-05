package com.json;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.entity.User;

public class OverallJSON {
	private Map<String, Object> map;
	private List list;
	private String account;
	private String name;
	private int type;
	User user;
	
	public OverallJSON(List newList) {
		map=new HashMap<String, Object>();
		list=newList;
		user=(User)list.get(0);
		account=user.getAccountNum();
		name=user.getName();
		type=user.getType();
	}
	
	public void writeMap() {
		map.put("account", account);
		map.put("name", name);
		map.put("type", type);
	}

	public Map<String, Object> getMap() {
		return map;
	}

	public void setMap(Map<String, Object> map) {
		this.map = map;
	}
	
	
}
