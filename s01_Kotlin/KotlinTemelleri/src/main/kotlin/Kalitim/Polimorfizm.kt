package Kalitim

open class Asker {
    open fun selamVer() {
        println("Asker selam verdi")
    }
}

class Er : Asker() {
    override fun selamVer() {
        println("Er selam verdi")
    }
}

class Yuzbasi : Asker() {
    override fun selamVer() {
        println("Yüzbaşı selam verdi")
    }
}


fun main(args: Array<String>) {
    var kisi: Asker
    kisi = Asker()

    var kisi2: Asker
    kisi2 = Er()

   var asker=Asker()
   var er=Er()
   var yuzbasi=Yuzbasi( )

    var asker2 : Asker
    asker2 = Asker()
    asker2 = Er()
    asker2 = Yuzbasi()


   hazirOl(asker)
}

fun hazirOl(asker: Asker) {
    asker.selamVer()
}