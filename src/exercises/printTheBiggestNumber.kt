package exercises

fun printTheBiggestNumber() {
    print("Primer número: ")
    val a = readlnOrNull()?.toIntOrNull()
    print("Segundo número: ")
    val b = readlnOrNull()?.toIntOrNull()
    fun returnBiggest (a:Int, b:Int) {
      if (a==b) print ("son iguales") else {
          print("El mayor es: ")
          if (a > b) println (a) else println (b)
      }
    }
    if (a != null && b != null) {
        returnBiggest(a, b)
    } else {
        println("Por favor, ingresa números válidos.")
    }
}