fun main() {
    val car1: Car
    car1 = Car()      // 建立新物件就會呼叫建構式

    car1.show()
}

// Car類別
class Car {
    private var num: Int = 0
    private var gas: Double = 0.0

    constructor() {   // 建構式（Kotlin 用 constructor 關鍵字，不是類別名稱）
        num = 0
        gas = 0.0
        println("生產了車子")
    }

    fun show() {
        println("車號是" + num)
        println("汽油量是" + gas)
    }
}