
fun main() {
    val car1: Car
    car1 = Car()

    car1.setNumGas(1234, 20.5)
    val number = car1.getNum()          // 呼叫有傳回值的 getNum，傳回值指定給 number
    val gasoline = car1.getGas()        // 呼叫有傳回值的 getGas，傳回值指定給 gasoline

    println("調查樣品車時得知")
    println("車號是" + number + "，汽油量是" + gasoline)
}

// Car類別
class Car {
    private var num: Int = 0
    private var gas: Double = 0.0

    fun getNum(): Int {                 // 有傳回值的方法，傳回型別為 Int
        println("調查車號")
        return num
    }

    fun getGas(): Double {              // 有傳回值的方法，傳回型別為 Double
        println("調查汽油量")
        return gas
    }

    fun setNumGas(n: Int, g: Double) {  // 無傳回值的方法
        num = n
        gas = g
        println("將車號設為" + num + "，汽油量設為" + gas)
    }
}