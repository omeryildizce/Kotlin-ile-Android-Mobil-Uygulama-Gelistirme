package Degiskenler

fun main(args: Array<String>) {

    var isTrue: Boolean = 3 < 4
    println("--Boolean--")
    println("True: " + isTrue)
    println("False: " + !isTrue)

    var ilk: Char = 'ö'
    var ikinci: Char = 'a'
    println("--Char--")
    println("ilk harf: " + ilk)
    println("ikinci harf: " + ikinci)
    println(Char.SIZE_BITS)
    println(Char.SIZE_BYTES)
    /*
        println(Char.MIN_VALUE)
        println(Char.MAX_VALUE)
        println(Char.MIN_LOW_SURROGATE)
        println(Char.MIN_HIGH_SURROGATE)
        println(Char.MIN_SURROGATE)
        println(Char.MAX_SURROGATE)
        println(Char.MAX_LOW_SURROGATE)
        println(Char.MAX_HIGH_SURROGATE)
    */

    var isim: String = "Ömer"
    println("--String--")
    println("isim: " + isim)
    println("isim: ${isim}")
    println("length: " + isim.length)
    println("indices: " + isim.indices)
    println("isim[0] = " + isim[0])
    println("isim[3] = " + isim[3])

    println("last index: " + isim.lastIndex)
    println(isim[3] - 32)
    println("""\n""")


}