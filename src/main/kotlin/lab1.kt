

fun main() {
    val numbers = listOf(1, 2, 3, 4, 5, 6)
    val letters = listOf('a', 'b', 'c', 'd', 'e')
    val minMaxNumbers = numbers.minAndMax()
    val minMaxLetters = letters.minAndMax()
    println("min element: " + minMaxNumbers?.first + "\nmax element: " + minMaxNumbers?.second)
    println("min element: " + minMaxLetters?.first + "\nmax element: " + minMaxLetters?.second)
}

fun <T : Comparable<T>> List<T>.minAndMax(): Pair<T, T>? {
    if (isEmpty()) return null
    return this.min() to this.max()
}