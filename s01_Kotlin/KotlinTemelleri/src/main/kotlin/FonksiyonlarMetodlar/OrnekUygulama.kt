package FonksiyonlarMetodlar

import java.util.Calendar

fun main() {
    while (true) {
        var kullaniciSecim = menuyuGoster()
        if (kullaniciSecim < 5 && kullaniciSecim > 0) {
            println(hesapla(kullaniciSecim))
            println()
        } else
            break
    }
}

fun hesapla(kullaniciSecim: Int): String {
    print("Sayı 1: ")
    var sayi1: Int? = readLine()?.toInt() ?: 0
    print("Sayı 2: ")
    var sayi2: Int? = readLine()?.toInt() ?: 1
    var sonuc: String = when (kullaniciSecim) {
        1 -> {
            "Toplam: ${(sayi1!! + sayi2!!)}"
        }

        2 -> {
            "Fark: ${(sayi1!! - sayi2!!)}"
        }

        3 -> {
            "Çarpım: ${(sayi1!! * sayi2!!)}"
        }

        4 -> {
            "Sonuç: ${(sayi1!! / sayi2!!.toDouble())}"
        }

        else -> {
            ""
        }
    }
    return sonuc
}

fun menuyuGoster(): Int {
    var tarih = tarihGoster()
    println("%7s $tarih".format("Menü"))
    println("1 - iki sayının toplamı")
    println("2 - iki sayının farkı")
    println("3 - iki sayının çarpımı")
    println("4 - iki sayının bölümü")
    println("5 - Çıkış ")
    print("Seçim: ")
    val secim: Int = readLine()?.toInt() ?: 5
    return secim
}

fun tarihGoster(): String {
    val calendar = Calendar.getInstance()
    var saat = calendar.get(Calendar.HOUR)
    var dakika = calendar.get(Calendar.MINUTE)
    var saniye = calendar.get(Calendar.SECOND)
    return "$saat:$dakika:$saniye"
}
