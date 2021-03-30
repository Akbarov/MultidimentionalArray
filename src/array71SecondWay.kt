fun main() {
    val array = IntArray(10){i -> i }
    println(array.contentToString())
    println(myReverse(array).contentToString())
    println(array.reverse())

}
 fun myReverse(array: IntArray):IntArray{
     var start = 0
     var end = array.size-1
     while (start < end) {
         val item = array[end]
         array[end] = array[start]
         array[start] = item
         start++
         end--
     }
     return array
 }