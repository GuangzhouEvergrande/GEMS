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
    private Boolean fail;             //判断动作是否失败
    private String message;           //如果失败返回的信息
    
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
    	fail=false;    //成功执行
    	SetObjUserValue setObjUserValue=new SetObjUserValue(newAcc, null, newType);
    	obj=setObjUserValue.getUserObj();
    }
    
    
    //1.判断执行是否成功
    //2.成功就正常调用返回obj对象
    //3.失败就返回失败信息
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
    
  //执行的结果:成功/失败
    public enum Status{
		SUCCESS,FAIL
	}
    
    
}
