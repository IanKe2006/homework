import java.io.BufferedReader
import java.io.FileReader
import java.io.IOException

fun main() {
    try {
        val br = BufferedReader(FileReader("text2.txt"))
        val str1 = br.readLine()
        val str2 = br.readLine()
        println("寫入檔案中的兩個字是\n${str1}\n${str2}")
        br.close()
        println("已將資料讀入檔案")
    } catch (e: IOException) {
        println("輸入輸出有誤")
    }
}