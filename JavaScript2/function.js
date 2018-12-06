//字符串逆序输出
function reverseString(message) {
  return message.split('').reverse().join('');
}
var a = reverseString('hello');
console.log(a);

//判断回文
function palindrome(message) {
  var reMessage = message.split('').reverse().join('');
  return reMessage == message;
}
var h = palindrome('hello'); // should return false
var c = palindrome('abcba'); // should return true
console.log(h);
console.log(c);

//按字母表顺序输出
function alphabetSort(message) {
  return message.split('').sort().join('');
}
var s = alphabetSort('hello'); // should return 'ehllo'
console.log(s);

//计算单词个数
function countWords(message) {
  return message.split(' ').length;
}
var count = countWords('Good morning, I love JavaScript.'); // should return 5
console.log(count);