package exercises

fun divideTwoNumbers() {
    print("Primer número: ")
    val a = readlnOrNull()?.toDoubleOrNull()
    print("Segundo número: ")
    val b = readlnOrNull()?.toDoubleOrNull()
    fun divideTwoDigits(a:Double, b:Double) {
        print("Resultado: ")
        if (b <= 0.0) {
            print("No se admite el cero")
            return
        }
        val result = a / b

         if (result % 1 == 0.0) println(result.toInt())  else println(result)
     }
    if (a != null && b != null) {
        divideTwoDigits(a, b)
    } else {
        println("Por favor, ingresa números válidos.")
    }
}
