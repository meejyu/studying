<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
<script src="../common/jquery/jquery-3.6.0.js"></script>
<script>
	$('#btnLogin2').click(function(){
		var s_url = "./주소 알랄ㄹ랄";
		var s_params = $('#loginFrm').serialize();
		
		$.post(
			s_url,
			s_params,
			function(resData){
				var d = JSON.parse(resData);
				
				if(d.result==1){
					alert(d.message);
					$('#loginFrm')
				}
			}
		
		)
		
	
	})
</script>

</head>
<body>

</body>
</html>