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
//7단 출력
int gu = 7;
int i =1; //초기값
while (i <=9) {
	out.println(gu+"*" + i +"="+(gu*i)+"<br>"); //반복수행할 무문장
	i++;
}

%>

</body>
</html>