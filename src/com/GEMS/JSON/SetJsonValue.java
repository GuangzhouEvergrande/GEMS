/**
 * 
 */
package com.GEMS.JSON;

import java.util.HashMap;
import java.util.Map;

import com.GEMS.JSON.USER.SetObjUserValue;

/**
 * @author Administrator
 *ͳһ����ǰ�˵�json����
 */
public class SetJsonValue {
    private Map<String, Object> map;  //����ǰ�˵�json����    
    private Map<String, Object> obj;
    
    public SetJsonValue(){
    	map=new HashMap<String, Object>();
    	obj=new HashMap<String, Object>();
    }
    
    public SetJsonValue(String newAcc,int newType){
    	map=new HashMap<String, Object>();
    	obj=new HashMap<String, Object>();
    	SetObjUserValue setObjUserValue=new SetObjUserValue(newAcc, null, newType);
    	obj=setObjUserValue.getUserObj();
    }
    
    public Map<String, Object> getJsonData() {
    	map.put("status", Status.SUCCESS);
    	map.put("obj", obj);
		return map;
	}
    
  //ִ�еĽ��:�ɹ�/ʧ��
    public enum Status{
		SUCCESS,FAIL
	}
    
    
}
