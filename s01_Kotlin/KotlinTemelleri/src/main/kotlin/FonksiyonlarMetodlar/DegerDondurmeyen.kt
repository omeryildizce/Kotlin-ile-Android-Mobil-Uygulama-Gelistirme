package FonksiyonlarMetodlar

fun main() {
    // isimYazdir()
    // isimparametreliYazdir("ömer")
    // menuGoster()
}

private fun menuGoster() {
    println("%13s".format("Menü"))
    println("1 - iki sayının toplamı")
    println("2 - iki sayının farkı")
    println("3 - iki sayının çarpımı")
    println("4 - iki sayının bölümü")

}

fun isimparametreliYazdir(isim: String) {
    println("İsim: $isim")
}

fun isimYazdir() {
    println("Ömer")
}
