import kotlin.math.max

fun main() {
    var array = intArrayOf(1,2,3,4,5,6,7,7,7,4,5)
    var n = array.size
    val k = 3
    var counter = 1
    var maxLength = 0
    var length =1
    var endIndex =0
    var item = array[0]
    while (counter<n){
        if (item==array[counter]){
            length++
            endIndex = counter
        }else{
            item = array[counter]
            length = 1
        }
        if (maxLength < length) {
            maxLength = length
        }
        counter++
    }
    var newArray = IntArray(0)
    if (maxLength==k){
        for (i in array.indices){
           if (endIndex!=i){
               newArray+=array[i]
           }else{
               for (j in 0 .. k) {
                   newArray+=array[i]
               }
           }
        }
    }
    print(newArray.contentToString())
}