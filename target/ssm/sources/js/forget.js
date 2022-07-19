function sendverCode() {

    var phone = $("#phone").val();
    console.log(phone)
    let url="/Talking/vcode/sendvcode";
    let data={"phone":phone};
    AJAX.get(url,data,function (data) {
        console.log(data);
        alert("验证码发送成功");
    })
}

function get() {
    console.log("-----");
    var verification = $("#verification").val();
    var password = $("#password").val();
    var account = $("#account").val();
    var phone = $("#phone").val();
    let url2 = "/Talking/vcode/comperCode";
    let data2 = {
        "phone": phone,
        "textCode": verification
    };
    AJAX.get(url2, data2, function (data) {
        if(data==1){
        console.log(phone)
        let url = "/Talking/login/findF";
        let data4 = {"phone": phone, "account": account};
        AJAX.get(url, data4, function (data) {

            console.log(data);
            let url1 = "login/update";
            let data1 = {"account": account, "password": password};
            if (data.code == 200) {
                AJAX.get(url1, data1, function (data) {
                    console.log(data)
                    if (data.code == 0) {
                        alert("找回成功");
                        window.location.href = "index.html";
                    } else {
                        alert("你找回失败")
                    }
                })
            } else {
                alert("你输入的手机号和用户名不匹配")
            }
        })
    } else if(data==0){
            alert("验证码已超时")
        }else{
            alert("验证码错误！！")
        }
    })
}


