fun main() {
    val array = intArrayOf(1,2,3,4,5,6,7,8,9,10)
    if (array.size % 2 == 0) {
        for (index in 1 until array.size step 2 ) {
            val item = array[index]
            array[index] = array[index-1]
            array[index-1] = item
        }
        print(array.contentToString())
    }else{
        print("Array elementlari juft emas")
    }
}