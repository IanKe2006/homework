fun main() {
    val car1: Car
    car1 = Car()

    car1.num = 1234
    car1.gas = 20.5

    println("車號是" + car1.num)
    println("汽油量是" + car1.gas)
}

// Car類別
class Car {
    var num: Int = 0
    var gas: Double = 0.0
}