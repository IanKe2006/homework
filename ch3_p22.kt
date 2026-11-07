fun main() {
    val car1: Car
    car1 = Car()

    car1.setNumGas(1234, 20.5)
    car1.show()

    println("指定不正確的汽油量(-10.0)看看")

    car1.setNumGas(1234, -10.0)
    car1.show()
}

// Car類別
class Car {
    private var num: Int = 0
    private var gas: Double = 0.0

    fun setNumGas(n: Int, g: Double) {
        if (g > 0 && g < 100) {          // 判斷汽油量要在此條件範圍才能更改
            num = n
            gas = g
            println("將車號設為" + num + "，汽油量設為" + gas)
        } else {
            println("" + g + "不是正確的汽油量")
            println("無法變更汽油量")
        }
    }

    fun show() {
        println("車號是" + this.num)
        println("汽油量是" + this.gas)
    }
}