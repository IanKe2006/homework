class Car(private val name: String) : Runnable {
    override fun run() {
        for (i in 0 until 5) {
            println("正在進行${name}的處理工作")
        }
    }
}

fun main() {
    val car1 = Car("1號車")
    val thread1 = Thread(car1)
    thread1.start()
    for (i in 0 until 5) {
        println("正在進行main()的處理工作")
    }
}