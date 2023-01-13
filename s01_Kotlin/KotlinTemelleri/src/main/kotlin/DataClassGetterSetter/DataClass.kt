package DataClassGetterSetter

class Kisi(val id: Int, val isim: String) {
    /*override fun toString(): String {
        return "Id: ${this.id} İsim: ${this.isim}"
    }*/

}

data class KisiData(val id: Int, val isim: String) {

}

fun main(args: Array<String>) {
    val emre = Kisi(1, "Emre")
    val hasan = Kisi(2, "Hasan")
    val emreKopya = emre
    val test = Kisi(1, "Emre")

    println(emre.toString())
    println(emre.hashCode())
    println(emreKopya.hashCode())
    println(emre.equals(hasan))
    println(emre.equals(emreKopya))
    println(emre.equals(test))

    println("\n----------" +
            "\n---------------" +
            "\n-----------------------")
    val emreData = KisiData(1, "Emre")
    val hasanData = KisiData(2, "Hasan")
    val emreKopyaData = emreData
    val testData = KisiData(1, "Emre")

    println(emreData.toString())
    println(emreData.hashCode())
    println(emreKopyaData.hashCode())
    println(emreData.equals(hasanData))
    println(emreData.equals(emreKopyaData))
    println(emreData.equals(testData))

    val kopyaHasan = hasanData.copy()
    println("Kopya hasan: " + kopyaHasan)
    println("Kopya hasan id değişik: " + hasanData.copy(id = 90))

    var (id, isim) = emreData
    println("Id: $id İsim: $isim")

}