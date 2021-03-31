fun main() {
    var array = Array(10){i ->IntArray(10){i*10} }
    for (row in array) {
        println(row.contentToString())
    }
}