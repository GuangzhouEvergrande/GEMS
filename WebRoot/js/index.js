
$(document).ready(function() {
    $('.sub').click(function() {
        var params = {
            username: $(".username").val(),
            password: $(".password").val(),
            user_type: $('.user_type').val()
        };
        const loginURL="login1.action";

        RequestData.getData(loginURL, params, function(res) {
            console.log(res)
        });
        return false;
    });
});