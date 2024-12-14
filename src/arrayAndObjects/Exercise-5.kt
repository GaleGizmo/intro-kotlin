package arrayAndObjects

fun printArrayOfNotApprovedStudents(){
        val failedStudents = arrayListOf<String>()

    for (classRoom in classRooms) {

        for (student in classRoom.students) {
            if (!student.isApproved) {
                failedStudents.add(student.name)
            }
        }
    }
    println("Estudiantes suspendidos: " + failedStudents)
}