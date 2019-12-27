
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>结果</title>
</head>
<body>
<h1>结果集</h1>
姓名:${user.username}
部门:${user.dept.deptName}
部门电话:${user.dept.addr.tel}
${sex}
</body>
</html>
