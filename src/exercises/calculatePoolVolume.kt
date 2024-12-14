package exercises

fun exercise7(){
    print("Ancho: ")
    val poolWidth = readlnOrNull()?.toIntOrNull()
    print("Alto: ")
    val poolHeight = readlnOrNull()?.toIntOrNull()
    print("Largo: ")
    val poolLength = readlnOrNull()?.toIntOrNull()
    if (poolWidth==null || poolHeight==null || poolLength==null){
        println("Datos incorrectos")
        return
    }
    fun calculateVolume (long:Int, width: Int, height:Int): Int{
        return long*width*height
    }
    println("El volumen es: "+calculateVolume(poolWidth,poolHeight,poolLength)+" metros cúbicos")

}