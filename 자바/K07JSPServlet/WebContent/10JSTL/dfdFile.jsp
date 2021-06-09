<%@page import="model.MemberDTO"%>
<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>JSTL 태그하기</h2>
	
	<h2>set태그</h2>
	
		<c:set var="hh" value="<%=new Date() %>"></c:set>
		${hh }
		
		<c:set var="bb" value='<%=new MemberDTO("z", "zz", "zzz", null) %>' />
		${bb.id }
	
		<c:remove var="hh"/>
		${hh }
		<c:remove var="bb"/>
		${bb.id }
		
		<c:set var="aa" value="500" />
		<c:if test="${aa mod 2 eq 0 }" var="re"></c:if>
		${re }
		
		${aa } : ${aa mod 2 == 0 ? "는 짝수":"는 홀수" }

		<c:set var="tt" value="고고" />
		<c:if test="${tt eq '고고' }">
			와 대박
		</c:if>
		
		<c:if test="${true }" >
		항상출력
		</c:if>
		
		<h3>연습문제 : if태그</h3>
	<form method="get">
		아이디 : <input type="text" name="user" />
		<br />
		패스워드 : <input type="text" name="pass" />
		<br />
		<input type="submit" value="로그인" />
	</form>	
	

	<c:if test="${param.user eq 'kosmo' && param.pass eq '1234' }" var="gg" >
		축하
	</c:if>
	<c:if test="${not gg }">
		다시해
	</c:if>




</body>
</html>