package Generic

class StringDiziYaz {
    fun diziYazdir(dizi: Array<String>) {
        for (gecici in dizi) {
            println(gecici)
        }
    }
}

class GenericDiziYaz<Genel>(var dizi: Array<Genel>) {
    fun diziYazdir( ) {
        for (gecici in this.dizi) {
            print("$gecici ")
        }
        println()
    }
}

fun main(args: Array<String>) {
    var stringDizi = arrayOf("Emre", "Hasan", "Ali")
    var stringDiziYaz = StringDiziYaz()
    stringDiziYaz.diziYazdir(stringDizi)

    var intDizi = arrayOf(1,2,3,4,5,6,7,8,9,10)
    println("----------------------------------------")
    var genericDiziYaz = GenericDiziYaz(stringDizi)
    genericDiziYaz.diziYazdir()
    var genericDiziYaz2 = GenericDiziYaz(intDizi)
    genericDiziYaz2.diziYazdir()



}