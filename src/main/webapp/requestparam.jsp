<%--
  Created by IntelliJ IDEA.
  User: xiaoxiao
  Date: 2019/8/31
  Time: 15:35
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>

</head>
<body>
<h3>RequestParam</h3>
<a href="anno/testRquestparam?name=nihao">Requestparam</a>
<form action="anno/testRquestBody" method="post">
    用户姓名:<input type="text" name="username"/><br>
    用户年龄:<input type="text" name="age"/><br>
    <input type="submit" value="提交">

</form>
</body>
</html>
