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
int i , j;
int sum;

// for문

for(i=10; i<=100; i=i+10) {
	sum = 0;
	for (j=1; j<=i; j++) {
		sum = sum+j;
	}
	out.println("1..."+i+"="+sum+"<br>");
	
}

%>

</body>
</html>