fun main() {
    println("宣告car1")
    val car1: Car
    car1 = Car()
    car1.setCar(1234, 20.5)

    println("宣告car2")
    val car2: Car

    println("將car1指定給car2")
    car2 = car1

    print("car1的")
    car1.show()

    print("car2的")
    car2.show()

    println("改變car1的相關資料")
    car1.setCar(2345, 30.5)

    print("car1的")
    car1.show()

    print("car2的")
    car2.show()
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