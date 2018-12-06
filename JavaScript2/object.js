var user = {};
user.name = 'John';
user.surname = 'Mike';
user.name = 'peter';
delete user.name;

var fruit = {
    apple: 20,
    pear: 20,
    peach: 10
};
var number = Object.values(fruit);
var result = number.reduce(function (a, b) {
    return a + b;
}, 0);
console.log(result);