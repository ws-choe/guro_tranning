// 검색 영역 가져오기
const searchEl = document.querySelector('.search');
const searchInputEl = searchEl.querySelector('input');
// 검색 영역을 클릭하면 // 5열~15열 코드에 대한 이해가 필요.
searchEl.addEventListener('click', function(){
  searchInputEl.focus(); // input에 클릭되는 함수를 실행
});
searchInputEl.addEventListener('focus', function(){
  searchEl.classList.add('focused');
  searchInputEl.setAttribute('placeholder', '통합검색');
});
searchInputEl.addEventListener('blur', function(){
  searchEl.classList.remove('focused');
  searchInputEl.setAttribute('placeholder', '');
});

// window 객체의 scrollY 속성을 console에 출력 (Y 좌표)//
const badgeEl = document.querySelector('header .badges');

window.addEventListener('scroll', function(){
  console.log(window.scrollY);
  if(window.scrollY > 500) {
    gsap.to(badgeEl, .6, {
      opacity: 0,
      display: 'none'
    });
  } else {
    gsap.to(badgeEl, .6, {
      opacity: 1,
      display: 'block'
  });
}
});

// 페이드인 처리 
const fadeEls = document.querySelectorAll('.visual .fade-in');
fadeEls.forEach(function (fadeEl, index) {
  gsap.to(fadeEl, 1, {
    delay: (index + 1) * .7,
    opacity: 1
  });
});
