package arrayAndObjects

fun printStudentsWithAInName() {
    for (classRoom in classRooms) {
        println("Clase: ${classRoom.name}")
        for (student in classRoom.students) {
            if (student.name.contains("a", ignoreCase = true)) {
                println(student)
            }
        }

    }
}

