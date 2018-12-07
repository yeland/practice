var ajax = {
    request: function (url,method,onreadyFunction,string) {
        var xhr = new XMLHttpRequest(); //创建 XMLHttpRequest对象
        
        xhr.open(method,url,true);  //准备请求
        if (method == "post") {     //发送请求
            xhr.send(string);  
        } else {
            xhr.send(null);  
        }
        xhr.onreadystatechange = onreadyFunction;   //处理响应
    }
}
function myCallback(xhr){ 
    alert(xhr.responseText); 
}
ajax.request("somefile.txt","get",myCallback);
ajax.request("script.php","post",myCallback,"first=John&last=Smith");