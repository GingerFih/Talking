$(function () {
    var account = $.cookie("account");
    console.log(account)
    let url = "/Talking/login/findUser"
    let data = {"account": account}
    AJAX.get(url, data, function (data) {
        console.log(data)
        console.log(data[0].account)

        var html = '';
        html += '<div class="row">';

        html += '<div class="column" style="background:#FFF0F5">';
        html += '<p style="color: #87CEFA; "> 个人信息 </p>';
        html += '<p style="color: #000000; ">姓名：' + data[0].username + '</p>';
        html += '<p style="color: #000000; "> 性别：' + data[0].sex + '</p>';
        html += '<p style="color: #000000; "> 年龄：' + data[0].age + '</p>';
        html += '<p style="color: #000000; "> 个性签名：' + data[0].signature + '</p>';
        html += '<p style="color: #000000; "> 手机号：' + data[0].phone + '</p>';
        html += '</div>';

        html += '<div class="column" style="background:#FFF0F5">';
        html += '<p style="color: #87CEFA;">头像 </p>';
        /*头像url需要修改*/
        html += '<img src="../sources/images/' + data[0].imgurl + '" style="width: 200px;height: 180px; left: 60%;top: 23%">';
        html += '<br><span id="uploadImg" style="font-size:12px; overflow:hidden; position:absolute">';
        html += '<input type="file" id="upload" onchange="m1()" size="1" style="position:absolute; z-index:100; margin-left:-180px; font-size:60px;opacity:0;filter:alpha(opacity=0); margin-top:-5px;">';
        html += '<a href="#">修改头像</a> </span>';


        // html+='<input id="upload" type="file" onchange="m1()" /> ';
        html += '<br><div style="width:204px;height:204px;display:none">' +
            '<img id="image1" src="../sources/images/aac.png" style="width:200px;height:200px;margin-left:2px;margin-top:2px;display:none" mmm="7767j" /></div>';
        html += '<br><div><input type="button" value="修改" id="add" onclick="add(' + data[0].id + ')"></div>';
        html += '</div>';

        html += '</div>';

        html += ' <div class="column_all" style="background:#FFF0F5">';

        html += '<div style="margin-left:23%">';
        html += '<p style="color: #87CEFA;">账号设置 </p>';
        html += '<p style="color: #000000;left:30% "> 账号：' + data[0].account + '</p>';
        html += '<p style="color: #000000;left:30%"> 密码：' + data[0].password + '</p>';

        html += '<div class="list">';
        html += '<span style="color: #A52A2A;left:60%;top:10%">';
        html += '<li><i class="fa-li fa fa-soccer-ball-o"><input type="button" value="修改密码" onclick="showupdate(\''+data[0].account+'\')"> </li>';
        html += '</span>';
        html += '</div>';

        html += '</div>';

        html += '</div>';

        $("#inf").empty().append(html);
    });
})
var basedata;
var urlss;

function m1() {
    var xx = document.getElementById("upload");
    var xx2 = xx.files;
    var imgReaderl = new FileReader();
    imgReaderl.onload = function (evt) {
        var base64str = evt.target.result;		//图片base64
        var xx4 = document.getElementById("image1");
        xx4.src = base64str;
        basedata = base64str;
        console.info(basedata);
    }
    imgReaderl.readAsDataURL(xx2[0]);
}

function add(id) {
    let url="/Talking/login/update1";
    let data={"imgurl": basedata, "id": id};
    AJAX.post(url,data,function (data) {
        console.log(data);
    })
}
function showupdate(account) {
    document.getElementById("updatepass").style.display="block";
    $("#account_id").val(account)
}
function updatepas() {
    document.getElementById("updatepass").style.display="none";
    var account=$("#account_id").val();
    var password=$("#password").val();
    var newpasword=$("#newpassword").val();
    if(password == null||password == ''){
        alert("请输入你的密码");
    }else if(newpasword == null||newpasword == ''){
        alert("新密码不能为空");

    }
    let url="/Talking/login/update"
    let data={"account":account,"password":newpasword};
    AJAX.get(url,data,function (data) {
        console.log(data)
        alert("密码修改成功，请重新登录")
    })
}

    
