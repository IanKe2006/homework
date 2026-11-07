fun main() {
    val car1: Car
    car1 = Car()

    car1.num = 1234
    car1.gas = 20.5

    car1.show()   // 呼叫方法
    car1.show()   // 再一次呼叫方法
}

// Car類別
class Car {
    var num: Int = 0
    var gas: Double = 0.0

    fun show() {   // 定義方法
        println("車號是" + num)
        println("汽油量是" + gas)
    }
}