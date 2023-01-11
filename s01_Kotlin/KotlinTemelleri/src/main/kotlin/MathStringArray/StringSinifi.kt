package MathStringArray

fun main() {
    var isim = " Ömer YILDIZ  "
    var yas = "29"

    println(isim + 1)
    println(yas + 1)

    for (harf in isim)
        println(harf)
    for (harf in 1..isim.length-1)
        print(isim[harf])
    println()
    println(isim.length)
    println(isim.get(1))
    println(isim.substring(0,5))
    println(isim.indexOf('e'))
    println(isim.lastIndexOf('Ö'))
    println(isim.replace('I', 'ı'))
    println(isim.lowercase())
    println(isim.uppercase())


}