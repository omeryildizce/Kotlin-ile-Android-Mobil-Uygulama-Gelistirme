package MathStringArray

fun main() {
    var dizi1 = arrayOf(5, 1, 3, 90, 4)
    var dizi2 = Array<Int>(size = 5) { 0 }

    for (i in dizi1.indices) {
        dizi2[i] = dizi1[i]
    }

    for (sayi in dizi2)
        println(sayi)

    System.arraycopy(dizi1, 0, dizi2, 0, 5)

    dizi2 = dizi2.sortedArray()
    for (sayi in dizi2)
        println(sayi)

    println(dizi1.equals(dizi2))


    /**
     * ArrayList
     */
    var isimler = arrayListOf("emre", "ali", "ömer")
    for (isim in isimler) {
        println(isim)
    }
    isimler.add("kadir")
    isimler.add(0,"Ayşe")
    println(isimler.get(2))
    println(isimler.size)
    println(isimler.remove("Ayşe"))
    println(isimler.set(0, "ömer"))
    println(isimler.clear())

}
