package Degiskenler

fun main() {
    var shortSayi : Short = 32767
    var intSayi  : Int = 32768
    intSayi = shortSayi.toInt()
    shortSayi = intSayi.toShort()
    println(shortSayi)


    var sayi : Double = 0.999999
    println(sayi.toInt())
    println(sayi.toString())

}