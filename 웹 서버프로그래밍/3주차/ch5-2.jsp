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

// 1 ~ 5���� ���� ���ϱ�
int esum = 0;
int osum = 0;
int i;
for(i = 1; i <=5; i++) {
	if(i%2==0) 
		esum+=i; //esum = sum+i
	else 
		osum+=i;
}

out.println("1����"+(i-1)+"���� ¦����"+ esum+"<br>"); 
out.println("1����"+(i-1)+"���� Ȧ����"+ osum+"<br>");


%> 

</body>
</html>