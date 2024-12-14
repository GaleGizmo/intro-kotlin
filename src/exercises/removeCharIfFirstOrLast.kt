package exercises

fun exercise11(){
    print("Ingresa frase: ")
    val phrase= readlnOrNull()
    print ("Carácter a sustituir: ")
    val char= readlnOrNull()

    fun deleteIfFirstOrLastChar(phraseToEdit: String, chr: String): String {
        val charToRemove = chr[0]
        var editedPhrase:String=phraseToEdit
        if (phraseToEdit.startsWith(charToRemove)) editedPhrase=editedPhrase.substring(1)
        if  (phraseToEdit.endsWith(charToRemove)) editedPhrase=editedPhrase.dropLast(1)
        return  if (phraseToEdit==editedPhrase) "El caracter no está en la frase " else editedPhrase
    }

    if (phrase!=null && char!=null && phrase!="" && char!="") {
        println("Resultado: " + deleteIfFirstOrLastChar(phrase, char))
    } else println("Intoduce datos válidos")
}