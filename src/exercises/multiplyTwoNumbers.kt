package exercises

fun multiplyTwoNumbers(){
    print("Primer número: ")
    val a = readlnOrNull()?.toIntOrNull()
    print("Segundo número: ")
    val b = readlnOrNull()?.toIntOrNull()
    fun multiplyTwoDigits(a:Int, b:Int) {
        val result = a * b
        println("Resultado: "+result)
    }
    if (a != null && b != null) {
        multiplyTwoDigits(a, b)
    } else {
        println("Por favor, ingresa números válidos.")
    }
}