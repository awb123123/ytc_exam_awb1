<%--
  Created by IntelliJ IDEA.
  User: sfsf
  Date: 2020/9/21
  Time: 9:36
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>

<script type="text/javascript" src="<%=request.getContextPath()%>/js/jquery.min.js"></script>
<body>
<form id="queryForm">
   <input type="hidden" name="cpage" id="currPage">
    <div id="getForm">

    </div>


</form>
</body>
<script>
    $(function () {
        serach(1);
    })
function serach(cpage) {
$("#currPage").val(cpage)
    $.ajax({
        url:"<%=request.getContextPath()%>/user/queryUserList.do",
        type:"post",
        data:$("#queryForm").serialize(),
        datatype:"html",
        success:function (data) {
            $("#getForm").html(data);
        },error:function () {
                alert("shibai")
        }





    })



}


</script>
</html>
