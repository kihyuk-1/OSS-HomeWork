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
//7�� ���
int gu = 7;
int i =1; //�ʱⰪ
while (i <=9) {
	out.println(gu+"*" + i +"="+(gu*i)+"<br>"); //�ݺ������� ������
	i++;
}

%>

</body>
</html>