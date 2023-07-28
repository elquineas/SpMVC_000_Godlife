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
		<strong>회원코드</strong><span>${SCHA.s_code}</span>
	</div>
	
	<div>
		<strong>일정</strong><span>${SCHA.s_title}</span>
	</div>
	
	<div>
		<strong>작성일</strong><span>${SCHA.s_write}</span>
	</div>
	
	<div>
		<strong>시작</strong><span>${SCHA.s_start}</span>
	</div>
	
	<div>
		<strong>종료</strong><span>${SCHA.s_end}</span>
	</div>
	
	<div>
		<strong>내용</strong><span>${SCHA.s_detail}</span>
	</div>
	
</article>

<article class="detail button">

	<div>
		<button class="detail supdate" data-id="${SCHA.s_code}">수정</button>
		<button class="detail sdelete" data-id="${SCHA.s_code}">삭제</button>
	</div>

</article>

</body>
</html>