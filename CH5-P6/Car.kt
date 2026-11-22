class Car {
    private var num: Int = 0
    private var gas: Double = 0.0

    init {
        num = 0
        gas = 0.0
        println("已生產了汽車")
    }

    fun setCar(n: Int, g: Double) {
        num = n
        gas = g
        println("將車號設為${num}汽油量設為${gas}")
    }

    fun show() {
        println("車號是${num}")
        println("汽油量是${gas}")
    }
}