package AbstractveInterface

object Ogr{
    var sayac: Int = 0
    fun sayaciGoster(){
        println("Sayaç: ${this.sayac}")
    }
}

fun main(args: Array<String>) {
    var ogr1 = Ogr
    ogr1.sayac = 5
    ogr1.sayaciGoster()

    var ogr2 = Ogr
    ogr2.sayac=7
    ogr1.sayaciGoster()
    Ogr.sayaciGoster()
}