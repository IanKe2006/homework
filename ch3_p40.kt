import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    println("請輸入字串。")

    val br = BufferedReader(InputStreamReader(System.`in`))

    val str1 = br.readLine()

    println("請輸入要新增的字串。")

    val str2 = br.readLine()

    val sb = StringBuffer(str1)   // 從 StringBuffer 建立物件 sb 並傳入字串 str1
    sb.append(str2)               // 將字串 str2 接到字串緩衝區後面

    println("在「" + str1 + "」後新增「" + str2 + "」的話，就會變成「" + sb + "」。")
}