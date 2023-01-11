package NesneYonelimliProgramlama

class User(var id: Int, var isim: String) {

    var adres:String = ""
    init {
        if (id < 0) id = 1
        println("id: $id isim: $isim")
    }

    constructor(id: Int, isim: String, adres: String) : this(id,isim) {
        this.adres = adres
    }
}

fun main() {
    var user : User = User(100,"Ömer")
    var user2 : User = User(45,"Ali")
    var user3 : User = User(-5, "Hamit","Ankara")
}