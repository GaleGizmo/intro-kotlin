package exercises

fun countRepetitionsOfNumberInArray(){
    print("Introduce los números para el array (separados por espacio): ")
    val stringToEnter= readlnOrNull()

    print ("Número a buscar: ")
    val numberToEnter= readlnOrNull()?.toInt()
    if (numberToEnter == null) {
        println("El número no es válido.")
        return
    }
    fun countNumberInArray(stringOfNumbers:String?, numberToCount:Int){
        val listOfNumbers = stringOfNumbers?.split(" ")?.mapNotNull { element->element.toIntOrNull() }
        val count=listOfNumbers?.count{element->element==numberToCount}?:0

        if (count>0) println("El $numberToCount aparece $count veces") else println("El $numberToCount no aparece")
    }
    countNumberInArray(stringToEnter, numberToEnter)
}