//小写变大写
var name = 'hello';
var upperName = name.toUpperCase();
console.log(upperName);

//首字母大写
var sentence = 'good afternoon, mr mike.';
function firstUpper(s) {
    var i, w = s.split(" ");
    for (i = 0; i < w.length; i++) {
        w[i] = w[i].slice(0, 1).toUpperCase() + w[i].slice(1);
    }
    return w.join(' ');
}
console.log(firstUpper(sentence));

//提取数字
var money = '$20';
var numberStr = money.slice(1, 3);
var number = parseInt(numberStr);
console.log(number);