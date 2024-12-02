fun main() {
    //1. Tipos de datos
    // Enteros
    val integer: Int = 22
    val long: Long = 10000000000000000L

    //Flotantes
    val float: Float = 3.14f
    val double: Double = 3.14548382509

    //Booleanos
    var isFavorite: Boolean = true
     isFavorite = false

    //Caracteres (Char)
    val characterr: Char = 'k'

    //Cadenas (string)
    val regards: String = "Hola mundo"

    println("Entero: "+ integer)
    println("isFavorite: "+ isFavorite)
    println("saludo: "+ regards)

    // 2.Bucles
    //For (y derivados), While, DoWhile
    for(i in 1..5){
        println("Value for i: "+i)
    }
    var valueA= 3
    val valueB= 5

    while (valueA < valueB){
        valueA++
        valueA = valueA + 1
        valueA += 1
        println("Hola mundo")
    }
    do {
        valueA++
    } while (valueA<valueB)

    //3. When (Cases)
    val day = 3
    when(day){
        1 -> println("Lunes")
        2 -> println("MArtes")
        3 -> println("Miercoles")
        4 -> println("Jueves")
        5 -> println("Viernes")
        6 -> println("Sábado")
        7 -> println("Domingo")
        else -> { println("Ningún día válido")
        }
    }
    //Ejercicio 1
    fun sumTwoDigits(a:Int, b:Int):Int {
        val result = a + b
        return result
    }
    println(sumTwoDigits(5,7))
    //Ejercicio 2
    fun multiplyTwoDigits(a:Int, b:Int):Int {
        val result = a * b
        return result
    }
    println(multiplyTwoDigits(5,7))
    //Ejercicio 3
    fun divideTwoDigits(a:Int, b:Int): Int? {
        return if (b>0) a/b else null
            }
    println(divideTwoDigits(12,0))
}