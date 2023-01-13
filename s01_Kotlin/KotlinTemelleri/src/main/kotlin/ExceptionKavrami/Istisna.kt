package ExceptionKavrami

fun main(args: Array<String>) {
    var dizi = Array<Int>(3) { 0 }
    dizi[0] = 0
    dizi[1] = 1
    dizi[2] = 2



    istisna1(dizi)
    println("*******   Main   *******")

}

fun istisna1(dizi : Array<Int>){
    println("İstisna 1 başladı")
    istisna2(dizi)
    println("İstisna 1 bitti")
}
fun istisna2(dizi : Array<Int>){
    println("İstisna 2 başladı")
    try {

        for (i in 0..4)
            println("Sayı $i: ${dizi[i]}")
    } catch (e: ArrayIndexOutOfBoundsException) {
        e.printStackTrace()
    } catch (e: ArithmeticException) {
        e.printStackTrace()
    } finally {
        println("*******   Finally   *******")
    }
    println("İstisna 2 bitti")
}