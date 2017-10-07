$(document).ready(function(){
    $('.sub').click(function(){
      var params = {
        username : $(".username").val(),
        password : $(".password").val(),
        user_type: $('.user_type').val()
      };
      RequestData.getData(url,params,function(json){
          const res = $.parseJSON(json);  //使用这个方法解析json
          console.log(res.status);
        });
      return false;
    });
  });