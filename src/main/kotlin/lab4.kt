fun squareSum(numbersList: List<Int?>): Int {
    var sum = 0
    for (number in numbersList) {
        if (number != null) {
            sum += number * number
        }
    }
    return sum
}

fun main() {
//    val numbers = listOf(1, 2, null, 3, null, -1, -5)
    val numbers = listOf<Int>()
    println("Sum of squares of non-zero values = " + squareSum(numbers))

}