<%@page import="utils.BoardPage"%>
<%@page import="plants.MembershipDTO"%>
<%@page import="common.BoardConfig"%>
<%@page import="java.util.Map"%>
<%@page import="java.util.HashMap"%>
<%@page import="plants.MembershipDAO"%>
<%@page import="plants.plantsBoardDTO"%>
<%@page import="java.util.List"%>
<%@page import="plants.plantsBoardDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<% 
MembershipDAO dao = new MembershipDAO();
Map<String, Object> param = new HashMap<String, Object>();

String searchField = request.getParameter("searchField");//검색할 필드명
String searchWord = request.getParameter("searchWord");//검색어
String queryStr = "";
if(searchWord!=null){
	param.put("searchField", searchField);
	param.put("searchWord", searchWord);
	queryStr = "&searchField="+searchField+"&searchWord="+searchWord;
}
int totalCount = dao.memberCount(param);

/**** 페이지처리 start ***/
int pageSize = BoardConfig.PAGE_PER_SIZE;
int blockPage = BoardConfig.PAGE_PER_BLOCK;
int totalPage = (int)Math.ceil((double)totalCount/pageSize);
int pageNum = 1;
String pageTemp = request.getParameter("pageNum");
if(pageTemp!=null && !pageTemp.equals(""))
	pageNum = Integer.parseInt(pageTemp);
int start = (pageNum-1) * pageSize + 1;
int end = pageSize;
param.put("start", start);
param.put("end", end);
/***페이지처리 end ***/

//목록에 실제 출력할 레코드를 얻어오기 위한 메소드 호출
List<MembershipDTO> memberLists = dao.memberListPage(param);
//자원해제
dao.close();
%>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
 <meta charset="utf-8" />
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no" />
        <meta name="description" content="" />
        <meta name="author" content="" />
        <!-- Favicon-->
        <link rel="icon" type="image/x-icon" href="assets/favicon.ico" />
        <!-- Core theme CSS (includes Bootstrap)-->
        <link href="css/styles.css" rel="stylesheet" />
</head>
<body>
	    <div class="d-flex" id="wrapper">
            <!-- Sidebar-->
            <div class="border-end bg-white" id="sidebar-wrapper">
                <div class="sidebar-heading border-bottom bg-light">Plants</div>
                <div class="list-group list-group-flush">
                    <a class="list-group-item list-group-item-action list-group-item-light p-3" href="../admin/adminList.do">관리자 리스트</a>
                    <a class="list-group-item list-group-item-action list-group-item-light p-3" href="../admin/memberList.do">회원 리스트</a>
                    <a class="list-group-item list-group-item-action list-group-item-light p-3" href="../admin/boardList.do">게시판 리스트</a>
                </div>
            </div>
            <!-- Page content wrapper-->
            <div id="page-content-wrapper">
                <!-- Top navigation-->
                 <nav class="navbar navbar-expand-lg navbar-light bg-light border-bottom">
                    <div class="container-fluid">
                        <div class="collapse navbar-collapse" id="navbarSupportedContent">
                            <ul class="navbar-nav ms-auto mt-2 mt-lg-0">
                                <li class="nav-item active">
                                <% if(session.getAttribute("id")!=null){ %>
                                <a class="nav-link" href="./Logout.jsp">로그아웃</a><% } %></li>
                            </ul>
                        </div>
                    </div>
                </nav>
                <!-- Page content-->
                <div class="container-fluid">
                   <div class="container">
					  <h2>회원 리스트</h2>
					  
					  <table class="table">
					    <thead>
					     <tr class="table-info" align="center">
		<th class="text-center">번호</th>
		<th class="text-center">아이디</th>
		<th class="text-center">이름</th>
		<th class="text-center">핸드폰번호</th>
		<th class="text-center">이메일</th>
		<th class="text-center">가입날짜</th>
		<th class="text-center">수정/삭제</th>
	</tr>
<%
if(memberLists.isEmpty()){
	//컬렉션에 저장된 데이터가 없다면...
%>
		<tr>
			<td colspan="7" align="center">
				등록된 회원이 없습니다^^*
			</td>
		</tr>
<%
}
else{
	int vNum = 0;
	int countNum = 0;	
	for(MembershipDTO dto : memberLists)
	{
		vNum = totalCount - (((pageNum-1) * pageSize) + countNum++);
%>	
	<tr>
		<td class="text-center"><%=vNum %></td>
		<td><a href="memberView.jsp?user_id=<%=dto.getUser_id() %>&pageNum=<%=pageNum %>"><%=dto.getUser_id() %></a></td>
		<td class="text-center"><%=dto.getName() %></td>
		<td class="text-center"><%=dto.getMobile() %></td>
		<td class="text-center"><%=dto.getEmail() %></td>
		<td class="text-center"><%=dto.getRegidate() %></td>
		<td class="text-center">
			<button type="button" onclick="location.href='memberEdit.jsp?user_id=<%=dto.getUser_id() %>';">수정</button>
			<button type="button" onclick="memberDelete('<%=dto.getUser_id() %>');">삭제</button>
		</td>
	</tr>
<%
	} 
}
%>	
</table>
<script>
function memberDelete(user_id){
	if(confirm("회원을 삭제하시겠습니까?")){
		location.href="memberDelete.jsp?user_id="+user_id;
	}
}
</script>
<table width="100%">
	<tr align="center">
		<td>
			<%=BoardPage.pagingStr(totalCount, pageSize, blockPage, 
					pageNum, request.getRequestURI(), queryStr)%>							 
		</td>
		<td width="100">
			<button onclick="location.href='memberRegistForm.jsp';">회원 가입</button>
		</td>
	</tr>
					  </table>
					</div>
                </div>
            </div>
        </div>
        <!-- Bootstrap core JS-->
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/js/bootstrap.bundle.min.js"></script>
        <!-- Core theme JS-->
        <script src="js/scripts.js"></script>
</body>
</html>