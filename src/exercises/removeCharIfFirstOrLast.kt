package exercises

fun removeCharIfFirstOrLast(){
    print("Ingresa frase: ")
    val phrase= readlnOrNull()
    print ("Carácter a eliminar: ")
    val char= readlnOrNull()

    fun deleteIfFirstOrLastChar(phraseToEdit: String, chr: String): String {
        val charToRemove = chr[0]
        var editedPhrase:String=phraseToEdit
        if (phraseToEdit.startsWith(charToRemove)) editedPhrase=editedPhrase.substring(1)
        if  (phraseToEdit.endsWith(charToRemove)) editedPhrase=editedPhrase.dropLast(1)
        return  if (phraseToEdit==editedPhrase) "El carácter no está en el inicio ni el final de la frase." else editedPhrase
    }

    if (phrase!=null && char!=null && phrase!="" && char!="") {
        println("Resultado: " + deleteIfFirstOrLastChar(phrase, char))
    } else println("Intoduce datos válidos")
}