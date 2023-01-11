package FonksiyonlarMetodlar

fun main() {

    val toplam = topla(10,20)
    println("Toplam: " + toplam)

    val selam = selam("Ömer")
    println(selam)

    println(faktoriyel(4))
}

fun faktoriyel(sayi: Int): Int {
    if (sayi == 1 || sayi == 0)
        return 1
    else
        return sayi * faktoriyel(sayi -1)
}

fun selam(isim: String): String {
    return "Merhaba $isim"
}

fun topla(sayi1: Int, sayi2: Int): Int {
    return sayi1 + sayi2
}
