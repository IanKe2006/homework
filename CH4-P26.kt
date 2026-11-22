fun main() {
    val car: Array<Car> = arrayOf(Car(), RacingCar())
    car[0]=Car()
    car[1]=RacingCar()
    for (i in car.indices) {
        val cl=car[i].javaClass
        println("第${i + 1}個物件的類別是$cl")
    }
}

open class Car() {
    protected var num: Int = 0
    protected var gas: Double = 0.0

    init {
        gas = 0.0
        num = 0
        println("生產了車子")
    }
}

class RacingCar() : Car() {
    private var course: Int = 0

    init {
        course = 0
        println("生產了賽車")
    }
}