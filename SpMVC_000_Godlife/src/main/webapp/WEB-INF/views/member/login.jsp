<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<div class="phone_size">
	<div class="title font-effect-fire">갓생살기</div>
	<div class="contain">
		<div class="msg_div checked_box"></div>
		<div class="contain_box">
			<input class="login_input" id="email" placeholder="이메일" />
		</div>
		<div class="msg_div checked_box"></div>
		<div class="contain_box">
			<input class="login_input" id="password" type="password"
				placeholder="비밀번호" />
		</div>
		<div class="contain_box">
			<button class="login_button" id="login">로그인</button>
		</div>
		<div class="contain_box">
			<button class="login_button" id="kakao_login">카카오 로그인</button>
		</div>
		<!-- 
		<div class="contain_box">
			<a href="https://kauth.kakao.com/oauth/authorize?response_type=code&client_id=2ebe6ec106e4096b43e3eba724babeb6&redirect_uri=https%3A%2F%2Flocalhost%3A8080%2F%3Amember%3Alogin%3Akakao">
			    Kakao 로그인
			</a>
			<a href="https://kauth.kakao.com/oauth/authorize?response_type=code&client_id=2ebe6ec106e4096b43e3eba724babeb6&redirect_uri=https://localhost:8080/app/member/login/kakao">
				Kakao 로그인 
			</a>
		</div> -->
		<div class="anchor_box">
			<span class="anchor"><a href="${rootPath}/member/join">회원가입</a> </span>| 
			<span class="anchor"><a href="${rootPath}/member/findId">아이디찾기</a> </span>| 
			<span class="anchor"><a href="${rootPath}/member/findPw">비번찾기</a></span>
		</div>
	</div>
</div>