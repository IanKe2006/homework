import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    println("請輸入兩個整數")

    val br = BufferedReader(InputStreamReader(System.`in`))

    val str1 = br.readLine()
    val str2 = br.readLine()

    val num1 = Integer.parseInt(str1)
    val num2 = Integer.parseInt(str2)

    val ans = Math.max(num1, num2)   // 找出 num1 和 num2 中的最大值

    println(num1.toString() + "與" + num2 + "中較大的是" + ans)
}