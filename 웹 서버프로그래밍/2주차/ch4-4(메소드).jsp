<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>�޼ҵ�</title>
</head>
<body>
<%! public int abs(int a) {  //�޼ҵ� ���� 

    if (a < 0) return -a; 

else return a;        

}

%>
		-3�� ���밪�� <%= abs(-3) %>�̴�.

</body>
</html>