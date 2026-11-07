fun main() {
    val car1: Car
    car1 = Car()

    car1.num = 1234
    car1.gas = 20.5

    car1.showCar()
}

// Car類別
class Car {
    var num: Int = 0
    var gas: Double = 0.0

    fun show() {
        println("車號是" + this.num)     // this 可不加
        println("汽油量是" + this.gas)
    }

    fun showCar() {
        println("開始顯示車子資料")
        this.show()                     // 呼叫物件本身的方法
    }
}