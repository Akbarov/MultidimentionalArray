fun main() {
//    var cinema = arrayOf(arrayOf(12, 3, 3), arrayOf(1, 3, 4, 5))
//    var array = Array(2) { IntArray(3) }
//    var multi = Array(3){Array(3){IntArray(4)} }
//
//    val initArray = Array(5){i -> IntArray(5){j-> i*5+j+1} }
//    print(initArray.contentDeepToString())
//    for (row in initArray) {
//        println(row.contentToString())
//    }
    var array = Array(10){i ->IntArray(10){j -> (j*5)} }
    for (row in array) {
        println(row.contentToString())
    }
}