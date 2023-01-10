package Operatorler

fun main() {
    /**
     *  ()
     *  ++ ve -- değiskenden önce
     *  ^
     *  * ve /
     *  + ve -
     *  = atama
     *  degiskenden sonra ++ ve --
     */
    var sayi1 = 15
    var sayi2 = 5
    var sonuc: Int
    sonuc = (sayi1 + sayi2++ * 2 - --sayi2) + sayi2 - ++sayi1 * 5  + sayi2++
    println(sonuc   )
}