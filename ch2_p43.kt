fun main() {
    val test = intArrayOf(80, 60, 22, 50, 75)

    for (i in 0 until test.size) {
        println("第" + (i + 1) + "個人的分數是" + test[i] + "分")
    }

    println("考試人數為" + test.size + "人")
}