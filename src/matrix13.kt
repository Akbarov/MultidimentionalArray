fun main() {
    val m = 4

    val matrix = Array(m) { i -> IntArray(m) { j -> i * m + j + 1 } }
    val newMatrix = Array(m) { IntArray(m) }
    var counter = 0
    for (row in matrix.indices) {
        for (column in 0 until m - row) {
            newMatrix[counter / m][counter % m] = matrix[row][column]// for saving to new matrix
            counter++
//            print("${matrix[row][column]}  ") if we just want to print
        }
        for (innerRow in row + 1 until m) {
            newMatrix[counter / m][counter % m] = matrix[innerRow][m - 1 - row]// for saving to new matrix
            counter++
            //            print("${matrix[innerRow][m - 1 - row]}  ") if we just want to print

        }

    }
    // just print old matrix and see the result change
    for (row in matrix) {
        for (column in row) {
            print("$column  ")
        }
        println()
    }
    println()
    println()
    //this is the new matrix
    for (row in newMatrix) {
        for (column in row) {
            print("$column  ")
        }
        println()
    }
}