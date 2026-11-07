import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    println("請問要選哪條路線?")
    println("請輸入整數")
    val br = BufferedReader(InputStreamReader(System.`in`))

    val str = br.readLine()
    val res = str.toInt()

    val ans = if (res == 1) 'A' else 'B'

    println("選擇了" + ans + "路線")
}