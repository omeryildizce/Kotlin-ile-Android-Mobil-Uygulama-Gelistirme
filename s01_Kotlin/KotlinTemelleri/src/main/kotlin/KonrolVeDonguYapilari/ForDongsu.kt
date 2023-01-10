package KonrolVeDonguYapilari

import kotlin.random.Random

fun main() {
    for (x in 1..10) {
        println(x)
    }

    var isim = "Ömer YILDIZ"
    for (h in isim) {
        println(h)
    }

    var sayilar = arrayOf(5, 10, 15, 20)
    var toplam = 0
    for (sayi in sayilar) {
        toplam += sayi
    }
    println(toplam)

    for (i in 1..5) {
        for (j in 1..5) {
            print("${Random.nextInt(0,10)} ")
        }
        println()
    }
}