package exercises


fun sortArrayOfNumbers(){
    print("Introduce los números para el array (separados por espacio): ")
    val stringToEnter= readlnOrNull()

    fun sortNumbers(stringOfNumbers:String?){
        val arrayOfNumbers = stringOfNumbers?.split(" ")?.mapNotNull { element->element.toIntOrNull() }?.toIntArray()
        arrayOfNumbers?.let { numbers ->
            val sizeOfArray = numbers.size
            for (i in 0..<sizeOfArray - 1) {
                for (j in 0..<sizeOfArray - i - 1) {
                    if (numbers[j] > numbers[j + 1]) {
                        val temp = numbers[j]
                        numbers[j] = numbers[j + 1]
                        numbers[j + 1] = temp
                    }
                }
            }
        }

        println(arrayOfNumbers?.joinToString(", "))
    }
sortNumbers(stringToEnter)
}