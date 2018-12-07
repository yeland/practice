//1-20奇数偶数
for (var i = 1; i <= 20; i++) {
  if (i % 2){
    console.log(i + '是奇数。');
  }
  else {
    console.log(i + '是偶数。');
  }
}

//9*9乘法表
for (var x = 1; x <= 9; x++) {
  var str = '';
  for (var y = 1; y <= x; y++) {
    str += x + '*' + y + '=' + (x * y) + ' ';
  }
  console.log(str);
}

