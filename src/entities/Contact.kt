package entities

class Contact(

    var name: String,
    var lastName: String,
    var phoneNumber: String,
    var email: String,
    var nickName: String,
    var isFavorite: Boolean

) {
    val id: Int = incrementAndGetLastId()


    companion object {
        private var lastId: Int =1


        fun incrementAndGetLastId(): Int {
            lastId+=1
            return lastId
        }

        fun isValidName():Boolean{
            return false
        }

        fun isValidPhoneNumber():Boolean{
            return false
        }

        fun isValidEmail(): Boolean {
            return false
        }
        fun isFavoriteValueValid(isFavorite: String?): Boolean? {
            val value = isFavorite?.trim()?.lowercase() ?: ""
            return when (value) {
                "true", "ok", "1", "y", "si", "sí", "valido", "si es", "dale" -> true
                "false", "ko", "0", "n", "no","nó", "invalido", "no es", "que no" -> false
                else -> null
            }
        }

        }

    override fun toString(): String {
        return if(nickName.isEmpty()){
            "id:$id, name:'$name', lastName:'$lastName', phoneNumber:'$phoneNumber', email:'$email', isFavorite:$isFavorite )"
        } else {
            "id:$id, nickname:$nickName, phoneNumber:'$phoneNumber', email:'$email', isFavorite:$isFavorite, )"
        }

    }
}
