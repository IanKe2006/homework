import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    println("請輸入英文字母")

    val br = BufferedReader(InputStreamReader(System.`in`))

    val str = br.readLine()

    val stru = str.uppercase()   // 將 str 轉成大寫放到 stru
    val strl = str.lowercase()   // 將 str 轉成小寫放到 strl

    println("轉換成大寫時為" + stru)
    println("轉換成小寫時為" + strl)
}