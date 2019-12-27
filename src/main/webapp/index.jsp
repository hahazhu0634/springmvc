<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 2019/12/20
  Time: 10:24
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>springMvc</title>
</head>
<body>
<h1>SpringMvc学习</h1>
<a href="/user/requestMappingTest.html">requestMappingTest</a>
<a href="/user/requestMappingTest2.html">requestMappingTest</a>

<h3>资料提交</h3>
<form action="/user/requestMappingTest4.html" method="post">
    性别:<input type="text" name="sex"><br/>
    用户名:<input type="text" name="list[0].username"><br/>
    年龄:<input type="text" name="list[0].age"><br/>
    部门:<input type="text" name="list[0].dept.deptName"><br/>
    部门ID：<input type="text" name="list[0].dept.deptId"><br/>
    部门电话:<input type="text" name="list[0].dept.addr.tel"><br/>
    部门code:<input type="text" name="list[0].dept.addr.zoneCode"><br/>

    用户名1:<input type="text" name="map['one'].username"><br/>
    年龄2:<input type="text" name="map['one'].age"><br/>
    <input type="submit" value="提交">

</form>
</body>
</html>
