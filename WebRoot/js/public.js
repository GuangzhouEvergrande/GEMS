class RequestData {
    static getData(thisURL, params,callback) {
        $.ajax({
            type: "POST", //请求方式为post
            url: thisURL, //地址为请求的action(.action结尾)
            data: params, //Ajax数据为所需要的参数
            dataType: "text", //ajax返回值设置为text（json格式也可用它返回，可打印出结果，也可设置成json）
            success: function(json) { //一般为成功
                const res = $.parseJSON(json); //使用这个方法解析json
                callback(res);
            },
            error: function(json) { //失败
                const res = $.parseJSON(json); //使用这个方法解析json
                callback(res);
            }
        });
    }
}

$(document).ready(function(){
	const input_div=`<div class="input-div">
        <input type="button" class="signin" value="登录">
        <input type="button" class="signup" value="注册">
        <input type="button" class="consult-employment" value="咨询职位">
        <input type="button" class="personal-space" value="用户空间">
    </div>`;
    $('div').remove('.input-div');
    $('body').prepend(input_div);
});