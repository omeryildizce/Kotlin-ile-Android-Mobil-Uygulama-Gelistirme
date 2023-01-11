package NesneYonelimliProgramlama

class Ogrenci(var isim: String, var yas:Int) {


    init {
        bilgileriGoster()
    }
    fun bilgileriGoster(){
        println("${this.isim} ${this.yas}")
    }
}

fun main() {
    var ogr1 : Ogrenci = Ogrenci("Ömer", 26)
    ogr1.bilgileriGoster()


}