fun main() {
    val car1: Car
    car1 = Car()

    car1.num = 1234
    car1.gas = -10.0     // 指定錯誤的汽油量資料

    car1.show()
}

// Car類別
class Car {
    var num: Int = 0
    var gas: Double = 0.0

    fun show() {
        println("車號是" + this.num)
        println("汽油量是" + this.gas)
    }
}