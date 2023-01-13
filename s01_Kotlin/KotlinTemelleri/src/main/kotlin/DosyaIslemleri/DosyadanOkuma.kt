package DosyaIslemleri

import java.io.FileReader

fun main(args: Array<String>) {
   var dosya: FileReader? = null
    try {
        dosya = FileReader("ilkdosya.txt")
        var okunanVeri = dosya.readLines()
        println(okunanVeri)
     }catch (istisna : Exception){
        println(istisna.message)
    }finally {
        dosya?.close()
    }

    try {
        dosya?.forEachLine { line ->
            println(line)
        }
    }catch (e:Exception) {}

}