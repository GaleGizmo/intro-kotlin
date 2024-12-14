package arrayAndObjects

fun printStudentsNotApprrovedAndNotProgressing(){
        for (classRoom in classRooms) {
            println("Clase: ${classRoom.name}")
        for (student in classRoom.students) {
            if (!student.isApproved && !student.isProgressing) {
                println(student)
            }
        }
    }

}