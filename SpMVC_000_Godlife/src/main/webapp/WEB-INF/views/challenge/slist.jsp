<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set value="${pageContext.request.contextPath}" var="rootPath" />

<div class="section">
	<div class="container">
		<div class="row full-height justify-content-center">
			<div class="col-12 text-center align-self-center py-5">
				<div class="section pb-5 pt-5 pt-sm-2 text-center">
					<h6 class="mb-0 pb-3">
						<span class="dadate">챌린지 </span><span class="cocount">일정</span>
					</h6>
					<input class="checkbox" type="checkbox" id="reg-log" name="reg-log" />
					<label for="reg-log"></label>

					<div class="card-3d-wrap mx-auto">
						<div class="card-3d-wrapper">
							<div class="card-front">
								<div class="center-wrap2">
									<div class="section text-center">
										<table class="challenge list">

											<tr>
												<th>일정</th>
												<th>시작</th>
												<th>종료</th>

											</tr>
											<c:forEach begin="0" end="10" var="INDEX">
												<c:set value="${SCHAS[INDEX]}" var="SCHA" />
												<tr data-id="${SCHA.s_code}">
													<td>${SCHA.s_title}</td>
													<td>${SCHA.s_start}</td>
													<td>${SCHA.s_end}</td>
												</tr>
											</c:forEach>
										</table>
										<div class="main pagination">
											<ul>
												<c:forEach begin="1" end="10" var="PAGE">
													<li>${PAGE}</li>
												</c:forEach>
											</ul>
										</div>
										<p class="mb-0 mt-4 text-center"></p>
									</div>
								</div>
							</div>
							<div class="card-back">
								<div class="center-wrap2">
									<div class="section text-center">
										<table class="challenge list">

											<tr>
												<th>일정</th>
												<th>시작</th>
												<th>종료</th>
												<th>횟수</th>

											</tr>
											<c:forEach begin="0" end="10" var="INDEX">
												<c:set value="${CHALLS[INDEX]}" var="CHALL" />
												<tr data-id="${CHALL.c_code}">
													<td>${CHALL.c_title}</td>
													<td>${CHALL.c_start}</td>
													<td>${CHALL.c_end}</td>
													<td>${CHALL.c_count}</td>
												</tr>
											</c:forEach>
										</table>
										<div class="main pagination">
											<ul>
												<c:forEach begin="1" end="10" var="PAGE">
													<li>${PAGE}</li>
												</c:forEach>
											</ul>
										</div>
									</div>
								</div>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
</div>
