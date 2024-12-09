package exercises

fun exercise8(){
    println("Cuantos números primos quieres mostrar: ")
    val numberOfPrimes= readlnOrNull()?.toInt()
    if (numberOfPrimes==null){
        println("Dato no válido")
        return
    }
    fun returnXPrimeNumbers(x:Int): Any{
        print("1 ")
        var counter=1
        var primeNumber:Int=2
        while (counter<=x){
            var isPrime=true
            var toDivide:Int=primeNumber/2
            while(isPrime && toDivide>1){
                val check:Double = primeNumber.toDouble()/toDivide.toDouble()
                if (check % 1==0.0) isPrime=false
                else toDivide-=1
            }
            if (isPrime) {
                print("$primeNumber ")
                counter+=1
            }
            primeNumber+=1

        }
        return true
    }
    returnXPrimeNumbers(numberOfPrimes)
}