import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    println("請輸入字串")

    val br = BufferedReader(InputStreamReader(System.`in`))

    val str1 = br.readLine()

    println("請輸入要檢索的文字")

    val str2 = br.readLine()
    val ch = str2[0]

    val num = str1.indexOf(ch)   // 搜尋 ch 在 str1 內的位置，找不到會傳回 -1

    if (num != -1)
        println(str1 + "的第" + (num + 1) + "個字就是「" + ch + "」")
    else
        println(str1 + "中沒有「" + ch + "」這個字")
}