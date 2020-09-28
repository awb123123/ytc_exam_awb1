<%--
  Created by IntelliJ IDEA.
  User: sfsf
  Date: 2020/9/21
  Time: 11:22
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>

    <link rel="stylesheet" href="<%=request.getContextPath()%>/js/kindeditor-4.1.10/themes/default/default.css" />
    <link rel="stylesheet" href="<%=request.getContextPath()%>/js/uploadify/uploadify.css">
</head>

<script type="text/javascript" src="<%=request.getContextPath()%>/js/jquery.min.js"></script>
<script src="<%=request.getContextPath()%>/js/kindeditor-4.1.10/kindeditor-all.js"></script>
<script type="text/javascript" src="<%=request.getContextPath()%>/js/uploadify/jquery.uploadify.min.js"></script>

<body>
<form id="regiForm">
    用户名：<input type="text" name="username"><br>
    密码：<input type="password" name="userpwd"><br>
    问题一：<select name="problem1">
    <option value="">qxz</option>
    <c:forEach items="${problem1}" var="p">
        <option value="${p.problemid1}">${p.problemname}</option>

    </c:forEach>
    </select><br>




    回答一：<input type="text" name="useranswerone"><br>
    问题二：<select name="problem2">
    <option value="">qxz</option>
    <c:forEach items="${problem2}" var="p2">
        <option value="${p2.problemid2}">${p2.problemname2}</option>

    </c:forEach>
</select><br>
    回答二：<input type="text" name="useranswertwo"><br>
    问题三：<select name="problem3">
    <option value="">qxz</option>
    <c:forEach items="${problem3}" var="p3">
        <option value="${p3.problemid3}">${p3.problemname3}</option>

    </c:forEach>
</select><br>
    回答三：<input type="text" name="useranswerthree"><br>
    身份证正面：<img id="add_img" width="100px" height="100px"/>
            <!-- 文件域 -->
            <input type="file" name="image" id="uploadImg"/>
            <!-- 隐藏域：用于向后台传值 -->
            <input type="hidden" id="hideImg" name="userimgone" />
            <!-- 显示进度条的div -->
            <div id="fileQueue"></div><br>
    身份证反面：<img id="add_img2" width="100px" height="100px"/>
             <!-- 文件域 -->
            <input type="file" name="image" id="uploadImg2"/>
            <!-- 隐藏域：用于向后台传值 -->
            <input type="hidden" id="hideImg2" name="userimgone" />
            <!-- 显示进度条的div -->
            <div id="fileQueue2"></div><br>


</form>
</body>
<script>
    //文件上传插件uploadfiy
    $("#uploadImg2").uploadify({
        //插件自带  不可忽略的参数flash插件
        'swf': '<%=request.getContextPath()%>/js/uploadify/uploadify.swf',
        //前台请求后台的url 不可忽略的参数
        'uploader': '<%=request.getContextPath()%>/user/uploadUserImg.do',
        //给div的进度条加背景 不可忽略
        'queueID': 'fileQueue2',
        //上传文件文件名 跟file标签 name值 保持一致
        'fileObjName' : 'image',
        //给上传按钮设置文字
        'buttonText': '上传图片',
        //设置文件是否自动上传
        'auto': true,
        //可以同时选择多个文件 默认为true  不可忽略
        'multi': true,
        //上传后队列是否消失
        'removeCompleted': true,
        //允许上传的文件后缀 
        'fileExt': '*.jpg;*.gif;*.png',
        //
        'cancelImg': '<%=request.getContextPath()%>/js/uploadify/uploadify-cancel.png',
        //队列消失时间
        'removeTimeout' : 1,
        //上传文件的个数，项目中一共可以上传文件的个数
        'uploadLimit':  -1,
        'fileTypeExts': '*.jpg;*.png',
        //成功回调函数 file：文件对象。data后台输出数据
        'onUploadSuccess':function(file,data,response){
            //alert(file.name+" 路径："+data)
            var imgurl = "http://<%=request.getServerName()%>:<%=request.getServerPort()%><%=request.getContextPath()%>/"+data;
            //图片回显， 预览
            $("#add_img2").attr("src",imgurl)
            // 文本框 回填
            $('#hideImg2').val(imgurl);
        }
    });
    //文件上传插件uploadfiy
    $("#uploadImg").uploadify({
        //插件自带  不可忽略的参数flash插件
        'swf': '<%=request.getContextPath()%>/js/uploadify/uploadify.swf',
        //前台请求后台的url 不可忽略的参数
        'uploader': '<%=request.getContextPath()%>/user/uploadUserImg.do',
        //给div的进度条加背景 不可忽略
        'queueID': 'fileQueue',
        //上传文件文件名 跟file标签 name值 保持一致
        'fileObjName' : 'image',
        //给上传按钮设置文字
        'buttonText': '上传图片',
        //设置文件是否自动上传
        'auto': true,
        //可以同时选择多个文件 默认为true  不可忽略
        'multi': true,
        //上传后队列是否消失
        'removeCompleted': true,
        //允许上传的文件后缀 
        'fileExt': '*.jpg;*.gif;*.png',
        //
        'cancelImg': '<%=request.getContextPath()%>/js/uploadify/uploadify-cancel.png',
        //队列消失时间
        'removeTimeout' : 1,
        //上传文件的个数，项目中一共可以上传文件的个数
        'uploadLimit':  -1,
        'fileTypeExts': '*.jpg;*.png',
        //成功回调函数 file：文件对象。data后台输出数据
        'onUploadSuccess':function(file,data,response){
            //alert(file.name+" 路径："+data)
            var imgurl = "http://<%=request.getServerName()%>:<%=request.getServerPort()%><%=request.getContextPath()%>/"+data;
            //图片回显， 预览
            $("#add_img").attr("src",imgurl)
            // 文本框 回填
            $('#hideImg').val(imgurl);
        }
    });


</script>
</html>
