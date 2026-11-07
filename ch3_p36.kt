fun main() {
    val str = "Hello"      // 相當於 String str = new String("Hello");

    val ch1 = str[0]       // 取得字串的第一個字元，對應 charAt(0)
    val ch2 = str[1]       // 取得字串的第二個字元，對應 charAt(1)

    val len = str.length   // 取得字串長度，對應 length()

    println(str + "的第一個字元是" + ch1)
    println(str + "的第二個字元是" + ch2)
    println(str + "的長度是" + len)
}