package AbstractveInterface

 class DisSinif{
     var sinifAdi = "Dış Sınıf"
     fun selamVerDisSinif(){
         println("Dış sınıftan merhaba")
     }

     inner class IcSinif{
         var sinifAdi = "İç Sınıf"
        fun selamVerIcSinif(){
            println("İç sınıftan merhaba")
        }
         inner class EnIctekiSinif{
            fun enIcdekiSinif(){
                print("-->")
                selamVerDisSinif()
                print("   -->")
                selamVerIcSinif()
                print("      -->")
                println("En içten merhaba")
            }
         }
     }

 }

fun main(args: Array<String>) {
    var  disSinif = DisSinif()
    println(disSinif.sinifAdi)
    disSinif.selamVerDisSinif()
    println("-------------------")
   // var içSinif = DisSinif.IcSinif()
    var içSinif = DisSinif().IcSinif()
    println(içSinif.sinifAdi)
    içSinif.selamVerIcSinif()

    var enIctekiSinif = DisSinif().IcSinif().EnIctekiSinif()
    enIctekiSinif.enIcdekiSinif()


}