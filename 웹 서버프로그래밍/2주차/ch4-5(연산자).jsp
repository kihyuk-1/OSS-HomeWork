<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>������</title>
</head>
<body>
<% 
int a = 10;
int b = 3;

//��������� +,-,*,/
out.println(a+"+"+b+"="+(a + b) + "<br>");
out.println(a+"-"+b+"="+(a - b) + "<br>");
out.println(a+"*"+b+"="+(a * b) + "<br>");
out.println(a+"/"+b+"="+(a / (double)b) + "<br>");

%>

</body>
</html>