fun main() {
    var car1 = Car()
    var car2 = Car()
    var car3 = Car()
    car3=car1
    println("car1與car2相同${car1.equals(car2)}")
    println("car1與car3相同${car1.equals(car3)}")
}

open class Car() {
    protected var num: Int = 0
    protected var gas: Double = 0.0

    init {
        gas=0.0
        num=0
        println("生產了車子")
    }
}