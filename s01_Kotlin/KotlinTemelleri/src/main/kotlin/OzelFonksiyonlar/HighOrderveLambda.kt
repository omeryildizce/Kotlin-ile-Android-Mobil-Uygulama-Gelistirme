package OzelFonksiyonlar

fun main(args: Array<String>) {
    var nesne : Topla = Topla()
    nesne.ikiSayiyiTopla(3,5)

    nesne.ikiSayiyiTopla(6,10, object : ToplamGosteren{
        override fun toplamGosteren(toplam: Int) {
            println(toplam)
        }
    })
    var lambda = {sayi:Int -> println(sayi) }
    nesne.ikiSayiyiTopla(10,7,lambda)
}

class Topla{
    fun ikiSayiyiTopla(a:Int, b:Int){
        val toplam = a + b
        println(toplam)
    }
    fun ikiSayiyiTopla(a:Int, b:Int, action: ToplamGosteren ){
        val toplam = a + b
        action.toplamGosteren(toplam)
    }
    fun ikiSayiyiTopla(a:Int, b:Int, action:(Int) -> Unit){
        val toplam = a + b
        action(toplam)
    }


}

interface ToplamGosteren{
    fun toplamGosteren(toplam:Int)
}