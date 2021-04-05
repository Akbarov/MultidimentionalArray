fun main() {
    val m = 4
    val n = 3
    val matrix = Array(m) { i -> IntArray(n) { j -> i * m + j + 1 } }
    println(matrix.contentDeepToString())
    println()
    // this is a simple way to solve the problem but there is a simple mistake to print the matrix
    // rows and columns changed
    for (i in 0 until n){
        for (j in 0 until m){
            if (i%2==0){
                print("${matrix[j][i]}  ")
            }else{
                print("${matrix[m-j-1][i]}  ")
            }
        }
        println()
    }
    println("this is a correct version of printing the resulting matrix")
    /// what i did here
    for (row in 0 until m) {
        for (column in 0 until n) {
            // this prints from top to bottom
                // if column is even column
            if (column % 2 == 0) {
                print("${matrix[row][column]}  ")
            }
            // this prints from bottom to top
            else{

                print("${matrix[matrix.size-row-1][column]}  ")
            }
        }
        println()
    }
}