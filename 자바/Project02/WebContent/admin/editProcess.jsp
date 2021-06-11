<%@page import="plants.MembershipDAO"%>
<%@page import="plants.MembershipDTO"%>
<%@page import="java.util.Enumeration"%>
<%@page import="utils.JSFunction"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
String[] paramArr = new String[20];
int idx = 0;
Enumeration<String> forms = request.getParameterNames();
while(forms.hasMoreElements()){	
	String paramName = (String)forms.nextElement();	
	paramArr[idx++] = request.getParameter(paramName);
}
MembershipDTO dto = new MembershipDTO();

dto.setUser_id(paramArr[0]);
dto.setPass(paramArr[1]);
dto.setName(paramArr[3]);  
dto.setGender(paramArr[4]);   
dto.setBirthday(paramArr[5]); 
dto.setZipcode(paramArr[6]);
dto.setAddress(paramArr[7]);
dto.setEmail(paramArr[8]+"@"+paramArr[9]);
dto.setMobile(paramArr[10]+"-"+paramArr[11]+"-"+paramArr[12]);

MembershipDAO dao = new MembershipDAO();
int result = dao.memberUpdate(dto);
if(result==1){
	JSFunction.alertLocation("회원정보 수정이 완료되었습니다", "memberList.do", out);
}
else{
	JSFunction.alertBack("회원정보 수정시 오류가 발생하였습니다", out);
}
%>