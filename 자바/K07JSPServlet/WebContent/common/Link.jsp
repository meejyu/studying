<%@page import="homework.MembershipDAO"%>
<%@page import="homework.MembershipDTO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
//application내장객체를 인수로 DAO객체를 생성한다.(DB연결)
//파라미터를 저장하기 위해 Map컬렉션 생성
request.setCharacterEncoding("UTF-8");
//폼값 받기
String id = request.getParameter("user_id");
String pw = request.getParameter("pass1");
String name = request.getParameter("name");
String birthday = request.getParameter("birthday");
String addressNum = request.getParameter("zipcode");
String address1 = request.getParameter("address1");
String address2 = request.getParameter("address2");
String email1 = request.getParameter("email1");
String email2 = request.getParameter("email2");
String mobile1 = request.getParameter("mobile1");
String mobile2 = request.getParameter("mobile2");
String mobile3 = request.getParameter("mobile3");
String tel1 = request.getParameter("tel1");
String tel2 = request.getParameter("tel2");
String tel3 = request.getParameter("tel3");
//폼값과 로그인 아이디를 저장하기 위한 DTO객체
MembershipDTO dto = new MembershipDTO();
dto.setId(id) ;
dto.setPw(pw);
dto.setName(name) ;
dto.setBirthday(birthday) ;
dto.setAddressNum(addressNum) ;
dto.setAddress(address1 +" "+ address2) ;
dto.setEmail(email1+"@"+email2) ;
dto.setCellphone(mobile1+"-"+mobile2+"-"+mobile3) ;
dto.setPhone(tel1+"-"+tel2+"-"+tel3) ;

//DAO객체 생성 및 쓰기처리를 위한 메소드 호출
MembershipDAO dao = new MembershipDAO(application);

int iResult = dao.memberRegist(dto);
//자원해제
dao.close();
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<table border="1" width="90%">
		<tr>
			<td>
				<a href="../homework/memberList.jsp">회원목록</a>
				&nbsp;&nbsp;&nbsp;
				<a href="../homework/memberView.jsp">회원정보확인</a>
			</td>
		</tr>
	</table>
</body>
</html>