import java.io.BufferedWriter
import java.io.FileWriter
import java.io.IOException
import java.io.PrintWriter
fun main() {
    try {
        val fw= FileWriter("text1.txt")
        val pw= PrintWriter(BufferedWriter(fw))
        pw.println("Hello")
        pw.println("Goodbye!")
        pw.close()
        println("已將資料寫入檔案")
    } catch (e: IOException) {
        println("輸入輸出有誤")
    }
}