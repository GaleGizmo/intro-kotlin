package exercises

fun exercise5(){
    print("Partidos jugados: ")
    val a = readlnOrNull()?.toIntOrNull()
    print("Partidos ganados: ")
    val b = readlnOrNull()?.toIntOrNull()
    fun calculateWinPercentage (played:Int, won:Int) {
        print("Resultado: ")
        val result=(won*100)/played
        println("${ result }% de victorias")
    }
        if (a != null && b != null) {
            calculateWinPercentage(a, b)
        } else {
            println("Por favor, ingresa números válidos.")
        }
}