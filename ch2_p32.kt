import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    println("請問要在第幾次處理結束迴圈呢?(1~10)")
    val br = BufferedReader(InputStreamReader(System.`in`))

    val str = br.readLine()
    val res = str.toInt()

    for (i in 1..10) {
        println("第" + i + "次的處理。")
        if (i == res) {
            break
        }
    }
}