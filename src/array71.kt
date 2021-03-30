fun main() {
    val array = IntArray(10) { i -> i }
    val newArray = IntArray(array.size){i -> array[array.size-i-1] }
    for (j in array.indices)
        for (i in 1 until array.size - j) {
            val item = array[i]
            array[i] = array[i - 1]
            array[i - 1] = item

        }
    print(array.contentToString())
    print(newArray.contentToString())
}