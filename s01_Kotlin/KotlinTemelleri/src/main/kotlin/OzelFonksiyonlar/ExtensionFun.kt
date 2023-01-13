package OzelFonksiyonlar

fun main() {
    println("Normal faktoriyel 5! = ${faktoriyelBul(5)}")
    println("Extension faktoriyel 5! = ${5.faktoriyelBulExtension()}")
    var yazi = "Emre              \n        Ay \t Kotlin"
    println(yazi.boslukDuzenle())


    println("-------------------")
    var emre = Ogr()
    emre.yetenek = "Kotlin"
    emre.yetenekYazdir()

    var hasan = Ogr()
    hasan.yetenek = "Android"
    hasan.yetenekYazdir()


    var ali: Ogr = emre.yetenekBirlestir(hasan)
    ali.yetenekYazdir()

    var can: Ogr = ali yetenekBirlestir hasan
    can.yetenekYazdir()


}

infix fun Ogr.yetenekBirlestir(ogr: Ogr): Ogr {
    var ogrenci = Ogr()
    ogrenci.yetenek = this.yetenek + " " + ogr.yetenek
    return ogrenci
}

fun faktoriyelBul(sayi: Int): Int {
    var sonuc = 1
    for (i in 1..sayi) {
        sonuc *= i
    }
    return sonuc
}

fun Int.faktoriyelBulExtension(): Int {
    var sonuc = 1
    for (i in 1..this) {
        sonuc *= i
    }
    return sonuc
}

fun String.boslukDuzenle(): String {
    var regex = Regex("\\s+")
    return regex.replace(this, " ")
}

