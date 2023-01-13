package OzelFonksiyonlar

import java.math.BigInteger

fun main(args: Array<String>) {
    // selamVer()
    println("70_000! = " + faktoriyelRecursive(BigInteger("70000")))


}

tailrec fun faktoriyelRecursive(i: BigInteger, sonuc: BigInteger = BigInteger.ONE) : BigInteger {
    if (i == BigInteger.ZERO)
        return sonuc
    else
        return  faktoriyelRecursive(i - BigInteger.ONE, i*sonuc)
}

fun selamVer() {
    println("Merhaba")
    selamVer()
}