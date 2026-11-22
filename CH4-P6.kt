fun main() {
    val rccar1 = RacingCar(1234,20.5,5)
}

open class Car() {
    private var num: Int = 0
    private var gas: Double = 0.0

    init {
        gas = 0.0
        num = 0
        println("生產了車子")
    }
    fun Car(n: Int, g: Double) {
        num = n
        gas = g
        println("生產了車號為${num}，汽油量為${gas}的車子")
    }

    fun setCar(n: Int, g: Double) {
        num = n
        gas = g
        println("將車號設為${num}，汽油量設為${gas}")
    }

    fun show() {
        println("車號是${num}")
        println("汽油量是${gas}")
    }
}

class RacingCar() : Car() {
    private var course: Int = 0

    init {
        course = 0
        println("生產了賽車")
    }

    constructor(n: Int, g: Double, c: Int) : this() {
        super.Car(n, g)
        course = c
        println("生產了編號為${course}的賽車")
    }

    fun setCourse(c: Int) {
        course = c
        println("將賽車的編號設為${course}")
    }
}