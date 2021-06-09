<%@page import="controller.OracleDAO"%>
<%@page import="org.json.simple.JSONObject"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%-- --%>
<%
//폼값 받기
String id = request.getParameter("user_id");
String pw = request.getParameter("user_pw");
//DAO객체 생성 및 커넥션풀을 통한 연결
OracleDAO dao = new OracleDAO();
boolean isMember = dao.isMember(id, pw);
JSONObject json = new JSONObject();
/*
	회원인증결과에 따른 JSON객체를 생성한다.
*/

if(isMember==true){
	json.put("result", 1); //성공인경우 1
	json.put("message", "로그인 성공입니다.");
	
	/*
	콜백 데이터에는 모든 형식의 문자열을 사용할 수 있다.
	여기서는 HTML태그를 콜배데이터의 value로 설정한다.
	*/
	String html = "";
	html += "<table class='table table-bordered' style='width:300px;'>";
	html += "	<tr>";
	html += "	<td>회원님, 반갑습니다.</td>";
	html += "	</tr>";
	html += "</table>";
	
	json.put("html", html);
}
else {
	json.put("result", 0); //실패인경우 0
	json.put("message", "로그인 실패입니다.");
}
String jsonStr = json.toJSONString();
out.print(jsonStr);
%>