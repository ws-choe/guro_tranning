// for(let i = 1; i < 10; i++){
//   // document.write(3 + "X" + i + "=" + 3*i+'<br>');
//   //()내용이 복잡하면 문자 리터럴 사용.
//   document.write(`3*${i} = ${3*i}` + '<br>')
// }

// const gugudan = () => { //변수명이랑 함수명 똑같이 작성해도 됨.(권장 사항)
//   for(let i = 1; i < 10; i++){
//     document.write(`3*${i} = ${3*i}` + '<br>')
//   }
// } //gugudan 변수에 저장되어서 호출은 변수명으로 해야함.

// gugudan(); //특정 위치에서 함수가 필요 시 이와 같이 함수를 호출할 수 있음.

// let num;
// console.log(num);
// num = 10; //호이스팅 (뒤에 있었던 변수를 자체적으로 찾는것)

// function gugudan(dan) { 
//     for(let i = 1; i < 10; i++){
//       document.write(`${dan} * ${i} = ${dan * i}` + '<br>');
//     }
//   }

// gugudan(3);
// gugudan(4);
// gugudan(9); //괄호 안 값은 인수.

// const gugudan = (dan) => { 
//   for(let i = 1; i < 10; i++){
//     document.write(`${dan} * ${i} = ${dan*i}` + '<br>')
//   }
// }

// for(let i = 1; i < 10; i++){
//   gugudan(i)
// }
// const gugudan = (dan = 7) => {  //dan는 매개변수
//     for(let i = 1; i < 10; i++){
//       document.write(`${dan} * ${i} = ${dan*i}` + '<br>')
//     }
//   };

//   gugudan(); //()안의 값은 인수
  
//   function sum(num1, num2){
//     let result = num1 + num2;
//     // console.log('inner: ' + result)
//     return result;
//   }
//   const result = sum(10,20); //반환받은 값을 result 변수에 대입
//   console.log('out: ' + result);

// function sum(num1, num2){
//   if(typeof num1 !== 'number' || typeof num2 !== 'number'){
//     return; // 매개변수 숫자가 아니면 강제종료.
//   }
//   return num1 + num2;
//   }
//   const result = sum(10, 11); 
//   console.log('out: ' + result);

// const sum = (num1, num2) => num1 + num2;
// const result = sum(30,40);
// console.log(result);

// let a = 10; // a변수는 코드 블록 바깥에서 선언돼서 전역 변수.
// {
//   let b = 20; // b변수는 블록 안쪽에서 선언되서 지역 변수.
//   console.log(`코드블록 내부 a: ${a}`);
//   console.log(`코드블록 내부 b: ${b}`);
// }
// console.log(`코드블록 외부 a: ${a}`);
// console.log(`코드블록 외부 a: ${b}`); //defined, b는 블록 스코프 내 변수라 출력 불가.

(function init(a,b){
  console.log('즉시 실행 함수');
  console.log(a+b);
})(1,20); //이 함수는 다시 호출 안 됨. 재사용 불가.