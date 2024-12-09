package exercises

fun exercise20() {
    print("Introduce los números para el array (separados por espacio): ")
    val stringToEnter = readlnOrNull()
    if (stringToEnter == null) {
        println("Array no válido")
        return
    }

    fun searchFirstNumberNotInArray(stringOfNumbers: String) {
        val arrayOfNumbers = stringOfNumbers.split(" ").mapNotNull { element -> element.toIntOrNull() }.toIntArray()
        for (j in 1..1000000) {
            if (j !in arrayOfNumbers) {
                println("$j no está en el array")
                break
            }
        }
    }
    searchFirstNumberNotInArray(stringToEnter)
}