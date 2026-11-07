import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    println("請輸入整數")

    val br = BufferedReader(InputStreamReader(System.`in`))

    val num = br.readLine().toInt()

    if (num == 1) {
        println("輸入的是1")
    } else if (num == 2) {
        println("輸入的是2")
    } else {
        println("請輸入1或2")
    }
}