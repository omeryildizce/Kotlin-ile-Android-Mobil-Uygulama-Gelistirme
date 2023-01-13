package OzelFonksiyonlar

import java.util.function.Consumer

/**
 * High Level Functions
 * - parametre olarak fonksiyon alan fonksiyonlar
 * - geriye fonksiyon da döndürebilir
 * veya ikisinide yapabilir
 */

fun main(args: Array<String>) {
    var sayilar = listOf<Int>(1, 2, 3, 4, 5, 6)
    for (sayi in sayilar) {
        println(sayi)
    }
    sayilar.forEach { sayi ->
        println(sayi)
    }
    var consumer: Consumer<Int> = object : Consumer<Int> {
        override fun accept(t: Int) {
            println(t)
        }

    }
    sayilar.forEach(consumer)

    sayilar.forEach { sayi ->
        println(sayi)
    }
}