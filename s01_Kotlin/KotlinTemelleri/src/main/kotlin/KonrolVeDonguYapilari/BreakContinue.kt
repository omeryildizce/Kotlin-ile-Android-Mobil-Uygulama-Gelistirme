package KonrolVeDonguYapilari

fun main() {
    for (i in 1..10) {
        if (i == 7) {
            break
        }
        print(i)
    }
    println()
    var turkce = "çğıöşü"
    for (harf in 'a'..'z') {
        if (harf in turkce)
            continue
        else
            print(harf)
    }
    println()


    disDongu@ for (i in 1..4) {
        for (j in 1..4) {

            if (i * j > 11) {
                break@disDongu
            }
            print("$i,$j ")
        }
        println()
    }
}