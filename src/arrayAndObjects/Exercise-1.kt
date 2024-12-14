package arrayAndObjects

val studentsA: ArrayList<Student> = arrayListOf(
    Student(1, "Alicia", 20, isApproved = true, isProgressing = false),
    Student(2, "Pedro", 21, isApproved = false, isProgressing = false),
    Student(3, "Carlos", 22, isApproved = false, isProgressing = false),
    Student(4, "David", 23, isApproved = false, isProgressing = false),
    Student(5, "Eva", 20, isApproved = true, isProgressing = false),
    Student(6, "Luís", 24, isApproved = true, isProgressing = false),
    Student(7, "José", 22, isApproved = false, isProgressing = true),
    Student(8, "Elena", 21, isApproved = false, isProgressing = true),
    Student(9, "Ivan", 25, isApproved = false, isProgressing = true),
    Student(10, "Julia", 23, isApproved = true, isProgressing = false)
)
val studentsB: ArrayList<Student> = arrayListOf(
    Student(1, "Andrés", 20, isApproved = true, isProgressing = true),
    Student(2, "Sonia", 21, isApproved = false, isProgressing = true),
    Student(3, "María", 22, isApproved = true, isProgressing = false),
    Student(4, "Daniel", 23, isApproved = false, isProgressing = false),
    Student(5, "Emilio", 20, isApproved = false, isProgressing = true),
    Student(6, "Juan", 24, isApproved = false, isProgressing = true),
    Student(7, "Miguel", 22, isApproved = true, isProgressing = true),
    Student(8, "Óscar", 21, isApproved = false, isProgressing = false),
    Student(9, "Diego", 25, isApproved = false, isProgressing = true),
    Student(10, "Julio", 23, isApproved = true, isProgressing = false)
)
val classRoomA = ClassRoom(1, "Introducción al uso de la Fuerza", studentsA)
val classRoomB = ClassRoom(2, "Manejo de sable láser", studentsB)
val classRooms: ArrayList<ClassRoom> = arrayListOf(classRoomA, classRoomB)

fun printClassrooms (){
    for (classroom in classRooms) {
        println(classroom.name)
        for (student in classroom.students){
            println(student.toString())
        }
    }
}