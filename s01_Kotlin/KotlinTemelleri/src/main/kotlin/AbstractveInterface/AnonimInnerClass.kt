package AbstractveInterface

interface Okuyabilen{
    fun oku()
}

class Tarayici : Okuyabilen{
    override fun oku() {
         println("Tarayıcı okudu")
    }

}

fun main(args: Array<String>) {
    var tarayici = Tarayici()
    tarayici.oku()

    var isimsizSinif = object : Okuyabilen
    {
        override fun oku() {
            println("Yazıcı okudu")
        }

    }
    isimsizSinif.oku()
}