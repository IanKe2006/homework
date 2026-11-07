fun main() {
    val car1: Car
    car1 = Car()

    val number = 1234
    val gasoline = 20.5

    car1.setNumGas(number, gasoline)   // 傳遞2個引數的方法
}

// Car類別
class Car {
    private var num: Int = 0
    private var gas: Double = 0.0

    fun setNumGas(n: Int, g: Double) {   // 這個方法擁有2個參數
        num = n
        gas = g
        println("將車號設為" + num + "，汽油量設為" + gas)
    }

    fun show() {
        println("車號是" + num)
        println("汽油量是" + gas)
    }
}