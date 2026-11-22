import java.io.BufferedReader
import java.io.FileReader
import java.io.IOException
import kotlin.system.exitProcess

fun main(args: Array<String>) {
    if (args.size != 1) {
        println("請指定正確的檔案名稱")
        exitProcess(1)
    }

    try {
        val br = BufferedReader(FileReader(args[0]))
        var str = br.readLine()
        while (str != null) {
            println(str)
            str = br.readLine()
        }
        br.close()
    } catch (e: IOException) {
        println("輸出入錯誤")
    }
}