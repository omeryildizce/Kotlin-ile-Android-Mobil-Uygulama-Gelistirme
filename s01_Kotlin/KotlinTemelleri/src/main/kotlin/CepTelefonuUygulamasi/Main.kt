package CepTelefonuUygulamasi

private val cepTelefonu = CepTelefonu("555-55-55")
val RC = "\u001b[0m" // Reset foreground and background colors. --> $RC
val R = "\u001b[7m"  // Invert foreground to background. --> $R
val RESET = "\u001B[0m";
val BLACK = "\u001B[30m";
val RED = "\u001B[31m";
val GREEN = "\u001B[32m";
val YELLOW = "\u001B[33m";
val BLUE = "\u001B[34m";
val PURPLE = "\u001B[35m";
val CYAN = "\u001B[36m";
val WHITE = "\u001B[37m";
fun main(args: Array<String>) {
    telefonuBaslat()
    menuGoster()

    var cikis = false
    while (!cikis) {
        print(YELLOW + "Seçiminiz: " + RESET)
        var secim: Int? = readlnOrNull()?.toInt()
        when (secim) {
            0 -> {
                println(R + "Çıkış yapılıyor..." + RC)
                cikis = true
            }

            1 -> cepTelefonu.tumKisileriListele()
            2 -> {
                yeniKisiEkleFonksiyonu()
            }

            3 -> kisiSorgula()
            4 -> kisiSil()
            5 -> kisiGuncelle()
            6 -> menuGoster()
            else -> println(RED + "Yanlış Seçim Yaptınız!" + RESET)
        }


    }
}

fun kisiGuncelle() {
    println("Güncellenecek kişi")
    val isim = readLine()
    val bulunanKisi = cepTelefonu.kisiSorgula(isim!!)
    if (bulunanKisi==null)
    {
        println("Kayıt bulunamadı")
    }
    else{
        println("Adını giriniz")
        val isim: String = readLine()!!
        println("Numarasını giriniz")
        val numara: String = readLine()!!
        var guncellenecekKisi = Kisi(isim, numara)
        cepTelefonu.kisiGuncelle(bulunanKisi,guncellenecekKisi)
    }
}

fun kisiSil() {
    println("Silinecek kişi: ")
    val isim: String = readLine()!!
    val bulunanKisi = cepTelefonu.kisiSorgula(isim)
    if (bulunanKisi != null) {
        if (cepTelefonu.kisiSil(bulunanKisi!!)) {
            println(GREEN + "Silindi")
        }
    } else {
        println(RED + "Silinemedi" + RESET)

    }
}

fun yeniKisiEkleFonksiyonu() {
    println("Yeni kişinin adını giriniz")
    val isim: String = readLine()!!
    println("yeni kişinin numarasını giriniz")
    val numara: String = readLine()!!
    cepTelefonu.ekleYeniKisi(Kisi.kisiOlustur(isim, numara))
}

fun menuGoster() {
    println(R + "************   Menü   ************" + RC)
    println(
        RED + "0 --> Çıkış\n" + RESET +
                BLUE + "1 --> Tüm Kişileri Listele\n" +
                "2 --> Yeni Kişi Ekle\n" +
                "3 --> Kişi Ara\n" +
                "4 --> Kişi Sil\n" +
                "5 --> Kişi Güncelle\n" +
                RED + "6 --> Menüyü Göster" + RESET
    )

}

fun telefonuBaslat() {
    println(R + "    Telefon başlatılıyor...     " + RC + "\n\n")

}

fun kisiSorgula() {
    println("Aranacak Kişi Adını Giriniz")
    val isim = readLine()
    val bulunanKisi = cepTelefonu.kisiSorgula(isim!!)
    if (bulunanKisi == null) {
        println(YELLOW + "Rehberde böyle bir kişi yok!" + RESET)
    } else
        println(
            GREEN + "İsim: ${bulunanKisi.isim}" +
                    "\n-> Numara: ${bulunanKisi.telNo}" + RESET
        )

}