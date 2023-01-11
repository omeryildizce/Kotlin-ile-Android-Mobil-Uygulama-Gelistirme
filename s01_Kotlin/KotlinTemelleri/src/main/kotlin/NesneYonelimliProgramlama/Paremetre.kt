package NesneYonelimliProgramlama

class Dikdortgen(var en: Int = 0, var boy: Int = 0) {

    fun alanHesapla(): Int {
        return this.en * this.boy
    }

}

fun main() {
    var d1: Dikdortgen = Dikdortgen(9, 7)
    println(d1.alanHesapla())
    var d2: Dikdortgen = Dikdortgen(5, 11)
    println(d2.alanHesapla())
    var d3:Dikdortgen = Dikdortgen(boy = 17, en = 25)
    println(d3.alanHesapla())
    var  d4:Dikdortgen = Dikdortgen(4)
    println(d4.alanHesapla())
}