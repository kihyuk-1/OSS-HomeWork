<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>switch문</title>
</head>
<body>
<% 
 int n=1;


switch (n) {

case 1: out.println("일");
case 2: out.println("이"); 
case 3: out.println("삼");
case 4: out.println("사"); break;
default: out.println("에러");

}
%>


<%
 int ch4='N';

switch (ch4) {

case 'Y':
case 'y': out.println("yes"); break;
case 'N':
case 'n': out.println("no"); break;
default:
	out.println("error");
}


%>

</body>
</html>