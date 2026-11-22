class Company {
    private var sum = 0

    fun add(a: Int) {
        var tmp = sum
        println("目前的合計金額是${tmp}元")
        println("賺到${a}元了。")
        tmp += a
        println("合計金額是${tmp}元")
        sum = tmp
    }
}

class Driver(private val comp: Company) : Thread() {
    override fun run() {
        for (i in 0 until 3) {
            comp.add(50)
        }
    }
}

fun main() {
    val cmp = Company()
    val drv1 = Driver(cmp)
    drv1.start()

    val drv2 = Driver(cmp)
    drv2.start()
}