<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<% 
//대문자 Y , 소문자 y일 경우 yes로 출력
//대문자 N , 소문자 N일 경우 no로 출력
//그외 문자는 에러로 출력

char ch2='n';
if (ch2=='Y' || ch2 =='y')
	out.println("yes");

else if(ch2=='N' || ch2=='n')
	out.println("no");

else
	out.println("에러");

%>

</body>
</html>