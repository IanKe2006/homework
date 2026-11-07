import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    println("請輸入一個整數")

    val br = BufferedReader(InputStreamReader(System.`in`))

    val str = br.readLine()

    val num = Integer.parseInt(str)

    println("您輸入的數字是:" + num)
}