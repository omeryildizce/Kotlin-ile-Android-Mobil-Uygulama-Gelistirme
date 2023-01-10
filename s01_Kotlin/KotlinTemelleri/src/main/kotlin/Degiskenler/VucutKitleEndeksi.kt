package Degiskenler

fun main() {
    val isim: String = "Ömer"
    val yas: Byte = 22
    val kilo: Short = 75 // Kilogram
    val boy: Double = 1.75 // Metre

    val vucutKitleIndeksi: Double

    vucutKitleIndeksi = kilo / (boy * boy.toDouble())
    println("$isim : Vücut Kitle İndeksi = $vucutKitleIndeksi")

    if (vucutKitleIndeksi < 18.5) println("Zayıf")
    else if (vucutKitleIndeksi<=24.9) println("Normal")
    else println("Kilolu")

}