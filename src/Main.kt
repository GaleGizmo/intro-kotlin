import exercises.*

fun main() {
    var keepPlaying = true
    while (keepPlaying) {
        println("1. Suma dos números")
        println("2. Multiplica dos números")
        println("3. Divide dos números")
        println("4. Divide dos números sin decimales")
        println("5. Calcula porcentaje de victorias")
        println("6. Devuelve el mayor de los dos")
        println("7. Calcula volumen de una piscina")
        println("8. Devuelve n primeros primos")
        println("9. Une dos strings")
        println("10. Sustitiye carácter en una frase")
        println("11. Borra carácter si inicial o final")
        println("12. Duplica dos primeros caracteres de string")
        println("13. Comprueba si dos primeros caracteres = dos últimos en string")
        println("14. Compara dos strings sin importar mayúsculas")
        println("15. Cambia elemento en array")
        println("16. Busca número en array")
        println("17. Cuenta número en array")
        println("18. Ordena array de números")
        println("19. Añade string a array de strings")
        println("20. Busca primer número hasta 1000000 que no está en array")
        print("Elige un ejercicio: ")
        val exValue = readlnOrNull()?.toIntOrNull()
        when (exValue) {
            1 -> exercise1()
            2 -> exercise2()
            3 -> exercise3()
            4 -> exercise4()
            5 -> exercise5()
            6 -> exercise6()
            7 -> exercise7()
            8 -> exercise8()
            9 -> exercise9()
            10 -> exercise10()
            11 -> exercise11()
            12 -> exercise12()
            13 -> exercise13()
            14 -> exercise14()
            15 -> exercise15()
            16 -> exercise16()
            17 -> exercise17()
            18 -> exercise18()
            19 -> exercise19()
            20 -> exercise20()
        }
        var validAnswer = false
        while (!validAnswer) {
            print("Quieres ver otro ejercicio?(Y/N): ")
            val anotherExercise = readlnOrNull().toString().lowercase()
            if (anotherExercise == "y") {
                validAnswer = true
                continue
            } else if (anotherExercise == "n") {
                validAnswer = true
                keepPlaying = false
            } else
                println("Respuesta no válida")
        }
    }

//    //1. Tipos de datos
//    // Enteros
//    val integer: Int = 22
//    val long: Long = 10000000000000000L
//
//    //Flotantes
//    val float: Float = 3.14f
//    val double: Double = 3.14548382509
//
//    //Booleanos
//    var isFavorite: Boolean = true
//     isFavorite = false
//
//    //Caracteres (Char)
//    val characterr: Char = 'k'
//
//    //Cadenas (string)
//    val regards: String = "Hola mundo"
//
//    println("Entero: "+ integer)
//    println("isFavorite: "+ isFavorite)
//    println("saludo: "+ regards)
//
//    // 2.Bucles
//    //For (y derivados), While, DoWhile
//    for(i in 1..5){
//        println("Value for i: "+i)
//    }
//    var valueA= 3
//    val valueB= 5
//
//    while (valueA < valueB){
//        valueA++
//        valueA = valueA + 1
//        valueA += 1
//        println("Hola mundo")
//    }
//    do {
//        valueA++
//    } while (valueA<valueB)
//
//    //3. When (Cases)
//    val day = 3
//    when(day){
//        1 -> println("Lunes")
//        2 -> println("MArtes")
//        3 -> println("Miercoles")
//        4 -> println("Jueves")
//        5 -> println("Viernes")
//        6 -> println("Sábado")
//        7 -> println("Domingo")
//        else -> { println("Ningún día válido")
//        }
//    }
//
//    //Condicionales
//    var valueX=2
//    var valueY=8
//    if(valueX > valueY) {
//        if(valueX==3){
//            //ejecuta código
//        } else{
//            //ejecuta otro código
//        }
//    } else {
//        //Tercera posibilidad
//    }
//
//


}

