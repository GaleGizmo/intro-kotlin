package exercises

fun exercise6() {
    print("Primer número: ")
    val a = readlnOrNull()?.toIntOrNull()
    print("Segundo número: ")
    val b = readlnOrNull()?.toIntOrNull()
    fun returnBiggest (a:Int, b:Int) {
      if (a==b) print ("son iguales") else {
          print("El mayor es: ")
          if (a > b) print (a) else print (b)
      }
    }
    if (a != null && b != null) {
        returnBiggest(a, b)
    } else {
        println("Por favor, ingresa números válidos.")
    }
}