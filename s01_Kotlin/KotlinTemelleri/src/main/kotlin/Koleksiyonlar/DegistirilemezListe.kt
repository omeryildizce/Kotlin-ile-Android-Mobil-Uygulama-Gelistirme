package Koleksiyonlar

/**
 * List
 * * mutable, immutable
 * immutable : listOf() or listOfNotNull()
 */

fun main(args: Array<String>) {
    var listOfListesi = listOf(2,3.0,"text", true, null)
    for (e in  listOfListesi)
    {
        println(e)
    }
    println( listOfListesi.get(0) as Int + 5 )

    listOfListesi[3]
    listOfListesi.size

    var listOfNotNullListesi = listOfNotNull(2,3.0,"text", true, null, null)
    println(listOfNotNullListesi.size)


}