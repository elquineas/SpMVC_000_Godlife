document.addEventListener("DOMContentLoaded", () => {
  console.log("TEST");
  const challenge_list_box = document.querySelector(
    "div.challenge.challenge_box"
  );
  const challenge_water = document.querySelector("span#water");
  const challenge_zero = document.querySelector("span#zero");
  const challenge_book = document.querySelector("span#book");
  const challenge_dairy = document.querySelector("span#dairy");
  const challenge_bedding = document.querySelector("span#bedding");
  const challenge_running = document.querySelector("span#running");
  const challenge_list = document.querySelector("div.challenge_list");

  const challengeClickHandler = (e) => {
    const challenge_box = e.target;
    if (challenge_box.tagName !== "SPAN") {
      return false;
    }

    const id = challenge_box.dataset.id;
    console.log(id);
    // challenge_div = document.createElement("div.challenge.choice_box");
    // challenge_div.innerHTML = text.replaceAll(
    //   `<input id="u_challenge" placeholder="일정을 추가해주세요."/>`
    //   `${mName}`,
    //   `<span class="search-item">${mName}</span>`
    // );
    // mem_div.dataset.mName = member.m_name;
    // mem_div.dataset.mTel = member.m_tel;
    // mem_div.dataset.mCode = member.m_code;
    // result_list.appendChild(mem_div);
  };

  challenge_list_box?.addEventListener("click", challengeClickHandler);
});
