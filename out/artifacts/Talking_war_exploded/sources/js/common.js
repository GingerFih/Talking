var AJAX  = {
    get:function (url,data,func) {
        $.ajax({
            headers:{token:"abc"},
            url:url,
            data:data,
            typr:"get",
            success:function (data) {
                func(data);
            },
            error:function () {
                alert("出错了，请联系管理员");
            }
        })
    },
    post:function (url,data,func) {
        $.ajax({
            url:url,
            data:data,
            typr:"post",
            success:function (data) {
                func(data);
            },
            error:function () {
                alert("出错了，请联系管理员");
            }
        })
    }
}