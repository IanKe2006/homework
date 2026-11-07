import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    println("請輸入整數")

    val br = BufferedReader(InputStreamReader(System.`in`))

    val num = br.readLine().toInt()

    if (num == 1) {
        println("輸入的是1")
        println("選擇的是1")
    }

    println("結束處理")
}