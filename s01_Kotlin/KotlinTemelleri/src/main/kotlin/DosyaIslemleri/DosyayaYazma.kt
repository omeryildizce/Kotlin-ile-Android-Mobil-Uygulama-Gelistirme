package DosyaIslemleri

import java.io.File
import java.io.FileWriter

fun main(args: Array<String>) {

    var file = FileWriter("ilkdosya.txt", true)
    println("Adınızı giriniz: ")
    var isim = readLine()
    file.appendLine(isim)
    println("Yaşınızı giriniz: ")
    var yas = readLine()
    file.appendLine(yas)
    println("Veri dosyaya yazıldı")


    file.close()

}