package arrayAndObjects

class Student(
    val id: Int,
    val name: String,
    val age: Int,
    var isApproved: Boolean,
    var isProgressing: Boolean,

    ) : StudentInterface {
    override fun toString(): String {
        return "Estudiante $id, nombre: $name, edad: $age"
    }
    val needHelp: Boolean
        get() = !isApproved && !isProgressing

    override fun write() {
        println("$name está escribiendo.")
    }

    override fun passExam() {
        println("$name pasó el examen.")
    }

    override fun failExam() {
        println("$name falló el examen.")
    }

    override fun read() {
        println("$name está leyendo.")
    }

    override fun cry() {
        println("$name está llorando.")
    }

}