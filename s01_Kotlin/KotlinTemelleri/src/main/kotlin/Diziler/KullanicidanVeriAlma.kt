package Diziler

fun main() {
    print("İsim giriniz: ")
    var isim: String? = readLine()
    print("Soyisim giriniz: ")
    var soyisim : String = readLine()!!
    print("Yaşınız: ")
    var yas : Int? = readLine()?.toInt()

    println("Personel: $isim $soyisim $yas")




}