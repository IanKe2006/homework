fun main() {
    val car1 = Car()
    car1.setCar(1234, 20.5)
    println(car1.tostring())
}

open class Car() {
    protected var num: Int = 0
    protected var gas: Double = 0.0

    init {
        println("生產了車子")
    }

    fun setCar(n: Int, g: Double) {
        num = n
        gas = g
        println("將車號設為${num}，汽油量設為${gas}")
    }

    fun tostring():String{
        return "車號是${num}汽油量是${gas}"
    }
}