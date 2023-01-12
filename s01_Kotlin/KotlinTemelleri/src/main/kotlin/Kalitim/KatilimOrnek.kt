package Kalitim

open class Person(isim: String, yas: Int, isMan: Boolean) {
    var isim: String = ""
    var yas: Int = 0
    var isMan: Boolean = true

    init {
        println("Person class init")
        this.isim = isim
        this.yas = yas
        this.isMan = isMan
    }

    override fun toString(): String {
        var cinsiyet = if (isMan == true) "Erkek" else "Kadın"
        return "İsim: ${this.isim} Yas: ${this.yas} Cinsiyet: ${cinsiyet}"
    }
}

class Ogretmen(isim: String, yas: Int, isMan: Boolean, brans: String) : Person(isim, yas, isMan) {
    var brans: String = ""
    init {
        this.yas = if (yas < 18) 18 else this.yas
        println("Öğretmen class init")
        this.brans = brans
    }

    override fun toString(): String {
        var cinsiyet = if (isMan == true) "Erkek" else "Kadın"
        return "İsim: ${this.isim} Yas: ${this.yas} Cinsiyet: ${cinsiyet} Branş: ${this.brans}"
    }
}

fun main() {
    var p1: Person = Person("Ömer", 29, true)
    println(p1.toString())

    var ogr1: Ogretmen = Ogretmen("Hasan", 45, true, "Matematik")
    println(ogr1.toString())
}