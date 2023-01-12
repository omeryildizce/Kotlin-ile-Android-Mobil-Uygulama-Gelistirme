package Kalitim

class ArabaMotoru() {
    fun calis() {}
    fun dur() {}
}

class Pencere() {
    fun assagiCek() {}
    fun yukariCek() {}
}

class Kapi() {
    var pencere: Pencere = Pencere()

    fun ac() {}

    fun kapa() {}
}

class Tekerlek() {
    fun havaPompala(miktar: Int) {}
}

class Araba {
    var arabaMotoru = ArabaMotoru()
    var sagKapi = Kapi()
    var solKapi = Kapi()

    var tekerlekler = Array<Tekerlek>(4) { Tekerlek() }

}

fun main(args: Array<String>) {
    var arabam :Araba = Araba()
    arabam.sagKapi.pencere.assagiCek()
    arabam.solKapi.pencere.yukariCek()
    arabam.tekerlekler[2].havaPompala(50)

}