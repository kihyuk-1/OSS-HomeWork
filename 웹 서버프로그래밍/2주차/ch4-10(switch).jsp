<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>switch��</title>
</head>
<body>
<% 
 int n=1;


switch (n) {

case 1: out.println("��");
case 2: out.println("��"); 
case 3: out.println("��");
case 4: out.println("��"); break;
default: out.println("����");

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