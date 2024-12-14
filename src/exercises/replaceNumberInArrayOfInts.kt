package exercises

fun replaceNumberInArrayOfInts(){
    print("Introduce los números para el array (separados por espacio): ")
    val arrayToEnter= readlnOrNull()

    print ("Número a introducir: ")
    val numberToEnter= readlnOrNull()?.toInt()
    if (numberToEnter == null) {
        println("El número no es válido.")
        return
    }
    print("Posición en el array: ")
    val position= readlnOrNull()?.toInt()
    if (position == null ) {
        println("La posición no es válida.")
        return
    }

    fun replaceElementOfArray(stringOfNumbers: String?, newElement: Int, placeInArray: Int) {
        val listOfNumbers = stringOfNumbers?.split(" ")?.mapNotNull { element->element.toIntOrNull() }
        if (listOfNumbers.isNullOrEmpty()) {
            println("El array no es válido o está vacío.")
            return
        }
        if (placeInArray < 0 || placeInArray >= listOfNumbers.size) {
            println("La posición está fuera de rango.")
            return
        }
        val mutableListOfNumbers = listOfNumbers.toMutableList()
        mutableListOfNumbers.add(placeInArray, newElement)
        val arrayOfNumbers=mutableListOfNumbers.toIntArray()

        println("Array modificado: ${arrayOfNumbers.joinToString(", ")}")

    }
    replaceElementOfArray(arrayToEnter, numberToEnter, position)
}