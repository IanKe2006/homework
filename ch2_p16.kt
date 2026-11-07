import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    println("請輸入a或b")

    val br = BufferedReader(InputStreamReader(System.`in`))

    val str = br.readLine()
    val letter = str[0]   // 取索引值為 0 的字元，相當於 charAt(0)

    when (letter) {
        'a' -> {
            println("輸入的是a")
        }
        'b' -> {
            println("輸入的是b")
        }
        else -> {
            println("請輸入a或b")
        }
    }
}