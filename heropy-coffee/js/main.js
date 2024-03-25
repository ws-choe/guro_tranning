// 검색 영역 가져오기
const searchEl = document.querySelector('.search');
const searchInputEl = searchEl.querySelector('input');
// 검색 영역을 클릭하면 // 5열~15열 코드에 대한 이해가 필요.
searchEl.addEventListener('click', function(){
  searchInputEl.focus();
});
searchInputEl.addEventListener('focus', function(){
  searchEl.classList.add('focused');
  searchInputEl.setAttribute('placeholder', '통합검색');
});
searchInputEl.addEventListener('blur', function(){
  searchEl.classList.remove('focused');
  searchInputEl.setAttribute('placeholder', '');
});