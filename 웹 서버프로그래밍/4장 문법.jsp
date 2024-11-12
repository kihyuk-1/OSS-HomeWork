<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

1. 선언 <%!  %>

- 소속변수 선언과 메소드 정의

ex)  
<% int i = 0; %>
[지역변수] i = <%= ++i %> -> 1고정
<p>
[소속변수] memi = <%= ++memi %>  -> 새로고침하면 1씩 증가  
<%! int memi = 0; %>

------------------------------------------------
2. 표현식 <%=   %>

- 변수 , 계산식 , 함수 호출 결과를 문자열 형태로 출력

ex) <% int a = 100; %>
	<%= a %>

------------------------------------------------
3. 스크립트릿 <%   %>

- 자바 코드를 기술

 ex) <% out.println("스크립트릿 태그"); %>
 
------------------------------------------------
4. 주석 <%-- --%>

- jsp 페이지의 설명 추가 

ex) <%-- 안녕하세요!! --%>

------------------------------------------------
5. 지시어 <%@    %>

- JSP 페이지의 속성을 지정
*종류 3가지 *
page 지시어: JSP 페이지의 설정 정보를 정의합니다.
include 지시어: 다른 파일을 현재 JSP 페이지에 포함시킵니다.
taglib 지시어: 태그 라이브러리를 사용할 때 선언합니다.

--------------------  * page 지시자 *  -----------------------------
5-1 language 속성

- jsp 페이지의 표현식 , 선언 , 스크립트릿에서 사용할 스크립트 언어의 종류를 지정하는 속성
- 대부분 기본 값도 java이고 , jsp 확장을 위해 만든 속성

ex) <%@ page language="java" %>


5-2 contentType 속성

-JSP 페이지의 MIME 타입(클라이언트가 받은 문서의 형식을 알려주는 정보입니다. 예를 들어, HTML 페이지는 text/html로 설정됩니다.)
 과 문자 인코딩을 설정하는 데 사용됩니다.주로 클라이언트에게 전송되는 문서의 유형
 (예: text/html, text/plain, application/json)과 문자의 인코딩 방식(예: UTF-8, ISO-8859-1)을 지정합니다.

ex)
<%@ page contentType="text/html; charset=UTF-8" %>
<html>
<head>
    <title>ContentType 예시</title>
</head>
<body>
    <h1>이 페이지는 UTF-8 인코딩으로 전송됩니다.</h1>
    <p>예시: 안녕하세요, 세계!</p>
</body>
</html>


5-3 pageEncoding 속성 

- JSP 파일을 서버가 읽고 해석할 때 사용할 문자 인코딩 방식을 정의합니다. 
  예를 들어, JSP 파일이 UTF-8로 저장되어 있다면 pageEncoding="UTF-8"로 설정해야 서버가 이를 올바르게 읽고 처리할 수 있습니다.

ex)
<%@ page pageEncoding="UTF-8" contentType="text/html; charset=UTF-8" %>
<html>
<head>
    <title>PageEncoding 예시</title>
</head>
<body>
    <h1>이 페이지는 UTF-8로 해석되고 전송됩니다.</h1>
    <p>예시: 안녕하세요, 세계!</p>
</body>
</html>


5-4 info 속성

- 속성은 JSP 페이지에 대한 설명 또는 정보를 제공하는 데 사용됩니다. 
  이 속성은 주로 페이지 자체에 대한 메타데이터를 설정하는 용도로 사용되며, 
  JSP 페이지가 서블릿으로 변환될 때 서블릿의 getServletInfo() 메소드를 통해 이 정보를 반환할 수 있습니다. 
  클라이언트에게 직접 보여지지는 않으며, 페이지 또는 서블릿에 대한 설명을 기록할 때 유용합니다.

ex)
<%@ page info="이 JSP 페이지는 사용자에게 환영 메시지를 표시합니다." %>
<html>
<head>
    <title>Info 속성 예시</title>
</head>
<body>
    <h1>환영합니다!</h1>
    <p>이 페이지는 JSP의 info 속성 예시입니다.</p>
</body>
</html>



5-5 import 속성

- JSP 페이지에서 특정 Java 패키지나 클래스를 가져오는 속성입니다. 
  여러 개의 클래스를 가져올 때는 쉼표로 구분합니다. Java 표준 라이브러리나 사용자 정의 클래스를 사용할 때 유용합니다.

ex)
<%@ page import="java.util.Date" %>
<html>
<head>
    <title>Import 속성 예시</title>
</head>
<body>
    <h1>현재 날짜와 시간</h1>
    <p>현재 시간: <%= new Date() %></p>
</body>
</html>


5-6 isErrorPage 속성

 - JSP 페이지가 오류 처리 페이지인지를 설정하는 속성입니다. 
   true로 설정되면, 페이지 내에서 exception 객체를 사용할 수 있어, 오류 발생 시 이를 처리하고 출력할 수 있습니다.

ex)
<%@ page isErrorPage="true" %>
<html>
<head>
    <title>오류 페이지</title>
</head>
<body>
    <h1>오류가 발생했습니다!</h1>
    <p>오류 메시지: <%= exception.getMessage() %></p>
</body>
</html>


5-7 errorPage 속성

- JSP 페이지에서 예외가 발생하면, 해당 예외를 처리할 오류 처리 페이지를 지정하는 속성입니다. 지정된 페이지로 포워딩되어 오류를 처리합니다.

ex)
<%@ page errorPage="error.jsp" %>
<html>
<head>
    <title>메인 페이지</title>
</head>
<body>
    <h1>메인 페이지</h1>
    <p>강제로 예외를 발생시킵니다.</p>
    <%
        int result = 10 / 0; // ZeroDivisionError 발생
    %>
</body>
</html>

5-8 isThreadSafe 속성

- JSP 페이지가 여러 클라이언트 요청을 동시에 처리할 수 있는지 설정합니다.
  true(기본값): JSP 페이지가 스레드 안전성을 직접 관리하며 여러 요청을 동시에 처리할 수 있음.
  false: JSP 페이지가 단일 스레드 모드로 동작하며, 한 번에 하나의 요청만 처리함.

ex)
<%@ page isThreadSafe="true" %>
<html>
<head>
    <title>Thread-Safe 예시</title>
</head>
<body>
    <h1>이 페이지는 여러 요청을 동시에 처리할 수 있습니다.</h1>
</body>
</html>



5-9 isElIgnored 속성

-JSP 페이지에서 EL 표현식의 사용 여부를 지정합니다.
 true: EL 표현식이 무시됩니다. JSP 페이지에서 EL을 사용할 수 없습니다.
 false(기본값): EL 표현식이 허용됩니다. JSP 페이지 내에서 EL을 사용할 수 있습니다.


ex)
<%@ page isElIgnored="false" %>
<html>
<head>
    <title>EL 사용 예시</title>
</head>
<body>
    <h1>EL 표현식을 사용한 예시입니다.</h1>
    <p>변수 value: ${value}</p>
</body>
</html>



5-10 buffer 속성 

-JSP 페이지의 출력 버퍼 크기를 설정합니다. 버퍼의 크기를 지정하면, JSP 페이지에서 생성된 콘텐츠가 이 버퍼에 저장된 후, 클라이언트에게 전송됩니다.
 기본값은 8kb입니다.
 버퍼 크기를 변경하면 메모리 사용량에 영향을 줄 수 있으며, 버퍼가 가득 차면 클라이언트로 자동으로 전송됩니다.

ex)
<%@ page buffer="8kb" %>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<html>
<head>
    <title>버퍼 속성 예시</title>
</head>
<body>
    <h1>출력 버퍼 크기 기본값 사용</h1>
    <p>이 페이지는 기본 버퍼 크기를 사용하고 있습니다.</p>
</body>
</html>
 
 
5-11 autoFlush 속성
 
- 출력 버퍼가 가득 찼을 때 자동으로 플러시할지 여부를 지정합니다.
  true(기본값): 버퍼가 가득 차면 자동으로 플러시하여 데이터를 클라이언트에게 전송합니다.
  false: 버퍼가 가득 차더라도 자동으로 플러시되지 않으며, 수동으로 flush() 메소드를 호출해야 합니다.
 
ex)
<%@ page autoFlush="true or False" %>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %> 
<html>
<head>
    <title>AutoFlush 예시</title>
</head>
<body>
    <h1>자동 플러시가 활성화되었습니다.</h1>
    <%
        for (int i = 0; i < 1000; i++) {
            out.println("출력 내용: " + i + "<br/>");
        }
    %>
   
    <h1>자동 플러시가 비활성화되었습니다.</h1>
    <%
        for (int i = 0; i < 1000; i++) {
            out.println("출력 내용: " + i + "<br/>");
            if (i == 999) {
                out.flush(); // 마지막에 수동으로 플러시
            }
        }
    %>
    
</body>
</html>

 ------------------------- * include 지시자 * ------------------------------- 
 
 5-12 file 속성
 
 
 
 

------------------------------------------------

</body>
</html>