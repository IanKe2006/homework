fun main() {
    Car.showSum()            // 不需要建立物件即可呼叫類別方法

    val car1: Car
    car1 = Car()
    car1.setCar(1234, 20.5)

    Car.showSum()

    val car2: Car
    car2 = Car()
    car2.setCar(4567, 30.5)
}

// Car類別
class Car {
    companion object {
        var sum: Int = 0                  // 類別變數（對應 public static int sum）

        fun showSum() {                   // 類別方法（對應 public static void showSum）
            println("車子總共有" + sum + "台")
        }
    }

    private var num: Int = 0
    private var gas: Double = 0.0

    constructor() {
        num = 0
        gas = 0.0
        sum++
        println("生產了車子")
    }

    fun setCar(n: Int, g: Double) {
        num = n
        gas = g
        println("將車號設為" + num + "，汽油量設為" + gas)
    }

    fun show() {
        println("車號是" + num)
        println("汽油量是" + gas)
    }
}