$(function() {
    $(".practice").focus(function() {
        $(this).css("height", "40px");
    }).blur(function() {
        $(this).css("height", "40px");
    }).keyup(function() {
        var c = $(this).val();
        if (c.length > 10) {
            c = c.substr(0, 10);
            $(this).val(c);
        }
        var last = 10 - c.length;
        $(".xz").text("还能输入" + last + "字");
    })
});