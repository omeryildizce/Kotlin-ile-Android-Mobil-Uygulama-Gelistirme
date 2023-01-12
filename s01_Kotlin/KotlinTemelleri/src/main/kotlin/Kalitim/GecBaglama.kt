package Kalitim

open class Hayvan {
    open fun avYakala() {
        println("Av yakala çalıştı")
    }
}

class Kartal : Hayvan() {
    override fun avYakala() {
        println("Kartal av yakala çalıştı")
    }
}

class Timsah : Hayvan() {
    override fun avYakala() {
        println("Timsah av yakala çalıştı")
    }
}

fun main(args: Array<String>) {
    var hayvanlar: Array<Hayvan> = Array<Hayvan>(3) { Hayvan() }
    for (i in hayvanlar.indices){
        hayvanlar[i] = rastgeleSec()
    }
    for (hayvan in hayvanlar)
        hayvan.avYakala()
}

fun rastgeleSec(): Hayvan {
    var rastgeleSayi = (Math.random() * 3).toInt() + 1
    var hayvan:Hayvan

    hayvan = when(rastgeleSayi){
        1 -> Hayvan()
        2 -> Kartal()
        3 -> Timsah()
        else -> {Hayvan()}
    }
    return hayvan

}
