fun main() {
    val m = 4
    val n = 4
    val matrix = Array(m) { i -> IntArray(n) { j -> i * m + j + 1 } }
    for (row in matrix) {
        var sum = 0
        print(row.contentToString())
        println("sum of all elements of the row is ${row.sum()}")
    }
}