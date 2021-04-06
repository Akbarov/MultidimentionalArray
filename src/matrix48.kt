fun main() {
    val m = 4
    val n = 5
    val k1 = 1
    val k2  = 3
    val matrix = Array(m) { i -> IntArray(n) { j -> i * m + j + 1 } }
    for (row in matrix) {
        println(row.contentToString())
    }
    for (row in 0 until m) {
        for (column in 0 until n) {
            if (column == k1) {
                var temp = matrix[row][k1]
                matrix[row][k1] =  matrix[row][k2]
                matrix[row][k2] = temp
            }
        }
    }
    println()
    println()
    for (row in matrix) {
        println(row.contentToString())
    }

}