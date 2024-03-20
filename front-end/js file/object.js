const person = {
  name: {
    firstname: '홍',
    lastname: '길동'
  },
  // name: '홍길동',
  likes: ['apple', 'football'],
  age: 20,
  isAdult: true,
  printInfo(){ //메서드
    return 'hello!!';
  }
};

//객체의 속성에 접근하는 방법
// document.write(person.name.firstname);
// document.write(person['name']);
// document.write(person['age']);
document.write(person.likes[0]);
document.write(person.name.lastname);
console.log(person.printInfo());
person.age = 30;
console.log(person.age);

//객체의 속성 추가
person.gender = '남자';
console.log(person);

