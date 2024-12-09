package exercises

fun exercise18(){
    print("Introduce los números para el array (separados por espacio): ")
    val stringToEnter= readlnOrNull()

    fun sortNumbers(stringOfNumbers:String?){
        val arrayOfNumbers = stringOfNumbers?.split(" ")?.mapNotNull { element->element.toIntOrNull() }?.toIntArray()
        if (arrayOfNumbers!=null) {
            val sizeOfArray = arrayOfNumbers.size
            for (i in 0..<sizeOfArray - 1) {
                for (j in 0..<sizeOfArray - i - 1) {
                    if (arrayOfNumbers[j] > arrayOfNumbers[j + 1]) {

                        val temp = arrayOfNumbers[j]
                        arrayOfNumbers[j] = arrayOfNumbers[j + 1]
                        arrayOfNumbers[j + 1] = temp
                    }
                }
            }
        }
        println(arrayOfNumbers?.joinToString(", "))
    }
sortNumbers(stringToEnter)
}