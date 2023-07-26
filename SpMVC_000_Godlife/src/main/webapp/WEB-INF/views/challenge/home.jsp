<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set value="${pageContext.request.contextPath}" var="rootPath" />
<c:set value="20230726-001" var="version" />
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>god</title>
<script src="https://kit.fontawesome.com/3aaa5e7779.js" crossorigin="anonymous"></script>
<link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Sofia&effect=fire" />
<link href="${rootPath}/res/css/main.css?${ver}" rel="stylesheet">

<script>
	var rootPath = "${rootPath}"
</script>

<script src="${rootPath}/static/js/detail.js?${version}"></script>
</head>

<body>
	
	<%@ include file="/WEB-INF/views/common/sidebar.jsp" %>
	
	<section class="main">

		<c:if test="${BODY == 'CINPUT'}">
			<%@ include file="/WEB-INF/views/challenge/cinput.jsp"%>
		</c:if>

	</section>
</body>
</html>