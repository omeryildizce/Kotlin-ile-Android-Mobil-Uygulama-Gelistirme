package Diziler

fun main() {
    var sayilar: IntRange = 1..20
    var adanz : CharRange = 'a'..'z'
    var sayilarTersten : IntRange = 20 .. 1
    var oneToTen : IntRange = 1.rangeTo(20)
    var oneTwoTenRevese: IntProgression = 20.downTo(1)
    var beserSayiar = 0.rangeTo(100).step(5)

    var elamanVarMi : Boolean = 10 in beserSayiar
    println(elamanVarMi)

    println(beserSayiar.first)
    println(beserSayiar.last)
    println(beserSayiar.step)


}