package Koleksiyonlar

fun main(args: Array<String>) {
    var degisebilenListe = ArrayList<Int>()
    var arrayListOfListesi = arrayListOf(10,3, "Van", null)

    arrayListOfListesi.add(10.5f)
    arrayListOfListesi.add(true)

    for (i in arrayListOfListesi)
        println(i)

    arrayListOfListesi.set(1,"5")
    arrayListOfListesi.removeAt(0)
    arrayListOfListesi.remove("Van")
    arrayListOfListesi.size


}