import java.lang.reflect.Array

fun main() {
    val intArray = Array.newInstance(Int::class.java, 3) as IntArray

    Array.set(intArray, 0, 123)
    Array.set(intArray, 1, 456)
    Array.set(intArray, 2, 789)

    println("intArray[0] = " + Array.get(intArray, 0))
    println("intArray[1] = " + Array.get(intArray, 1))
    println("intArray[2] = " + Array.get(intArray, 2))
}