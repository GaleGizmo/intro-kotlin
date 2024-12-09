package exercises

fun exercise19() {
    print("Introduce los strings para el array (separados por espacio): ")
    val stringOfStringsToEnter= readlnOrNull()
    print("Introduce el string a añadir: ")
    val stringToAdd= readlnOrNull()
    if (stringToAdd==null || stringOfStringsToEnter==null) {
        println("Datos no validos")
        return
    }

    fun addStringToArray(stringOfStrings:String, newString:String){
        val listOfStrings = stringOfStrings.split(" ")
        val mutableList=listOfStrings.toMutableList()
        mutableList.add(newString)
        val arrayOfStrings=mutableList.toTypedArray()
        println("Array final: ${arrayOfStrings.joinToString (", ")}")
    }
    addStringToArray(stringOfStringsToEnter, stringToAdd)
}