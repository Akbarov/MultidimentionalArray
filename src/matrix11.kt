fun main() {
    val m = 10
    val n = 10
    var matrix = Array(m){i ->IntArray(n){j->i*m+j+1} } // he I create a matrix with default values
    for ((index,array) in matrix.withIndex()) {
       if (index%2==0) println(array.contentToString())
        else {
            array.reverse()
            println(array.contentToString())
       }
    }
}