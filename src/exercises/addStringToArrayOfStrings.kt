package exercises
//añade un string a un array de strings
fun exercise19() {
    print("Introduce los strings para el array (separados por comas): ")
    val stringOfStringsToEnter= readlnOrNull()
    print("Introduce el string a añadir: ")
    val stringToAdd= readlnOrNull()
    if (stringToAdd==null || stringOfStringsToEnter==null) {
        println("Datos no validos")
        return
    }

    fun addStringToArray(stringOfStrings:String, newString:String){
        //convierte el string introducido en una lista
        val listOfStrings = stringOfStrings.split(",").map { it.trim() }.filter { it.isNotBlank() }
        //convierte la lista en mutable
        val mutableList=listOfStrings.toMutableList()
        //añade el nuevo string
        mutableList.add(newString.trim())
        //convierte la lista en array
        val arrayOfStrings=mutableList.toTypedArray()
        println("Array final: ${arrayOfStrings.joinToString (", ")}")
    }
    addStringToArray(stringOfStringsToEnter, stringToAdd)
}