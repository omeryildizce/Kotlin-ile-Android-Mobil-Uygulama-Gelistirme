package Kalitim
open class GeometrikSekil{
    var en: Int = 0
    var boy: Int = 0

    open fun alanHesapla(){
         println("Alan: ${this.en * this.boy}")
    }

    override fun toString(): String {
        return "En: ${this.en} Boy: ${this.boy}"
    }
}

class Kare : GeometrikSekil() {
    override fun alanHesapla() {
        println("Karenin Alanı: ${this.en * this.boy}")
    }
}

class Dikdortgen:GeometrikSekil(){
    override fun alanHesapla() {
        println("Dikdörtgenin Alanı: ${this.en * this.boy}")
    }
}


fun main() {
    var gs1 : GeometrikSekil = GeometrikSekil()
    gs1.boy = 6
    gs1.en = 7
    gs1.alanHesapla()

    var k1 : Kare = Kare()
    k1.en = 10
    k1.boy = 10
    k1.alanHesapla()

    var d1:Dikdortgen = Dikdortgen()
    d1.en = 7
    d1.boy = 5
    d1.alanHesapla()

}