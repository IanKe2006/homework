class Car(private val name: String) : Thread() {
    override fun run() {
        for (i in 0 until 5) {
            println("正在進行${name}的處理工作")
        }
    }
}

fun main() {
    val car1 = Car("1號車")
    car1.start()
    try {
        car1.join()
    } catch (e: InterruptedException) {
    }
    println("結束main的處理工作")
}