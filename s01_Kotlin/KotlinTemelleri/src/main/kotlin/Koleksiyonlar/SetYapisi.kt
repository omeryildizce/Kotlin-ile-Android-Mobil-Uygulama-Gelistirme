package Koleksiyonlar

fun main(args: Array<String>) {

    var set: Set<Any> = setOf("ömer","ömer",1,1.0,1,"ali","ömer")



    for (s in set)
        println(s)



    var mutSet: MutableSet<Int> = mutableSetOf<Int>()
    mutSet.add(1)
    mutSet.add(1)
    mutSet.add(2)

    println(mutSet)
    println(mutSet.size)
}