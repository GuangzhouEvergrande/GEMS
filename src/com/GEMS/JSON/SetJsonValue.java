/**
 * 
 */
package com.GEMS.JSON;

import java.util.HashMap;
import java.util.Map;

import com.GEMS.JSON.USER.SetObjUserValue;

/**
 * @author Administrator
 *统一返回前端的json对象
 */
public class SetJsonValue {
    private Map<String, Object> map;  //返回前端的json数据    
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
    
  //执行的结果:成功/失败
    public enum Status{
		SUCCESS,FAIL
	}
    
    
}
