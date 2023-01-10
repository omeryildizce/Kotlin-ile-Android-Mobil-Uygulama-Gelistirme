package Diziler

fun main() {

    var sayi: Int = 50
    var sayilar: Array<Int> = arrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, sayi)

    println(sayilar[0])
    println(sayilar.size)
    println(sayilar.get(sayilar.size - 1))

    val kelimeler: Array<String> = arrayOf("Ömer", "Ali", "Ahmet")

    var degiskenlerim: Array<Any> = arrayOf(true, 1, 2.0f, 3.5, "Ömer", 'E')
    println(degiskenlerim[0])

    var gunler: Array<String> = arrayOf("pazertesi", "salı", "çarşamba")

}