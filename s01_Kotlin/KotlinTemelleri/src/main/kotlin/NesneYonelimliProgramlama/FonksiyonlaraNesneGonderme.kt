package NesneYonelimliProgramlama

class Daire(var yaricap: Int){

}

fun main() {
    var d1: Daire = Daire(3)
    daireAlaniniHesapla(d1)
    var d2 : Daire = Daire(5)
    daireAlaniniHesapla(d2)
    var d3:Daire = Daire(7)
    var d4:Daire = Daire(11)
    var d5:Daire = Daire(13)

    var daireler: Array<Daire> = Array<Daire>(5){Daire(0)}
    daireler[0] = d1
    daireler[1] = d2
    daireler[2] = d3
    daireler[3] = d4
    daireler[4] = d5

    daireDizisiniGoster(daireler)
}

fun daireAlaniniHesapla(daire: Daire){
    println("Dairenin alanı: ${daire.yaricap * daire.yaricap * Math.PI}")
}

fun daireDizisiniGoster(daireDizi : Array<Daire>) {
     for (daire in daireDizi){
        daireAlaniniHesapla(daire)
     }
}