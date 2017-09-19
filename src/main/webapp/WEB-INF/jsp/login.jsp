<%--
  Created by IntelliJ IDEA.
  User: ZHIWEN
  Date: 2017/9/13
  Time: 17:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
  <h1> 跳转成功</h1>
</body>
<script type="text/javascript" src="/js/jquery-1.8.3.js"></script>
<script type="text/javascript">
$(function () {

    $.ajax({
        url: "${pageContext.request.contextPath}/test/one",

        type: "post",

        async: true,

        data:{},

        dataType: "json",

        timeout: 1000,

        error: function(){},

        success: function(data){


           if(data!=null&&data!=""){
               alert(data.date.calssId);
           }
        }

    });

})
</script>
</html>
