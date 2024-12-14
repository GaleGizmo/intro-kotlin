class Contact(
    private val id:Int = lastId,
    var name: String,
    var lastName: String,
    var phoneNumber: String,
    var email: String,
    var nickName: String,
    var isFavorite: Boolean

) {
    val id: Int = incrementAndGetLastId()
    companion object {
        private var lastId: Int =0

        fun incrementAndGetLastId(): Int {
            return lastId++
        }
    }
}