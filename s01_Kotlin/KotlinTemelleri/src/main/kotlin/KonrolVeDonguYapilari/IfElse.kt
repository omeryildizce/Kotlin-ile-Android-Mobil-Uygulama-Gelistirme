package KonrolVeDonguYapilari

fun main() {
    var yas: Int = 18
    if (yas > 18)
        println(true)
    else
        println(false)


    var not = 78
    var sonuc = if (not < 60) {
        println("F")
        0
    } else if (not in 60..74) {
        println("C")
        1
    } else if (not in 75..89) {
        println("B")
        2
    } else {
        println("A")
        3
    }
    println(sonuc)
}