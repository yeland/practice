//1.判断数组
var a = '[a, b, c, d]';
var b = [1, 2, 3, 4];
console.log(a instanceof Array); //false
console.log(b instanceof Array); //true

//2.*2输出
var a = [1, 2, 3, 4, 5];
var b = a.map(function (item, index, array) {
  return (item * 2);
})
console.log(b);

//3.
var colors = ["Red", "Green", "White", "Black"];
var case1 = colors.join(' ');
var case2 = colors.join('+');
var case3 = colors.join();
console.log(case1);
console.log(case2);
console.log(case3);

//4.排序
var a = [5, 1, 8, 10, 4];
function compare(val1, val2) {
  return val2 - val1;
}
var b = a.sort(compare);
console.log(b);

//5.频率最高
var a = [3, 'a', 'a', 'a', 2, 3, 'a', 3, 'a', 2, 4, 9, 3];
var maxNum = 0;
var maxEle;
a.reduce(function (allEle, ele) {
  if (ele in allEle) {
    allEle[ele]++;
  } else {
    allEle[ele] = 1;
  }
  if (allEle[ele] > maxNum) {
    maxEle = ele;
    maxNum = allEle[ele];
  }
  return allEle;
  console.log(maxEle);
}, {});
