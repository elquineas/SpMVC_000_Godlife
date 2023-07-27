<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set value="${pageContext.request.contextPath}" var="rootPath" />
<form method="post" class="main cinput">
	<fieldset>
	<legend>챌린지 추가</legend>
	
	<div>
		<label>챌린지</label> <input name="c_title" />
	</div>
	
	<div>
		<label>작성일</label> <input name="c_write" />
	</div>
	
	<div>
		<label>시작일</label> <input name="c_start" />
	</div>
	
	<div>
		<label>종료일</label> <input name="c_end" />
	</div>
	
	<div>
		<label>횟수</label> <input name="c_count" />
	</div>
	
	<div>
		<label>내용</label> <input name="c_detail" />
	</div>
	
	<div>
		<label></label>
		<button class="button cinput" type="button">추가하기</button>
	</div>
	</fieldset>
</form>
