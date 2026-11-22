fun main() {
    val vc: Array<Vehicle> = arrayOf(
        Car(1234, 20.5),
        Plane(232) )

    for (i in vc.indices) {
        vc[i].show()
    }
}

abstract class Vehicle {
    abstract fun show()
}

class Car(private val num: Int, private val gas: Double) : Vehicle() {
    init {
        println("生產了車號為${num}，汽油量為${gas}的車子")
    }

    override fun show() {
        println("車號是${num}")
        println("汽油量是${gas}")
    }
}

class Plane(private val flight: Int) : Vehicle() {
    init {
        println("生產了${flight}班次的飛機")
    }

    override fun show() {
        println("飛機的班次是${flight}")
    }
}