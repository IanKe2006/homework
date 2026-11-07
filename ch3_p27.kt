fun main() {
    val car1: Car
    car1 = Car()                 // 呼叫沒有參數的建構式
    car1.show()

    val car2: Car
    car2 = Car(1234, 25.0)       // 呼叫兩個參數的建構式
    car2.show()
}

// Car類別
class Car {
    private var num: Int = 0
    private var gas: Double = 0.0

    constructor() {              // 沒有參數的建構式
        num = 0
        gas = 0.0
        println("生產了車子")
    }

    constructor(n: Int, g: Double) {   // 兩個參數的建構式
        num = n
        gas = g
        println("生產了車號為" + num + "，汽油量為" + gas + "的車子")
    }

    fun show() {
        println("車號是" + num)
        println("汽油量是" + gas)
    }
}