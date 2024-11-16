<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<font size=7 color=red>수업</font>중 입니다.

<%
// **용어** 

// 한줄 주석


/*   
여러줄
주석
*/

// out.print(""); --> 출력문 

// out.println(""); --> 출력후 줄 바꿈
// jsp 에서 html tag는 out.print("")내에서 사용
// nl --> 줄 바꿈 
// <br> --> 줄 바꿈

out.println("수업중<br>"); 
out.println("수업중<br><br>");
out.println("수업중");

%>

</body>
</html>