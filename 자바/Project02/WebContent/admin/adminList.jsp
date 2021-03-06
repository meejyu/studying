<%@page import="plants.plantsBoardDTO"%>
<%@page import="java.util.List"%>
<%@page import="plants.plantsBoardDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
		 <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
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
					  <h2>관리자 리스트</h2>
					  
					  <table class="table">
					    <thead>
					      <tr class="table-info" align="center">
					        <th>num</th>
					        <th>아이디</th>
					        <th>비밀번호</th>
					        <th>이름</th>
					        <th>닉네임</th>
					        <th>휴대전화</th>
					      </tr>
					    </thead>
					    <tbody>
					    <c:choose>	
						<c:when test="${empty boardLists }">
							<!-- 등록된 게시물이 없을때. -->
							<tr>
								<td colspan="6" align="center">
									등록된 게시물이 없습니다^^*
								</td>
							</tr>
						</c:when>
						<c:otherwise>
					    	<c:forEach items="${boardLists }" var="row" varStatus="loop">	
					      <tr align="center">
					        <th>
					        	<!-- 가상번호 -->
								${map.totalCount - (((map.pageNum-1) * map.pageSize) 
									+ loop.index)}   
					        </th>
					        <th>${row.id }</th>
					        <th>${row.pass }</th>
					        <th>${row.name }</th>
					        <th>${row.nickname }</th>
					        <th>${row.phone }</th>
					      </tr> 
					     </c:forEach>	
					     </c:otherwise>	
						</c:choose>			
					    </tbody>
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