fun main() {
    val m = 4
    val n = 5
    val matrix = Array(m) { i -> IntArray(n) { j -> i * m + j + 1 } }
    for (row in matrix) {
        println(row.contentToString())
    }
    for (column in 0 until n ) {
        var result = 1
        for (row in 0 until m) {
            result*=matrix[row][column]
        }
        print("$result, ")
    }
    println()
    for (row in 0 until m) {
        var result = 1
        for (column in 0 until n) {
            result *= matrix[row][column]
        }
        print("$result, ")
    }

}