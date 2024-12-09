package exercises

fun exercise10(){
    print("Ingresa frase: ")
    val phrase= readlnOrNull().toString()
    print ("Carácter a sustituir: ")
    val chr1= readlnOrNull().toString()
    print ("Nuevo carácter: ")
    val chr2= readLine().toString()

    fun replaceCharacter(phraseToEdit:String, oldchr:String, newchr:String):String {
        return if (oldchr in phraseToEdit) phraseToEdit.replace(oldchr, newchr) else "Ese carácter no está en la frase"
    }
    println("Resultado: "+replaceCharacter(phrase, chr1, chr2))
}