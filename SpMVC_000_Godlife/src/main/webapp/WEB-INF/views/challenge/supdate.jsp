<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set value="${pageContext.request.contextPath}" var="rootPath" />
<form method="post" class="main supdate">
		<article class="detail data">
		<div>
			<label>회원코드</label> <input name="s_code" value="${SCHA.s_code}"
				readonly="readonly" />
		</div>

		<div class="message s_code">
			<label></label><span></span>
		</div>

		<div>
			<label>일정</label> <input name="s_title" value="${SCHA.s_title}" />
		</div>
		<div class="message s_name">
			<label></label><span></span>
		</div>
		
		<div>
			<label>작성일</label> <input name="s_write" value="${SCHA.s_write}" />
		</div>
		<div class="message s_name">
			<label></label><span></span>
		</div>
		
		<div>
			<label>시작일</label> <input name="s_start" value="${SCHA.s_start}" />
		</div>
		<div class="message s_name">
			<label></label><span></span>
		</div>
		
		<div>
			<label>종료일</label> <input name="s_end" value="${SCHA.s_end}" />
		</div>
		<div class="message s_name">
			<label></label><span></span>
		</div>
		
		<div>
			<label>내용</label> <input name="s_detail" value="${SCHA.s_detail}" />
		</div>
		<div class="message s_name">
			<label></label><span></span>
		</div>

		
		</article>
		<article class="detail button">
		<div>
			<button class="button sinput" type="button">수정하기</button>
		</div>
		</article>
</form>
