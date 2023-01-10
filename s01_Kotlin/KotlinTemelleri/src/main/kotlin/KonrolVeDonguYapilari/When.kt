package KonrolVeDonguYapilari

fun main() {
    var not: Int? = readLine()?.toInt() ?: 0

    var sonuc: String = when (not) {
        in 0..44 -> {
            println("F2")
            "F2"
        }

        in 45..59 -> {
            println("F1")
            "F1"
        }

        in 60..64 -> {
            println("C3")
            "C3"
        }

        in 65..69 -> {
            println("C2")
            "C2"
        }

        in 70..74 -> {
            println("C1")
            "C1"
        }

        in 75..79 -> {
            println("B3")
            "B3"
        }

        in 80..84 -> {
            println("B2")
            "B2"
        }

        in 85..89 -> {
            println("B1")
            "B1"
        }

        in 90..100 -> {
            println("A")
            "A"
        }

        else -> {
            println("F3")
            "F3"
        }

    }
    println(sonuc)
}