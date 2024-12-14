package exercises

fun returnTheBiggest(){
    print("Primer número: ")
    val a = readlnOrNull()?.toIntOrNull()
    print("Segundo número: ")
    val b = readlnOrNull()?.toIntOrNull()
    fun multiplyTwoDigits(a:Int, b:Int) {
        val result = a * b
        println("Resultado: "+result)
    }

}