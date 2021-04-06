fun main() {
    val m = 4
    val n = 5
    val k1 = 1
    val k2 = 3
    val matrix = Array(m) { i -> IntArray(n) { j -> i * m + j + 1 } }
    for (row in matrix) {
        println(row.contentToString())
    }
    var tempArray = IntArray(m)
    for (column in 0 until n) {
        if (column == k1) {
            for (row in 0 until m) {
                tempArray[row] = matrix[row][column]
            }
        }
        if (column == k2) {
            for (row in 0 until m) {
                matrix[row][k1] = matrix[row][k2]
                matrix[row][k2] = tempArray[row]
            }
        }
    }

    println()
    println()
    for (row in matrix) {
        println(row.contentToString())
    }

}