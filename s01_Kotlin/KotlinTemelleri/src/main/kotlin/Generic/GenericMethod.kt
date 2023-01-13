package Generic

abstract class GeometrikSekil {
    abstract fun alanHesapla(): Int
}

class Kare(var kenarUzunlugu: Int) : GeometrikSekil() {
    override fun alanHesapla(): Int {
        return kenarUzunlugu * kenarUzunlugu
    }
}

class DikDortgen(var en: Int, var boy: Int) : GeometrikSekil() {
    override fun alanHesapla(): Int {
        return en * boy
    }
}

fun main(args: Array<String>) {
    var kare1 = Kare(17)
    var kare2 = Kare(13)
    var buyuk = alanKarsilastir(kare1, kare2)
    println("Alan: ${buyuk.alanHesapla()}")

    var d1 = DikDortgen(17, 13)
    var d2 = DikDortgen(13, 19)
    var dbuyuk = alanKarsilastir(d1, d2)
    println("Alan: ${dbuyuk.alanHesapla()}")

    var g1 = DikDortgen(17, 13)
    var g2 = DikDortgen(13, 19)
    var gbuyuk = alanKarsilastir(g1, g2)
    println("Alan: ${gbuyuk.alanHesapla()}")

    println("---------***--------")
    var sekil1 = DikDortgen(21, 13)
    var sekil2 = DikDortgen(23, 19)
    var sekilBuyuk = alanKarsilastir(sekil1, sekil2)
    println("Alan: ${sekilBuyuk.alanHesapla()}")

}
fun <Genel:GeometrikSekil> genericAlanKarsilastirFun(sekil1:Genel, sekil2:Genel) : Genel{
    if (sekil1.alanHesapla() < sekil2.alanHesapla()){
        return sekil2
    }
    else
        return sekil1
}
fun alanKarsilastir(k1: Kare, k2: Kare): Kare {
    if (k1.alanHesapla() < k2.alanHesapla()) {
        return k2
    } else {
        return k1
    }
}


fun alanKarsilastir(d1: DikDortgen, d2: DikDortgen): DikDortgen {
    if (d1.alanHesapla() < d2.alanHesapla()) {
        return d2
    } else {
        return d1
    }
}

fun alanKarsilastir(d1: GeometrikSekil, d2: GeometrikSekil): GeometrikSekil {
    if (d1.alanHesapla() < d2.alanHesapla()) {
        return d2
    } else {
        return d1
    }
}