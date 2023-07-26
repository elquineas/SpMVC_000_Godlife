<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set value="${pageContext.request.contextPath}" var="rootPath" /> 
   
<div class="challenge img_box"></div>
<div class="challenge challenge_box">
	<div class="challenge_title">챌린지에 도전하세요!</div>
	<div class="challenge_text">
		<span class="challenge list" data-id="water">#물 1L마시기</span>
		<span class="challenge list" data-id="zero">#무지출 챌린지</span>
	</div>
	<div class="challenge_text">
		<span class="challenge list" data-id="book">#책 한권 다읽기</span>
		<span class="challenge list" data-id="dairy">#매일 일기쓰기</span>
	</div>
	<div class="challenge_text">
		<span class="challenge list" data-id="bedding">#침구정리</span>
		<span class="challenge list" data-id="running">#런닝하기</span>
	</div>
</div>
<div class="challenge choice_box">
	<div>
		<button type="button">일정 추가</button>
	</div>
	<div class="challenge challenge_list">
		<input id="u_challenge" placeholder="일정을 추가해주세요."/>
	</div>
</div>
<!-- <div class=""></div> -->

<!-- <h3>챌린지에 도전하세요!</h3>
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
<div class="container">
	<a href="" title="Button push blue/green" class="button btnPush btnBlueGreen" onclick="location.href ='main_sikp.html'">
		SKIP
	</a> 
	<a href="" title="Button push lightblue" class="button btnPush btnLightBlue" onclick="location.href ='main.html'">
		저장하기
	</a>
	<div class="clear"></div>
</div> -->