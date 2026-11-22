fun main() {
    val car1 = Car(1234, 20.5)
    car1.vShow()
    car1.mShow()
}

interface iVehicle {
    fun vShow()
}

interface iMaterial {
    fun mShow()
}
class Car(private var num: Int, private var gas: Double) : iVehicle, iMaterial {
    init {
        println("生產了車號為${num}，汽油量為${gas}的車子")
    }

    override fun vShow() {
        println("車號是${num}")
        println("汽油量是${gas}")
    }

    override fun mShow() {
        println("車子的材質是鐵")
    }
}