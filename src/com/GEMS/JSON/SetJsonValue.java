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
    private Boolean fail;             //�ж϶����Ƿ�ʧ��
    private String message;           //���ʧ�ܷ��ص���Ϣ
    
    public SetJsonValue(){
    	map=new HashMap<String, Object>();
    	obj=new HashMap<String, Object>();
    }
    
    public SetJsonValue(Boolean fail,String message) {
		map=new HashMap<String, Object>();
		this.fail=fail;
		this.message=message;
	}
    
    public SetJsonValue(String newAcc,int newType){
    	map=new HashMap<String, Object>();
    	obj=new HashMap<String, Object>();
    	fail=false;    //�ɹ�ִ��
    	SetObjUserValue setObjUserValue=new SetObjUserValue(newAcc, null, newType);
    	obj=setObjUserValue.getUserObj();
    }
    
    
    //1.�ж�ִ���Ƿ�ɹ�
    //2.�ɹ����������÷���obj����
    //3.ʧ�ܾͷ���ʧ����Ϣ
    public Map<String, Object> getJsonData() {
    	if(fail){
    		map.put("status", Status.FAIL);
    		map.put("message", message);
    	}
    	else {
    		map.put("status", Status.SUCCESS);
        	map.put("obj", obj);
		}
		return map;
	}
    
  //ִ�еĽ��:�ɹ�/ʧ��
    public enum Status{
		SUCCESS,FAIL
	}
    
    
}
