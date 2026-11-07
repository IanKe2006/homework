fun main() {
    val car1: Car
    car1 = Car()

    car1.num = 1234
    car1.gas = 20.5

    val car2: Car
    car2 = Car()

    car2.num = 2345
    car2.gas = 30.5

    println("car1車號是" + car1.num)
    println("car1汽油量是" + car1.gas)

    println("car2車號是" + car2.num)
    println("car2汽油量是" + car2.gas)
}

// Car類別
class Car {
    var num: Int = 0
    var gas: Double = 0.0
}