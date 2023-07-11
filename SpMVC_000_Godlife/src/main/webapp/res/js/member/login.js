document.addEventListener("DOMContentLoaded", () => {
  document.querySelector("#kakao_login")?.addEventListener("click", () => {
    // const input_id = document.querySelector("input#email");
    // if (!input_id.value) {
    //   const nav_text = "* 이메일을 입력해주세요";
    //   msg_divs[0].style.display = "block";
    //   msg_divs[0].textContent = nav_text;
    //   msg_divs[0].style.color = "tomato";
    //   return false;
    // }
    window.open(
      "https://kauth.kakao.com/oauth/authorize?client_id=2ebe6ec106e4096b43e3eba724babeb6&redirect_uri=REDIRECT_URI&response_type=code",
      "_blank"
    );
    // document.location.href =
    //   "https://kauth.kakao.com/oauth/authorize?client_id=2ebe6ec106e4096b43e3eba724babeb6&redirect_uri=REDIRECT_URI&response_type=code";
  });
});
