import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    println("請輸入整數")

    val br = BufferedReader(InputStreamReader(System.`in`))

    val num = br.readLine().toInt()

    // 模擬沒有 break 的 fall-through
    var matched = false

    if (num == 1) {
        matched = true
        println("輸入的是1")
    }
    if (matched || num == 2) {
        matched = true
        println("輸入的是2")
    }
    // default 一定會執行（因為前面已經 fall-through 到這裡）
    println("請輸入1或2")
}