import java.io.BufferedReader
import java.io.IOException
import java.io.InputStreamReader

fun main() {
    println("請輸入字串")
    try {
        val br = BufferedReader(InputStreamReader(System.`in`))
        val str = br.readLine()
        println("已輸入字串${str}")
    } catch (e: IOException) {
        println("輸入輸出有誤")
    }
}