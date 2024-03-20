//문서 객체 모델(DOM)
const boxEl = document.querySelector('.box');
console.log(boxEl);
const cssEl = document.querySelectorAll('.text');
console.log(cssEl);

const elTitle = document.getElementById('title');
console.log(elTitle);

const elText = document.getElementsByClassName('text');
console.log(elText);
console.log(elText[1]); //유사 배열, 배열 값으로, 0부터 시작

const tagName = document.getElementsByTagName('p');
console.log(tagName);