package arrayAndObjects

fun printStudentsWithNeedHelpAttributeTrue(){
        for (classRoom in classRooms) {
        println("En la clase '${classRoom.name }' necesitan ayuda: ")
        for (student in classRoom.students) {
            if (student.needHelp) {
                println(student)
            }
        }
    }
}