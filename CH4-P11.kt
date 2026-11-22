fun main() {
    val rccar1 = RacingCar()
    rccar1.setCar(1234, 20.5)
    rccar1.setCourse(5)
    rccar1.show()
}

open class Car() {
    protected var num: Int = 0
    protected var gas: Double = 0.0

    init {
        gas = 0.0
        num = 0
        println("生產了車子")
    }

    fun setCar(n: Int, g: Double) {
        num = n
        gas = g
        println("將車號設為${num}，汽油量設為${gas}")
    }

    open fun show() {
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
    fun setCourse(c: Int) {
        course = c
        println("將賽車的編號設為${course}")
    }
    override fun show() {
        println("賽車的車號是${num}")
        println("汽油量是${gas}")
        println("賽車編號是${course}")
    }
}