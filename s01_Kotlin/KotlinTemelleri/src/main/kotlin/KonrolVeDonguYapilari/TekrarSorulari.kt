package KonrolVeDonguYapilari

fun main() {

    // ucSayiOrtalamasi()
    // ucgenCesidi()
    // gecmeDurumu()
    // besDefaYazdir()
    // kareleriToplami()
    // aralikliYazdir(1,100, 7)
    // faktoriyelHesapla()
    // fonksiyon()
    // harfNotuHesapla(83)

    carpimTablosu()
}

/**
 * Çarpım tablosunu ekrana yazdırır
 */
fun carpimTablosu() {
    for (i in 1..10){
        for (j in 1..10)
        {
            print("%3d * %-3d = %-3d".format(j,i, i*j))
        }
        println()
    }

}

/**
 * girilen notun harf değerini hesaplar
 */
fun harfNotuHesapla(notDegeri: Int) {
    if (notDegeri >= 0 && notDegeri <= 100) {
        val hesap: Int = notDegeri / 5
        when (hesap) {
            20,19,18 -> {
                println("A")
            }
            17 -> {
                println("B1")
            }
            16 -> {
                println("B2")
            }
            15 -> {
                println("B3")
            }
            14 -> {
                println("C1")
            }
            13 -> {
                println("C2")
            }
            12 -> {
                println("C3")
            }
            11,10 ->{
                println("F1")
            }
            else ->{
                println("F2")
            }
        }
    }
}

/**
 * @param x
 * @param y
 *
 * x > 0, y < 0 ise f(x,y) = 4x + 2y + 4
 *
 * x > 0, y = 0 ise f(x,y) = 2x -  y + 3
 *
 * x < 0, y > 0 ise f(x,y) = 3x + 4y + 3
 */
fun fonksiyon() {
    print("X: ")
    var x: Int = readLine()!!.toInt()
    print("Y: ")
    var y: Int = readLine()!!.toInt()
    var sonuc: Int = 0
    if (x > 0 && y < 0) {
        sonuc = 4 * x + 2 * y + 3
    } else if (x > 0 && y == 0) {
        sonuc = 2 * x - y + 3
    } else if (x < 0 && y > 0) {
        sonuc = 3 * x + 4 * y + 3
    }
    println(sonuc)
}

/**
 * Klavyeden girilen sayıın faktoriyelini hesaplar
 */
fun faktoriyelHesapla() {
    println("Faktoriyeli hesaplanacak sayı")
    var sayi: Int = readLine()!!.toInt()
    var sonuc: ULong = 1u
    for (i in 1..sayi) {
        sonuc *= i.toULong()
    }
    println(sonuc)

}

/**
 * Baslangıç ve bitiş değeri arasındaki sayıları aralıklı yazdırır
 * -> başlangıç değeri
 * -> bitis değeri
 * -> aralık miktarı
 */
fun aralikliYazdir(baslangic: Int, bitis: Int, aralik: Int) {
    println("Normal sıralı")
    for (i in baslangic.rangeTo(bitis).step(aralik)) {
        print("%4d".format(i))

    }
    println("\nTers sıralı")
    for (i in bitis.downTo(baslangic).step(aralik)) {
        print("%4d".format(i))

    }

}


/**
 * 1-100 kadar olan sayiların kareleri toplamını yazdırır
 */
fun kareleriToplami() {
    var toplam: Int = 0
    for (i in 1..100) {
        toplam += i * i
    }
    println("Toplam: $toplam")

}

/**
 * Girilen ifadeyi 5 defa ekrana yazdırır
 */
fun besDefaYazdir() {
    println("İfade giriniz: ")
    val ifade: String? = readLine()
    var i = 0
    do {
        println(ifade)
        i++
    } while (i < 5)
}

/**
 * Vize ve final notuna göre öğrencinin geçme durumunu hesaplar
 * Vize %40, Final %60
 * Geçme puanı 50
 */
fun gecmeDurumu() {
    print("Vize: ")
    val vize: Int = readLine()!!.toInt()
    print("Final: ")
    val final: Int = readLine()!!.toInt()
    val ortalama: Double
    ortalama = vize * 0.4 + final * 0.6
    if (ortalama > 50) {
        println("Ortalama: $ortalama -> Geçti")
    } else {
        println("Ortalama: $ortalama -> Kaldı")
    }


}

/**
 * Girilen kenar uzunluklarına göre üçgen çeşidini söyler
 */
fun ucgenCesidi() {
    print("Kenar 1: ")
    var kenar1: Int? = readLine()?.toInt()
    print("Kenar 2: ")
    var kenar2: Int? = readLine()?.toInt()
    print("Kenar 3: ")
    var kenar3: Int? = readLine()?.toInt()

    if (kenar1 == kenar2 && kenar1 == kenar3)
        println("Eşkenar üçgen")
    else if (kenar1 == kenar2 || kenar1 == kenar3 || kenar2 == kenar3) {
        println("İkizkenar Üçgen")
    } else
        println("Çeşit Kenar Üçgen")
}

/**
 * Klavyeden girilen 3 sayının ortalamasını bulma
 */
private fun ucSayiOrtalamasi() {
    print("Sayı 1: ")
    var sayi1: Int? = readLine()?.toInt()
    print("Sayı 2: ")
    var sayi2: Int? = readLine()?.toInt()
    print("Sayı 3: ")
    var sayi3: Int? = readLine()?.toInt()
    var ortalama: Double = ((sayi1!! + sayi2!! + sayi3!!).toDouble() / 3)
    println("Ortalama: %.2f".format(ortalama))
}