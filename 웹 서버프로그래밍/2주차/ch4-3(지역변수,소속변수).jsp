<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>지역변수 , 소속변수</title>
</head>
<body>
<% int i = 0; %>
[지역변수] i = <%= ++i %>
<br>
<%! int memi = 0; %>
[소속변수] memi = <%= ++memi %>
</body>
</html>