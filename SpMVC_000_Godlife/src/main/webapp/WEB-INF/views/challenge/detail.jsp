<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<article class="detail data">

	<div>
		<strong>회원코드</strong><span>${CHALL.c_code}</span>
	</div>
	
	<div>
		<strong>챌린지</strong><span>${CHALL.c_title}</span>
	</div>
	
	<div>
		<strong>작성일</strong><span>${CHALL.c_write}</span>
	</div>
	
	<div>
		<strong>시작</strong><span>${CHALL.c_start}</span>
	</div>
	
	<div>
		<strong>종료</strong><span>${CHALL.c_end}</span>
	</div>
	
	<div>
		<strong>횟수</strong><span>${CHALL.c_count}</span>
	</div>
	
	<div>
		<strong>내용</strong><span>${CHALL.c_detail}</span>
	</div>
	
</article>

<article class="detail button">

	<div>
		<button class="detail update" data-id="${CHALL.c_code}">수정</button>
		<button class="detail delete" data-id="${CHALL.c_code}">삭제</button>
	</div>

</article>

</body>
</html>