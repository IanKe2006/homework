import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    println("請輸入整數")

    val br = BufferedReader(InputStreamReader(System.`in`))

    val num = br.readLine().toInt()

    when (num) {
        1 -> {
            println("輸入的是1")
        }
        2 -> {
            println("輸入的是2")
        }
        else -> {
            println("請輸入1或2")
        }
    }
}