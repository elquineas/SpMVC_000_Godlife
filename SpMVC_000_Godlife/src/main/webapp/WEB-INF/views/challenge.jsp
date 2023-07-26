<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set value="${pageContext.request.contextPath}" var="rootPath" />
<c:set value="ver_0042" var="ver" />
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>갓생살기</title>
<script src="https://kit.fontawesome.com/3aaa5e7779.js" crossorigin="anonymous"></script>
<link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Sofia&effect=fire" />
<link href="${rootPath}/res/css/main.css?${ver}" rel="stylesheet">
<link href="${rootPath}/res/css/challenge.css?${ver}" rel="stylesheet">
<script>
	var rootPath = "${rootPath}";
</script>
</head>
<body>
	<%@ include file="/WEB-INF/views/common/sidebar.jsp" %>
	<div class="phone_size">
		<h3>챌린지에 도전하세요!</h3>
		<div class="challenge_box" id="challenge_box">
			<div class="challenge1" id="water">물 1L마시기</div>
			<div class="challenge1" id="zoro"
				onclick="location.href ='ZERO.html'">무지출 챌린지</div>
			<div class="challenge1" id="book">책 한권 다 읽기</div>
			<div class="challenge" id="dairy" onclick="">매일 일기쓰기</div>
			<div class="challenge" id="bedding" onclick="">침구정리</div>
			<div class="challenge" id="running" onclick="">런닝하기(30분)</div>
		</div>
		<div class="item_box">
			<div class="item">목표를 눌러주세요!</div>
			<br>
		</div>
	</div>
	</div>
	<div class="container">
		<a href="" title="Button push blue/green"
			class="button btnPush btnBlueGreen"
			onclick="location.href ='main_sikp.html'">SKIP</a> <a href=""
			title="Button push lightblue" class="button btnPush btnLightBlue"
			onclick="location.href ='main.html'">저장하기</a>
		<div class="clear"></div>
	</div>
</body>
</html>