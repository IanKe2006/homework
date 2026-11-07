import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    println("要跳過第幾次的處理呢?(1~10)")
    val br = BufferedReader(InputStreamReader(System.`in`))

    val str = br.readLine()
    val res = str.toInt()

    for (i in 1..10) {
        if (i == res) {
            continue
        }
        println("第" + i + "次的處理。")
    }
}