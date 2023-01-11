package MathStringArray

import java.util.Calendar

fun main() {
//    faktoriyelHesaplalama()
//    kulaniciBesDegerAl()
//    hangiAy()
//    kullaniciDizisiToplami()
    
}

/**
 * Kulanıcı tarafından oluşturulan dizinin elemanlarının toplamını verir
 */
fun kullaniciDizisiToplami() {
    var boyut : Int
    print("Lütfen dizi boyutunu giriniz")
    boyut = readLine()?.toInt() ?: 0
    var dizi = Array<Int>(boyut){0}

    for (i in dizi.indices)
    {
        print("${i+1}. Sayı: ")
        dizi[i] = readLine()?.toInt()!!
    }
    for (i in dizi.indices)
        println("dizi[${i}] = ${dizi[i]}")

}

/**
 * Hangi ayda olduğumuzu gösterir
 */
fun hangiAy() {
    var aylar: Array<String> = arrayOf(
        "Ocak",
        "Şubat",
        "Mart",
        "Nisan",
        "Mayıs",
        "Haziran",
        "Temmuz",
        "Ağustos",
        "Eylül",
        "Ekim",
        "Kasım",
        "Aralık"
    )
    var ay : Int = Calendar.getInstance().get(Calendar.MONTH)
    println(aylar[ay])

}

/**
 * Kullanıcıdan alına 5 değeri ekrana yazdırır
 */
fun kulaniciBesDegerAl() {
    var degerler = Array<Int>(5) { 0 }
    for (deger in degerler.indices) {
        print("${deger + 1}. Sayı: ")

        degerler[deger] = readLine()?.toInt() ?: 0
    }

    for (i in degerler.indices)
        println("dizi[$i] = %3d".format(degerler[i]))
}

/**
 * 10 elemanlı bir dizinin indexlerine faktoriyelini atar
 */
fun faktoriyelHesaplalama() {
    var dizi = Array<Int>(10) { 0 }
    var faktoriyel = 1
    for (i in dizi.indices) {
        if (i == 0) {
            dizi[i] = faktoriyel
        } else {
            faktoriyel *= i
            dizi[i] = faktoriyel
        }
    }
    dizi.forEach { eleman ->
        print("$eleman ")
    }
    println()
}
