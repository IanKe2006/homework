fun main() {
    val test = IntArray(5)   // 對應 int[] test; test = new int[5];

    test[0] = 80
    test[1] = 60
    test[2] = 22
    test[3] = 50
    test[4] = 75

    for (i in 0 until 5) {
        println("第" + (i + 1) + "個人的分數是" + test[i] + "分")
    }
}