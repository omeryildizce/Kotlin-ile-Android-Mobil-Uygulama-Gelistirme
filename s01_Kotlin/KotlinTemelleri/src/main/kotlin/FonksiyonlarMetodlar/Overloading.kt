package FonksiyonlarMetodlar

fun main() {
    
    toplaminiBul(17,13)
    toplaminiBul(17,13,7)
    toplaminiBul(10,11,12,13,14,15,16)
    toplaminiBul(10.1,10.5)
    var sayiDizisi : Array<Int> = arrayOf(1,2,3,4,5,6,7,8,9,10)
    toplaminiBul(sayiDizisi)
}
fun toplaminiBul(sayiDizisi : Array<Int>)
{
    var toplam = 0
    for (s in sayiDizisi)
    {
        toplam += s

    }
    println(toplam)
}
fun toplaminiBul(sayi1: Int, sayi2: Int) {
    println(sayi1 + sayi2)
}
fun toplaminiBul(sayi1: Double, sayi2: Double) {
    println(sayi1 + sayi2)
}
fun toplaminiBul(sayi1: Int, sayi2: Int, sayi3: Int) {
    println(sayi1 + sayi2 + sayi3)
}

fun toplaminiBul(vararg sayilar : Int){
    var toplam : Int = 0
    for (s in sayilar)
    {
        toplam += s
    }
    println(toplam)
}