<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<div class="phone_size">
	<div class="title">
		<div>회원가입</div>
	</div>
	<div class="contain">
		<div class="msg_div checked_box"></div>
		<div class="contain_box">
			<span class="icon-box"> 
				<label for="g_email"> 
					<i class="fa fa-envelope" aria-hidden="true"></i>
					<!-- <i class="fa fa-envelope-o" aria-hidden="true"></i> -->
				</label>
			</span> 
			<input class="login_input" id="g_email" placeholder="이메일" />
		</div>
		<div class="msg_div checked_box"></div>
		<div class="contain_box">
			<span class="icon-box"> 
				<label for="g_passwd"> 
					<i class="fa fa-unlock-alt" aria-hidden="true"></i>
				</label>
			</span> 
			<input class="login_input" id="g_passwd" type="password"placeholder="비밀번호" />
		</div>
		<div class="msg_div checked_box"></div>
		<div class="contain_box">
			<span class="icon-box"> 
				<label for="re_password"> 
					<i class="fa fa-unlock-alt" aria-hidden="true"></i>
				</label>
			</span> 
			<input class="login_input" id="re_password" type="password" placeholder="비밀번호 확인" />
		</div>
		<div class="msg_div checked_box"></div>
		<div class="contain_box">
			<span class="icon-box"> 
				<label for="tel">
					<i class="fa fa-mobile fa-lg" aria-hidden="true"></i>
				</label>
			</span> 
			<input class="login_input" id="tel" placeholder="전화번호 ex)010-0000-0000" />
		</div>
		<div class="msg_div checked_box"></div>
		<div class="contain_box">
			<span class="icon-box"> 
				<label for="birth"> 
					<i class="fa fa-birthday-cake" aria-hidden="true"></i>
					<!-- <i class="fa fa-calendar-o" aria-hidden="true"></i> -->
				</label>
			</span> 
			<input class="login_input" id="birth" placeholder="생년월일 ex)1994-01-01" />
		</div>
		<div class="contain_box">
			<button class="login_button" id="login_btn">가입하기</button>
		</div>
	</div>
</div>
