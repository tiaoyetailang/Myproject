<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020/7/18
  Time: 22:05
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<script type="text/javascript" src="static/script/jquery-1.7.2.js"></script>
<script type="text/javascript">
    $(function () {
        $("#abc").click(function () {
            alert("5553")
            var username=$("#username").val();
            var password=$("#password").val();
          $.ajax({
              url:"liang",
              data:{username:username,password:password},
              success:function (data) {
                     if(data){
                         window.location.href="ling";
                     }else alert("错误")
              }

          });


        });


    })


</script>
<body>
<form >
    <input type="text" name="username" id="username"/>
    <input type="text" name="password" id="password">
    <input type="button" value="123" id="abc"/>

    

</form>
</body>
</html>
