fun main() {
    val car1: Car
    car1 = Car()

    car1.show()

    val number = 1234
    val gasoline = 20.5
    val str = "1號車"

    car1.setCar(number, gasoline)
    car1.setName(str)   // 引數 str 是一個指向字串物件的類別型態變數

    car1.show()
}

// Car類別
class Car {
    private var num: Int = 0
    private var gas: Double = 0.0
    private var name: String = ""   // 使用類別型態變數作為欄位

    constructor() {
        num = 0
        gas = 0.0
        name = "沒有名稱"
        println("生產了車子")
    }

    fun setCar(n: Int, g: Double) {
        num = n
        gas = g
        println("將車號設為" + num + "，汽油量設為" + gas)
    }

    fun setName(nm: String) {   // 使用類別型態變數作為參數
        name = nm
        println("將車名設為" + name)
    }

    fun show() {
        println("車號是" + num)
        println("汽油量是" + gas)
        println("車名是" + name)
    }
}