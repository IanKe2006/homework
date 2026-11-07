fun main() {
    val car1: Car
    car1 = Car()

    car1.setCar(1234, 20.5)
    car1.show()

    println("只變更車號")
    car1.setCar(2345)
    car1.show()

    println("只變更汽油量")
    car1.setCar(30.5)
    car1.show()
}

// Car類別
class Car {
    private var num: Int = 0
    private var gas: Double = 0.0

    fun setCar(n: Int) {
        num = n
        println("將車號設為" + num)
    }

    fun setCar(g: Double) {
        gas = g
        println("將汽油量設為" + gas)
    }

    fun setCar(n: Int, g: Double) {
        num = n
        gas = g
        println("將車號設為" + num + "，汽油量設為" + gas)
    }

    fun show() {
        println("車號是" + this.num)
        println("汽油量是" + this.gas)
    }
}