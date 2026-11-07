fun main() {
    val car1: Car
    car1 = Car()

    car1.setNum(1234)     // 傳遞引數 1234 來呼叫 setNum 方法
    car1.setGas(20.5)     // 傳遞引數 20.5 來呼叫 setGas 方法
}

// Car類別
class Car {
    var num: Int = 0
    var gas: Double = 0.0

    fun setNum(n: Int) {          // 接收 Int 型別引數的參數 n
        num = n
        println("將車號設為" + num)
    }

    fun setGas(g: Double) {       // 接收 Double 型別引數的參數 g
        gas = g
        println("將汽油量設為" + gas)
    }
}