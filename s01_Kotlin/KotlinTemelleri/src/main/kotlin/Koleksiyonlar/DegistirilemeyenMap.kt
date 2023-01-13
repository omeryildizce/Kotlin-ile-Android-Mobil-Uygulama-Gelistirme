package Koleksiyonlar

fun main(args: Array<String>) {
    var map = mapOf<Int,String>(1 to "Ömer" , 2 to "Hasan", 3 to "Emre")
    var ali = 4 to "Ali"

    println(map.get(1))

    for (id in map.keys){
        println("Id: $id Name: ${map[id]}")
    }

    var aranacakIfade = readln()
    if (map.containsValue(aranacakIfade))
        println("Bulundu")

}