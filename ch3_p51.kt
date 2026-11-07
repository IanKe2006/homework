fun main() {
    val car1: Array<Car?> = arrayOfNulls(3)   // 準備好 Car 型態陣列，宣告三個元素

    for (i in 0 until car1.size) {
        car1[i] = Car()                       // 建立三個新物件，分別指定給三個陣列元素
    }

    car1[0]!!.setCar(1234, 20.5)
    car1[1]!!.setCar(2345, 30.5)
    car1[2]!!.setCar(3456, 40.5)

    for (i in 0 until car1.size) {
        car1[i]!!.show()
    }
}

// Car類別
class Car {
    private var num: Int = 0
    private var gas: Double = 0.0

    constructor() {
        num = 0
        gas = 0.0
        println("生產了車子")
    }

    fun setCar(n: Int, g: Double) {
        num = n
        gas = g
        println("將車號設為" + num + "，汽油量設為" + gas)
    }

    fun show() {
        println("車號是" + num)
        println("汽油量是" + gas)
    }
}