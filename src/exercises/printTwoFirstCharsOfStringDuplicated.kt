package exercises

fun printTwoFirstCharsOfStringDuplicated(){
        print("Ingresa frase: ")
    val phrase= readlnOrNull().toString()
    fun duplicateTwoFirstChars(phraseToEdit:String):String{
        val twoFirst = phraseToEdit.substring(0,2)
        return twoFirst+twoFirst
    }
    println("Resultado: "+duplicateTwoFirstChars(phrase))
}