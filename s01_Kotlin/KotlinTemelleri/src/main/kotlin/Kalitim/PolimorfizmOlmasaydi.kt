package Kalitim

open class Calisan {
    open var pozisyon: String = "Çalışan"
    open fun calis()
    {
        println("$pozisyon çalışmaya başladı.")
    }
}

open class Mudur : Calisan(){
    override var pozisyon: String = "Müdür"
    override fun calis() {
        println("$pozisyon çalışmaya başladı.")
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
    var calisanlar:Array<Any> = Array<Any>(4){ Any() }
    calisanlar[0] =  Calisan()
    calisanlar[1] = Mudur()
    calisanlar[2] = Programci()
    calisanlar[3] = Pazarlamaci()
    mesaiyeBasla(calisanlar)
    println("-----------------------------------")
    var calisanlar1:Array<Calisan> = Array<Calisan>(7){ Calisan() }
    calisanlar1[0] =  Calisan()
    calisanlar1[1] = Mudur()
    calisanlar1[2] = Programci()
    calisanlar1[3] = Pazarlamaci()
    calisanlar1[4] = GenelMudur()
    calisanlar1[5] = AnalizProgramci()
    calisanlar1[6] = SistemProgramci()
    mesaiyeBaslaPolimorfizm(calisanlar1)
}

fun mesaiyeBasla(calisanlar: Array<Any>) {
    for (calisan in calisanlar){
        if (calisan is Calisan)
        {
            var calisanKisi = calisan
            calisanKisi.calis()
        }
        else if(calisan is Mudur){
            var mudur : Mudur = calisan
            mudur.calis()
        }
        else if(calisan is Pazarlamaci){
            var pazarlamaci:Pazarlamaci = calisan
            pazarlamaci.calis()
        }
        else {
            if (calisan is Programci){
                var programci:Programci = calisan
                programci.calis()
            }
        }
    }
}

fun mesaiyeBaslaPolimorfizm(calisanlar: Array<Calisan>){
     for (calisan in calisanlar)
     {
         calisan.calis()
         if (calisan is SistemProgramci)
             calisan.sistemiIncele()
     }
}