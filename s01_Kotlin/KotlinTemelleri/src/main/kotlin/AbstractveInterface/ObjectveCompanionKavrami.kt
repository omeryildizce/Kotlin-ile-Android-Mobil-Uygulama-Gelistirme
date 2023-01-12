package AbstractveInterface

fun main(args: Array<String>) {
   // JavaStaticKavrami.main(args)

    var test: JavaStaticKavrami = JavaStaticKavrami
    println(test.sinifAdi)
    test.sinifAdi = "Yeni Sınıf"
    println(test.sinifAdi)

    var test2:JavaStaticKavrami = JavaStaticKavrami
    println(test2.sinifAdi)
    test2.sinifAdi= "İkinci Sınıf"
    println(test2.sinifAdi)
    println(test.sinifAdi)
}