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
/* ������ ����ϴ� ���α׷��� ����� 90�� �̻� 100�� ���ϸ� A����

  80���̻� 90�� �̸��̸� B����, 70���̻� 80�� �̸��̸� C����, 

  60�� �̻� 70�� �̸��̸� D���� 60�� �̸��̸� F���� ó��

*/

int korea = 90;
int eng =95;
int mat= 90;
int sum,avg;


sum = korea+eng+mat;
avg = sum/3;

if (avg>=90 && avg <=100) out.println("A����");
else if (avg>=80 && avg <90) out.println("B����");
else if(avg>= 70 && avg < 80) out.println("C����");
else if (avg>= 60 && avg <70) out.println("D����");
else	out.println("F����");
	


%>
</body>
</html>