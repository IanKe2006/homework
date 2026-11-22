fun main() {
    try {
        val test=IntArray(5)
        println("將值指定給test[10]")
        test[10]=80
        println("將80指定給test[10]")
    } catch (e: ArrayIndexOutOfBoundsException) {
        println("超出陣列範圍")
    }
    println("順利地執行完畢")
}