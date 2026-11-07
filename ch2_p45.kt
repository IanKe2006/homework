import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))

    println("請輸入5個人的分數")
    val test = IntArray(5)

    // 依序讀入數字
    for (i in 0 until test.size) {
        val str = br.readLine()
        test[i] = str.toInt()
    }

    // 氣泡排序（由大到小）
    for (s in 0 until test.size - 1) {
        for (t in s + 1 until test.size) {
            if (test[t] > test[s]) {
                val tmp = test[t]
                test[t] = test[s]
                test[s] = tmp
            }
        }
    }

    for (i in 0 until test.size) {
        println("第" + (i + 1) + "名的分數是" + test[i])
    }
}