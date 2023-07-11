document.addEventListener("DOMContentLoaded", () => {
  const msg_divs = document.querySelectorAll("div.msg_div");

  document.querySelector("#login").addEventListener("click", async (e) => {
    const input_id = document.querySelector("input#email");
    const input_pw = document.querySelector("input#password");
    console.log(input_id);
    if (!input_id.value) {
      const nav_text = "* 이메일을 입력해주세요";
      msg_divs[0].style.display = "block";
      msg_divs[0].textContent = nav_text;
      msg_divs[0].style.color = "tomato";
      return false;
    }
    const idcheck_url = `${rootPath}/login?email=${input_id.value}&password=${input_pw.value}`;
    const respnse = await fetch(idcheck_url);
    // alert("!!");
    // document.location.href = `${rootPath}/login`;
  });

  // input_id?.addEventListener("blur", async (e) => {
  //   const value = e.target.value;
  //   // const span_box = msg_box.querySelector("span");
  //   const idcheck_url = `${rootPath}/id_check?id=${value}`;

  //   if (!value) {
  //     message_view(INDEX.ID, "error", "* ID를 입력해주세요.");
  //     input_id.focus();
  //     return false;
  //   }

  //   const respnse = await fetch(idcheck_url);
  //   const result = await respnse.text();
  //   if (result === "OK") {
  //     message_view(INDEX.ID, "ok", "* 사용가능한 ID 입니다");
  //   } else if (result === "FAIL") {
  //     message_view(INDEX.ID, "error", "* 사용중인 ID 입니다");
  //     input_id.focus();
  //   } else {
  //     message_view(INDEX.ID, "error", "* 서버오류!");
  //     input_id.focus();
  //   }
  // });
});
