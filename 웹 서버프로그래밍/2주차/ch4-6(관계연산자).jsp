<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>���迬����</title>
</head>
<body>
<%

int a = 11;
int b = 5;

//���迬���� == , != , > , >= , < , <=
out.println((a == b)+"<br>");
out.println((a < b)+"<br>");
out.println((a != b)+"<br>");
//�������� && , || , !
out.println((a > 1 && a < 5) + "<br>");
out.println((a > 1 || a < 5) + "<br>");
out.println( !(a > 1) + "<br>");

%>


</body>
</html>