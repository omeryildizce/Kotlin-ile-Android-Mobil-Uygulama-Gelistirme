package DataClassGetterSetter

class KitapKotlin {
    var isim: String
    var id: Int
        get() = field
        set(value) {
            if (value < 0) field = 1 else field = value
        }

    constructor(id: Int, isim: String, kapakRenk: KapakRenk) {
        this.id = id
        this.isim = isim
        this.kapakRenk = kapakRenk
    }
    var kapakRenk:KapakRenk
}

enum class KapakRenk {
    KIRMIZI,
    MAVİ,
    YEŞİL,
    SİYAH,
    BEYAZ
}


fun main(args: Array<String>) {
    var k1: Kitap = Kitap(-9, "sefiller")
    println(k1.getId())
    println(k1.ad)

    var k2 = KitapKotlin(-5, "Kitap", KapakRenk.YEŞİL)
    println(k2.id)
    println(k2.isim)
    println(k2.kapakRenk)


}