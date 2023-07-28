<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set value="${pageContext.request.contextPath}" var="rootPath" />
<form method="post" class="main update">
		<article class="detail data">
		<div>
			<label>회원코드</label> <input name="c_code" value="${CHALL.c_code}"
				readonly="readonly" />
		</div>

		<div class="message b_code">
			<label></label><span></span>
		</div>

		<div>
			<label>챌린지</label> <input name="c_title" value="${CHALL.c_title}" />
		</div>
		<div class="message b_name">
			<label></label><span></span>
		</div>

		<div>
			<label>작성일</label> <input name="c_write" value="${CHALL.c_write}" />
		</div>
		<div class="message b_name">
			<label></label><span></span>
		</div>
		
		<div>
			<label>시작일</label> <input name="c_start" value="${CHALL.c_start}" />
		</div>
		<div class="message b_name">
			<label></label><span></span>
		</div>
		
		<div>
			<label>종료일</label> <input name="c_end" value="${CHALL.c_end}" />
		</div>
		<div class="message b_name">
			<label></label><span></span>
		</div>
		
		<div>
			<label>횟수</label> <input name="c_count" value="${CHALL.c_count}" />
		</div>
		<div class="message b_name">
			<label></label><span></span>
		</div>
		
		<div>
			<label>내용</label> <input name="c_detail" value="${CHALL.c_detail}" />
		</div>
		<div class="message b_name">
			<label></label><span></span>
		</div>
		</article>
		<article class="detail button">
		<div>
			<button class="button cinput" type="button">수정하기</button>
		</div>
		</article>
</form>
