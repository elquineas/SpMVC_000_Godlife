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
<link href="${rootPath}/res/css/challengeTest.css?${ver}" rel="stylesheet">
<script>
	var rootPath = "${rootPath}";
</script>
<script src="${rootPath}/res/js/challengeTest/recommend.js?${ver}"></script>
</head>
<body>
	<%@ include file="/WEB-INF/views/common/sidebar.jsp" %>
	<div class="phone_size">
		<%@ include file="/WEB-INF/views/challengeTest/recommend.jsp" %>
	</div>
</body>
</html>