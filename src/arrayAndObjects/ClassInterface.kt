package arrayAndObjects

interface ClassInterface {
    fun addStudent(student: Student)
    fun removeStudent(studentId: Int): Boolean
    fun listStudents(): List<Student>
    fun averageAge(): Double
    fun startActivity(activityName: String)
}