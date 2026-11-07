import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    println("請問你是男生嗎?")
    println("請輸入Y或N")
    val br = BufferedReader(InputStreamReader(System.`in`))

    val str = br.readLine()
    val letter = str[0]

    if (letter == 'Y' || letter == 'y') {
        println("你是男生阿!")
    } else if (letter == 'N' || letter == 'n') {
        println("你是女生阿!")
    } else {
        println("請輸入Y或N")
    }
}