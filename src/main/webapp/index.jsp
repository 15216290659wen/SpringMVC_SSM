
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>

<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<html>
<script type="text/javascript" src="js/jquery-1.8.3.js"></script>
<script type="text/javascript">

    $(function(){
        alert("231231");
        window.location.href="${pageContext.request.contextPath}/ui/loginPwd";
    })
</script>
<script type="text/javascript">
    var search = window.location.search;
    var msg = "";
    if(search.indexOf("?msg=")>=0){
        msg = decodeURI(search.split("?msg=")[1]);
    }
    if(msg != ""){
        alert(msg);
    }
</script>
<body>
</body>
</html>
