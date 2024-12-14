package exercises

fun exercise13(){
    print("Ingresa frase: ")
    val phrase = readlnOrNull().toString()

    fun checkTwoFirstEqualTwoLast(phraseToCheck:String):Boolean{
        val twoFirst=phraseToCheck.substring(0,2)
        val twoLast=phraseToCheck.takeLast(2)
        return twoFirst==twoLast || twoFirst==twoLast.reversed()
    }
    println(checkTwoFirstEqualTwoLast(phrase))
}