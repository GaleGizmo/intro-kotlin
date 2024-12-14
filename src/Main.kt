import arrayAndObjects.*
import exercises.*

fun main() {
    var keepPlaying = true
    while (keepPlaying) {
        val exValue = getValidExercise()
        executeExercise(exValue)
        keepPlaying = checkAnotherExercise(keepPlaying)
    }
}


private fun getValidExercise(): Int {
    while (true) {
        printExercisesMenu()
        print("Elige un ejercicio: ")
        val exerciseNumber = readlnOrNull()?.toIntOrNull()
        if (exerciseNumber != null && exerciseNumber in 1..25) {
            return exerciseNumber
        }
        println("Por favor, introduce un número válido entre 1 y 25.")
    }
}


private fun executeExercise(exValue: Int) {
    val exercises = mapOf(
        1 to ::addTwoNumbers,
        2 to ::multiplyTwoNumbers,
        3 to ::divideTwoNumbers,
        4 to ::divideTwoNumbersNoDecimals,
        5 to ::calculateRateOfVictories,
        6 to ::printTheBiggestNumber,
        7 to ::calculatePoolVolume,
        8 to ::printXPrimNumbers,
        9 to ::concatenateTwoStrings,
        10 to ::replaceOneCharInString,
        11 to ::removeCharIfFirstOrLast,
        12 to ::printTwoFirstCharsOfStringDuplicated,
        13 to ::checkIfTwoFirstCharsSameAsTwoLast,
        14 to ::compareTwoStringsCaseInsensitive,
        15 to ::replaceNumberInArrayOfInts,
        16 to ::checkIfNumberIsInArray,
        17 to ::countRepetitionsOfNumberInArray,
        18 to ::sortArrayOfNumbers,
        19 to ::addStringToArrayOfStrings,
        20 to ::checkFirstNumberUntilOneMillionNotInArray,
        21 to ::printClassrooms,
        22 to ::printStudentsWithAInName,
        23 to ::printStudentsNotApprrovedAndNotProgressing,
        24 to ::printStudentsWithNeedHelpAttributeTrue,
        25 to ::printArrayOfNotApprovedStudents
    )
    exercises[exValue]?.invoke()
}


private fun printExercisesMenu() {
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
    println("21. Crea clases Classroom y Students. Mete dos clases con 10 alumnos en un array")
    println("22. Imprime estudiantes con una 'a' en el nombre")
    println("23. Imprime estudiantes con isApproved e isProgressing en false")
    println("24. Imprime estudiantes con atributo needHelp true")
    println("25. Crea e imprime array de alumnos suspendidos")
}



private fun checkAnotherExercise(keepPlaying: Boolean): Boolean {
    var keepPlaying1 = keepPlaying
    var validAnswer = false
    while (!validAnswer) {
        print("Quieres ver otro ejercicio?(Y/N): ")
        val anotherExercise = readlnOrNull().toString().lowercase()
        if (anotherExercise == "y") {
            validAnswer = true
            continue
        } else if (anotherExercise == "n") {
            validAnswer = true
            keepPlaying1 = false
        } else
            println("Respuesta no válida")
    }
    return keepPlaying1
}

