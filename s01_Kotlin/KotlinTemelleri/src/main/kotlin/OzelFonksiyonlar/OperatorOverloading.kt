package OzelFonksiyonlar
class Baslik(var deger:String){

}

fun main(args: Array<String>) {
    var isim = "Emre"
    var soyisim = " YILDIZ"

    var tamad0 = isim + soyisim
    var tamad1 = isim.plus(soyisim)

    println(tamad1)

    val b1 = Baslik("Başlık 1")
    val b2 = Baslik("Başlık 2")

    val b3 = b1.plus(b2)
    val b4 = b1 + b2 + b1 + b1

    println(b3.deger)
    println(b4.deger)
}

operator fun Baslik.plus(b2: Baslik) : Baslik{
    var geciciBaslik : Baslik = Baslik(this.deger + " " + b2.deger)

    return geciciBaslik
}

