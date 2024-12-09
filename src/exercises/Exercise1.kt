package exercises
fun exercise1() {
    print("Primer número: ")
    val a = readlnOrNull()?.toIntOrNull()
    print("Segundo número: ")
    val b = readlnOrNull()?.toIntOrNull()

    if (a != null && b != null) {
        fun sumTwoDigits(a: Int, b: Int) {
            val result = a + b
            println("El resultado es: $result")
        }
        sumTwoDigits(a, b)
    } else {
        println("Por favor, ingresa números válidos.")
    }
}