package exercises

fun checkIfNumberIsInArray() {
    print("Introduce los números para el array (separados por espacio): ")
    val arrayToEnter= readlnOrNull()

    print ("Número a buscar: ")
    val numberToEnter= readlnOrNull()?.toInt()
    if (numberToEnter == null) {
        println("El número no es válido.")
        return
    }
    fun searchNumberInArray(stringOfNumbers: String?, numberToSearch: Int) {
        val arrayOfNumbers = stringOfNumbers?.split(" ")?.mapNotNull { element->element.toIntOrNull() }?.toIntArray()
        if (arrayOfNumbers == null || arrayOfNumbers.isEmpty()) {
            println("El array no es válido o está vacío.")
            return
        }
        if (numberToSearch in arrayOfNumbers) println("$numberToSearch está en el array") else println("$numberToSearch no está en el array")
    }
    searchNumberInArray(arrayToEnter, numberToEnter)
}