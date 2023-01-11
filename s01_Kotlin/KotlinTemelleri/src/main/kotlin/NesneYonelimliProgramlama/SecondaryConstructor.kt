package NesneYonelimliProgramlama

class Kare {
    var kenar: Int = 0

    constructor() {
        this.kenar = 0
    }

    constructor(kenar:Int)
    {
        this.kenar = kenar
    }
    fun kareAlanHesapla(): Int {
        return this.kenar * this.kenar
    }
}

fun main() {
    var k1: Kare = Kare()
    println(k1.kareAlanHesapla())

    var k2: Kare = Kare(10)
    println(k2.kareAlanHesapla())
}