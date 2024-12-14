package exercises

fun compareTwoStringsCaseInsensitive() {
    print("Ingresa frase 1: ")
    val phras1 = readlnOrNull().toString()
    print("Ingresa frase 2: ")
    val phras2 = readlnOrNull().toString()

    fun compareStrings(str1: String, str2: String): Boolean {
        val str1ToLower = str1.lowercase()
        val str2ToLower = str2.lowercase()
        return str1ToLower == str2ToLower
    }
    println("resultado: " + compareStrings(phras1, phras2))
}