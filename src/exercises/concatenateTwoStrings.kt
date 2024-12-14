package exercises

fun concatenateTwoStrings(){
    print("Ingresa string 1: ")
    val string1 = readlnOrNull()
    print ("Ingresa string 2: ")
    val string2 = readlnOrNull()

    fun concatStrings(str1:String?, str2:String?):String{
        return str1+str2
    }
    println("Resultado: "+concatStrings(string1, string2))
}