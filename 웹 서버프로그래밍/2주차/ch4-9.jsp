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
//�빮�� Y , �ҹ��� y�� ��� yes�� ���
//�빮�� N , �ҹ��� N�� ��� no�� ���
//�׿� ���ڴ� ������ ���

char ch2='n';
if (ch2=='Y' || ch2 =='y')
	out.println("yes");

else if(ch2=='N' || ch2=='n')
	out.println("no");

else
	out.println("����");

%>

</body>
</html>