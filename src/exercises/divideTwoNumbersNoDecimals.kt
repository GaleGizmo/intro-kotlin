package exercises

fun divideTwoNumbersNoDecimals() {
    print("Primer número: ")
    val a = readlnOrNull()?.toIntOrNull()
    print("Segundo número: ")
    val b = readlnOrNull()?.toIntOrNull()
    fun divideTwoDigits(a: Int, b: Int) {
        print("Resultado: ")
        if (b <= 0) print("No se admite el cero")
        val result:Int = a / b

        println(result)
    }
    if (a != null && b != null) {
        divideTwoDigits(a, b)
    } else {
        println("Por favor, ingresa números válidos.")
    }
}