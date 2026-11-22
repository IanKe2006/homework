fun main() {
    val vc: Array<Vehicle> = arrayOf(
        Car(1234, 20.5),
        Plane(232) )

    for (i in vc.indices) {
        if (vc[i] is Car) {
            println("第${i + 1}個物件是Car類別")
        } else {
            println("第${i + 1}個物件不是Car類別")
        }
        
    }
}

abstract class Vehicle {
    private var _speed: Int = 0
    protected val speed: Int
        get() = _speed

    fun setSpeed(s: Int) {
        _speed = s
        println("將速度設為${_speed}了")
    }

    abstract fun show()
}

class Car(private val num: Int, private val gas: Double) : Vehicle() {
    init {
        println("生產了車號為${num}，汽油量為${gas}的車子")
    }

    override fun show() {
        println("車號是${num}")
        println("汽油量是${gas}")
        println("速度是${speed}")
    }
}

class Plane(private val flight: Int) : Vehicle() {
    init {
        println("生產了${flight}班次的飛機")
    }

    override fun show() {
        println("飛機的班次是${flight}")
        println("速度是${speed}")
    }
}