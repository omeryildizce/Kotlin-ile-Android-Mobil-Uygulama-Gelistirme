package OzelFonksiyonlar

class TestLambda {
    fun ikiSayiyiTopla(sayi1: Int, sayi2: Int, action: (Int, Int) -> Int) {
        val toplam = action(sayi1, sayi2)
        println(toplam)
    }
    fun terstenYaz(yazi: String, action: (String) -> String){
        val reverse = action(yazi)
        println(reverse)
    }
    fun terstenYaz1(yazi: String, myFunc: (String) -> String){
        val reverse = myFunc(yazi)
        println(reverse)
    }
}

fun main(args: Array<String>) {
    var nesne = TestLambda()
    nesne.ikiSayiyiTopla(17, 27, { a: Int, b: Int -> a + b })
    nesne.ikiSayiyiTopla(17, 27, { a: Int, b: Int -> a * b })
    nesne.ikiSayiyiTopla(17, 27, { a: Int, b: Int -> a - b })
    nesne.ikiSayiyiTopla(17, 27, { a: Int, b: Int -> a / b })
    nesne.ikiSayiyiTopla(17, 27) { a: Int, b: Int -> a % b }

    nesne.terstenYaz("Ömer YILDIZ", {text:String -> text.reversed() })
    nesne.terstenYaz1("Ömer YILDIZ", {text:String -> text.reversed() })
    nesne.terstenYaz1("Ömer YILDIZ", {
        it.reversed() })

}