import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.Arrays
import java.util.Collections

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))

    println("請輸入5個人的分數")
    val test = Array<Int>(5) { 0 }   // 對應 Integer test[] = new Integer[5]

    for (i in 0 until test.size) {
        val str = br.readLine()
        test[i] = str.toInt()
    }

    Arrays.sort(test, Collections.reverseOrder())

    for (i in 0 until test.size) {
        println("第" + (i + 1) + "名的分數是" + test[i])
    }
}