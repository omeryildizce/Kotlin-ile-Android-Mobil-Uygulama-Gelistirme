package NesneYonelimliProgramlama

import java.util.*


class Person {

    var isim: String = "Ömer"
    var yas : Int    =   25
    fun selamVer() {
        println("Merhaba ${this.isim}")
    }
    fun dogduguYil() = Calendar.getInstance().get(Calendar.YEAR) - this.yas

}

fun main() {
    var kisi: Person = Person()
    println(kisi.isim)
    println(kisi.yas)
    kisi.selamVer()
    println(kisi.dogduguYil())
}