fun main() {
    val m = 10
    val n = 5
    val k=8
    var array = Array(m){i ->IntArray(n){j->i*m+j+1} } // he I create a matrix with default values
    for (item in array[k]) {
        print("$item, ")
    }
}