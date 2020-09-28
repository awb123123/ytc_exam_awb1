<%--
  Created by IntelliJ IDEA.
  User: sfsf
  Date: 2020/9/21
  Time: 10:20
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<table border="1">
    <tr>
        <td>用户id</td>
        <td>用户名称</td>
        <td>用户选择问题1</td>
        <td>用户答案1</td>
        <td>用户选择问题2</td>
        <td>用户答案2</td>
        <td>用户选择问题3</td>
        <td>用户答案3</td>
        <td>用户身份证正面</td>
        <td>用户身份证反面</td>
    </tr>
    <c:forEach items="${page.list}" var="l">
        <tr>
            <td>${l.userid}</td>
            <td>${l.username}</td>
            <td>${l.problem1.problemname}</td>
            <td>${l.useranswerone}</td>
            <td>${l.problem2.problemname2}</td>
            <td>${l.useranswertwo}</td>
            <td>${l.problem3}</td>
            <td>${l.useranswerthree}</td>
            <td>${l.userimgone}</td>
            <td>${l.userimgtwo}</td>
        </tr>




    </c:forEach>


</table>
<jsp:include page="/common/page.jsp"></jsp:include>
</body>
</html>
