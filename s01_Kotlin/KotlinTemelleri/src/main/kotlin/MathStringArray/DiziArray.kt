package MathStringArray

fun main() {
    var sayilarDizisi = Array<Int>(size = 6) { 0 }
    var kelimelerDizisi = Array<String>(size = 6) { "" }

    for (i in sayilarDizisi.indices) {
        sayilarDizisi[i] = i + 1
        println(sayilarDizisi[i])
    }
    var degiskenlerim: Array<Any>  = arrayOf("emre",18,true)
    for (i in degiskenlerim)
        println(i)
}