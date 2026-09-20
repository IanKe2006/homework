fun main() {
    var num1 = 10
    var num2 = 5
    println("num1和num2的各種運算:")
    println("num1+num2等於" + (num1 + num2))
    println("num1-num2等於" + (num1 - num2))
    println("num1*num2等於" + (num1 * num2))
    println("num1/num2等於" + (num1 / num2))
    println("num1%num2等於" + (num1 % num2))
    var a = 0
    var b = 0
    var c = 0
    b = a++    
    c = ++a    
    println("因為是在指定值之後才遞增,所以b的值為" + b)
    println("因為是在遞增之後才指定值,所以c的值為" + c)
}