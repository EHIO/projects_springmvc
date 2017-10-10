<%@ page language="java" pageEncoding="UTF-8" contentType="text/html; charset=UTF-8" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
    <base href="<%=basePath%>">

    <title>My JSP 'index.jsp' starting page</title>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <meta http-equiv="pragma" content="no-cache">
    <meta http-equiv="cache-control" content="no-cache">
    <meta http-equiv="expires" content="0">
    <meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
    <meta http-equiv="description" content="This is my page">
    <!--
    <link rel="stylesheet" type="text/css" href="styles.css">
    -->

    <script type="text/javascript" src="${pageContext.request.contextPath}/asset/js/jquery-1.10.2.js"></script>
</head>

<body>
This is my JSP page. <br>


<form action="${pageContext.request.contextPath}/test.action" method="post">
    <input type="text" name="username" value="中国">
    <input type="submit" value="提交">
</form>
</body>

<script>
    /*$.ajax({
        type:'post',
        dataType:'json',
        url: "/springmvc_helloworld/test.action",
        data:{username:"中国"},
        async : false,
        success: function (d) {
            debugger;
            //根据后台返回结果判定是否有访问权限，提示web前端信息
            alert(d);
        }
    });*/
</script>
</html>
