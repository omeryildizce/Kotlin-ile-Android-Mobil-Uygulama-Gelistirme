package Kalitim

open class Person1 {
    var isim: String
    var yas: Int
    var isMan: Boolean = false

    constructor(isim: String, yas: Int) {
        this.isim = isim
        this.yas = yas

    }

    constructor(isim: String, yas: Int, isMan: Boolean) : this(isim, yas) {
        this.isMan = isMan
    }

    override fun toString(): String {
        var cinsiyet: String = if (!isMan) "Kadın" else "Erkek"
        return "İsim: $isim Yaş: $yas Cinsiyet: $cinsiyet"
    }
}

class Ogretmen1 : Person1{
    var brans: String = ""

    constructor(isim: String, yas: Int, isMan:  Boolean, brans: String) : super(isim, yas, isMan){
        this.brans = brans
    }

    override fun toString(): String {
        return "${super.toString()} Branş: $brans"
    }
}

fun main() {
    var p1: Person1 = Person1("Ömer", 45)
    println(p1.toString())

    var p2: Person1 = Person1("Ömer", 45, true)
    println(p1.toString())
    var ogr1: Ogretmen1 = Ogretmen1("Ali",45,true,"Türkçe")
    println(ogr1.toString())
}