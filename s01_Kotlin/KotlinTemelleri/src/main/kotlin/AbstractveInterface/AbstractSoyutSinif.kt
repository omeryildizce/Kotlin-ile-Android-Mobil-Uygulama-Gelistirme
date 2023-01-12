package AbstractveInterface

abstract class Calisan {
    open var pozisyon: String = "Çalışan"
    abstract fun calis()
    open fun soyutOlmayanMethod(){
        println("Soyut olmayan sınıf")
    }
}

open class Mudur : Calisan(){
    override var pozisyon: String = "Müdür"
    override fun calis() {
        println("$pozisyon çalışmaya başladı.")
    }

    override fun soyutOlmayanMethod() {
        println("Mudur çağırdı")
    }
}


open class Programci : Calisan(){
    override var pozisyon: String = "Programcı"
    override fun calis() {
        println("$pozisyon çalışmaya başladı.")
    }
}
class AnalizProgramci : Programci(){
    override var pozisyon: String = "Analiz Programcı"
    override fun calis() {
        println("$pozisyon çalışmaya başladı.")
    }
}
class SistemProgramci : Programci(){
    override var pozisyon: String = "Sistem Programcı"
    override fun calis() {
        println("$pozisyon çalışmaya başladı.")
    }

    fun sistemiIncele(){
        println("Sistemi inceliyor")
    }
}
class Pazarlamaci : Calisan(){
    override var pozisyon: String = "Pazarlamacı"
    override fun calis() {
        println("$pozisyon çalışmaya başladı.")
    }
}
class GenelMudur() : Mudur(){
    override var pozisyon: String = "Genel Müdür"
    override fun calis() {
        println("$pozisyon çalışmaya başladı.")
    }
}

fun main(args: Array<String>) {

    println("-----------------------------------")
    var calisanlar:Array<Calisan> = Array<Calisan>(7){ Programci() }
    calisanlar[0] =  Pazarlamaci()
    calisanlar[1] = Mudur()
    calisanlar[2] = Programci()
    calisanlar[3] = Pazarlamaci()
    calisanlar[4] = GenelMudur()
    calisanlar[5] = AnalizProgramci()
    calisanlar[6] = SistemProgramci()
    mesaiyeBaslaPolimorfizm(calisanlar)
}

fun mesaiyeBaslaPolimorfizm(calisanlar: Array<Calisan>){
    for (calisan in calisanlar)
    {
        calisan.calis()
        if (calisan is SistemProgramci)
            calisan.sistemiIncele()
    }
}