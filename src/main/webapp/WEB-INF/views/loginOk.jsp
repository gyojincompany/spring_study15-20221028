<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>loginOk.jsp</title>
</head>
<body>
	<h2>로그인 성공하셨습니다.</h2>
	아이디 : ${memberDto.id }<br>
	비밀번호 : ${memberDto.pw }
</body>
</html>