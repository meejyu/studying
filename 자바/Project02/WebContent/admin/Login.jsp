<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
  <meta charset="utf-8" />
        <meta http-equiv="X-UA-Compatible" content="IE=edge" />
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no" />
        <meta name="description" content="" />
        <meta name="author" content="" />
        <title>Login - SB Admin</title>
        <link href="css/styles.css" rel="stylesheet" />
        <script src="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.3/js/all.min.js" crossorigin="anonymous"></script>
        <script src="../common/jquery/jquery-3.6.0.js"></script>
        <script>
        	$(document).ready(function(){
        		$('#loginbtn').bind("click", function(){
        				var sendData = $('#id').val();
        				var sendData2 = $('#pass').val();
        			if($("#id").val() == ""){
        				alert("아이디를 입력하세요");
        				return false;
        			}else if($("#pass").val() == ""){
        				alert("비밀번호를 입력하세요");
        				return false;
        			}
        			else {
        				$.ajax({
        					url : './LoginProcessMap.jsp',
        					type : 'get',
        					datatype : "json",
        					data : {
        						id  : sendData,
        						pass :  sendData2
        					},
        					success : function(resData){
        						/*
        						서버로부터 받은 콜백데이터가 JSON형태일떄는 파싱을 위해
        						아래 함수를 실행한다.
        						*/
        						var rData = JSON.parse(resData);
        						/*
        						파싱한 데이터를 통해 각 value에 접근할 수 있다.
        						파싱변수.key값 => value가 반환된다.
        						*/
        						if(rData.result==1){
        							alert('로그인 성공입니다.');
        							var disTxt = "<h3>"
        							+"("+ rData.id
        							+")님 반갑습니다.</h3>";
        							
        							$('#loginTable').html(disTxt);
        							location.href = "index.jsp";
        						}
        						else{
        							alert('로그인 실패입니다.');
        							var disTxt = "<h3>로그인 실패;</h3>";
        							
        							$('#jsonDisplay').html(disTxt);
        						}
        					}
        				});
        			}
        		});
        	});	
        </script>
<title>Insert title here</title>
</head>
<body class="bg-primary">
        <div id="layoutAuthentication">
            <div id="layoutAuthentication_content">
                <main>
                    <div class="container">
                        <div class="row justify-content-center">
                            <div class="col-lg-5">
                                <div class="card shadow-lg border-0 rounded-lg mt-5">
                                    <div class="card-header"><h3 class="text-center font-weight-light my-4">Login</h3></div>
                                    <div class="card-body">
                                        <form>
                                            <div class="form-floating mb-3">
                                                <input class="form-control" id="id" type=text value="admin1" />
                                                <label for="id">id</label>
                                            </div>
                                            <div class="form-floating mb-3">
                                                <input class="form-control" id="pass" type="password" value="1234"/>
                                                <label for="pass">Password</label>
                                            </div>
                                            <div class="d-flex align-items-center justify-content-between mt-4 mb-0" id="loginbtn">
<!--                                                  <a class="btn btn-primary" href="index.html">  -->
<!--                                                 Login</a> -->
                                                <a class="btn btn-primary" href="#">Login</a>
<!--                                                 <input type="button" id="숨기기" value="dsfd"/> -->
                                            </div>
                                        </form>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </main>
            </div>
            <div id="layoutAuthentication_footer">
                <footer class="py-4 bg-light mt-auto">
                    <div class="container-fluid px-4">
                        <div class="d-flex align-items-center justify-content-between small">
                            <div class="text-muted">Copyright &copy; Your Website 2021</div>
                            <div>
                                <a href="#">Privacy Policy</a>
                                &middot;
                                <a href="#">Terms &amp; Conditions</a>
                            </div>
                        </div>
                    </div>
                </footer>
            </div>
        </div>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/js/bootstrap.bundle.min.js" crossorigin="anonymous"></script>
        <script src="js/scripts.js"></script>
    </body>
</html>