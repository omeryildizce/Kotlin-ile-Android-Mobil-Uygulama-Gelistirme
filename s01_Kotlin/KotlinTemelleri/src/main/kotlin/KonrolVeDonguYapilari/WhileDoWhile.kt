package KonrolVeDonguYapilari

fun main() {
    var i = 0
    while (i < 10) {
        println(i++)
    }

    /**
     * Çift sayılar
     */
    i = 1
    while (i <= 100) {
        if (i % 2 == 0) {
            print("%4d".format(i))
        }
        if (i % 10 == 0)
            println()
        i++
    }

    
}