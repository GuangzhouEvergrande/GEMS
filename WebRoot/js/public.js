class RequestData{
	static getData(thisURL,params){
		$.ajax({
        type: "POST",//请求方式为post
        url: thisURL,//地址为请求的action(.action结尾)
        data: params,//Ajax数据为所需要的参数
        dataType:"text", //ajax返回值设置为text（json格式也可用它返回，可打印出结果，也可设置成json）
        success: function(json){  //一般为成功
        	
          },
        error: function(json){//失败
        	
          }
        });
	}
}