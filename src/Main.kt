import java.util.*

fun main() {
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
//    //Ejercicio 1
//    fun sumTwoDigits(a:Int, b:Int):Int {
//        val result = a + b
//        return result
//    }
//    println(sumTwoDigits(5,7))
//
//    //Ejercicio 2
//    fun multiplyTwoDigits(a:Int, b:Int):Int {
//        val result = a * b
//        return result
//    }
//
//    println(multiplyTwoDigits(5,7))
//
//    //Ejercicio 3
//    fun divideTwoDigits(a:Int, b:Int): Any? {
//        if (b <= 0) return null
//        val result = a.toDouble() / b
//        return if (result % 1 == 0.0) result.toInt() else result
//            }
//    println(divideTwoDigits(12,6))
//
//    //Ejercicio 4
//    fun divideTwoIntDigits(a:Int, b:Int): Int? {
//        return if (b>0) a/b else null
//    }
//    println(divideTwoIntDigits(12,7))
//
//    //Ejercicio 5
//    fun calculateWinPercentage (played:Int, won:Int): Any{
//        return (won*100)/played
//    }
//    println("porcentaje de victorias: "+calculateWinPercentage(84,41)+"%")
//
//    //Ejercicio 6
//    fun returnBiggest (a:Int, b:Int): Any {
//         if (a>b) return ("el mayor es: " +a)
//        if (b>a) return ("el mayor es: "+b)
//        return "son iguales"
//    }
//    println("Resultado: "+returnBiggest(24, 33))
//
//    //Ejercicio 7
//    fun calculateVolume (long:Int, width: Int, height:Int): Int{
//        return long*width*height
//    }
//    println("El volumen es: "+calculateVolume(5,12,33))
//
//    fun returnXPrimeNumbers(x:Int): Any{
//        println(1)
//        var counter=1
//        var primeNumber:Int=2
//        while (counter<=x){
//            var isPrime=true
//            var toDivide:Int=primeNumber/2
//            while(isPrime && toDivide>1){
//                val check:Double = primeNumber.toDouble()/toDivide.toDouble()
//                if (check % 1==0.0) isPrime=false
//                else toDivide-=1
//            }
//            if (isPrime) {
//                println(primeNumber)
//                counter+=1
//            }
//            primeNumber+=1
//
//        }
//        return true
//    }
//    returnXPrimeNumbers(10)

    //Ejercicio concat strings
//    print("Ingresa string 1: ")
//    val string1 = readLine()
//    print ("Ingresa string 2: ")
//    val string2 = readLine()
//
//    fun concatStrings(str1:String?, str2:String?):String{
//        return str1+str2
//    }
//    println("Resultado: "+concatStrings(string1, string2))

    //Ejercicio sustituir caracter
//    print("Ingresa frase: ")
//    val phrase= readLine().toString()
//    print ("Carácter a sustituir: ")
//    val chr1= readLine().toString()
//    print ("Nuevo carácter: ")
//    val chr2= readLine().toString()
//
//    fun replaceCharacter(phraseToEdit:String, oldchr:String, newchr:String):String {
//        return if (oldchr in phraseToEdit) phraseToEdit.replace(oldchr, newchr) else "Ese carácter no está en la frase"
//    }
//    println("Resultado: "+replaceCharacter(phrase, chr1, chr2))

    //Ejercicio sustituir si primero o último
//        print("Ingresa frase: ")
//    val phrase= readlnOrNull().toString()
//    print ("Carácter a sustituir: ")
//    val char= readlnOrNull().toString()
//
//    fun replaceIfFirstOrLastChar(phraseToEdit:String, chr:String):String{
//        val charToRemove=chr[0]
//        return when {
//            phraseToEdit.startsWith(charToRemove) -> phraseToEdit.substring(1)
//            phraseToEdit.endsWith(charToRemove) -> phraseToEdit.dropLast(1)
//            else -> "No es primer o último carácter"
//        }
//    }
//    println("Resultado: "+replaceIfFirstOrLastChar(phrase, char))
    //Ejercicio duplica dos primeros caracteres
//    print("Ingresa frase: ")
//    val phrase= readlnOrNull().toString()
//    fun duplicateTwoFirstChars(phraseToEdit:String):String{
//        val twoFirst = phraseToEdit.substring(0,2)
//        return twoFirst+twoFirst
//    }
//    println("Resultado: "+duplicateTwoFirstChars(phrase))

//    Ejercicio comprueba dos primeros igual a dos últimos caracteres
//    print("Ingresa frase: ")
//    val phrase= readlnOrNull().toString()
//    fun checkTwoFirstSameTwoLast(phraseToCheck:String):Boolean{
//        val twoFirst = phraseToCheck.substring(0,2)
//        val twoLast = phraseToCheck.takeLast(2)
//        return twoFirst==twoLast
//    }
//    println("Resultado: "+checkTwoFirstSameTwoLast(phrase))

    //Ejercicio compara dos strings
    print("Ingresa frase 1: ")
    val phras1= readlnOrNull().toString()
    print ("Ingresa frase 2: ")
    val phras2= readlnOrNull().toString()

    fun compareStrings(str1:String, str2:String):Boolean{
        val str1ToLower = str1.lowercase(Locale.getDefault())
        val str2ToLower = str2.lowercase(Locale.getDefault())
        return str1ToLower==str2ToLower
    }
    println("resultado: "+compareStrings(phras1, phras2))

}

