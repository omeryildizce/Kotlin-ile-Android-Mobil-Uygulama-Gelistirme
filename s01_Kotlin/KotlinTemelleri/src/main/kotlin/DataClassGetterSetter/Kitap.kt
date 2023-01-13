package DataClassGetterSetter

class Kitap(private var id: Int, var ad: String) {

    fun getId(): Int {
        return id
    }

    fun setId(id: Int) {
        if (id < 0) this.id = 1 else this.id = id
    }
}