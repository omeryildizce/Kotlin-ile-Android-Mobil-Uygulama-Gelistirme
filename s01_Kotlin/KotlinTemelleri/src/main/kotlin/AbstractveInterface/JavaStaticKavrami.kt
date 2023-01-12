package AbstractveInterface

import AbstractveInterface.OgrenciJava

object JavaStaticKavrami {
    var sinifAdi = "JavaStaticKavramı"
    @JvmStatic
    fun main(args: Array<String>) {
        val ogrenci = OgrenciJava(10, "Ömer")
        ogrenci.bilgileriYazdir()
        val ogrenci2 = OgrenciJava(11, "Ali")
        ogrenci2.bilgileriYazdir()
        val ogrenci3 = OgrenciJava(12, "Hakan")
        ogrenci3.bilgileriYazdir()
        println(OgrenciJava.toplamOgrenciSayisi)
    }
}

internal class OgrenciJava(private val id: Int, private val isim: String) {
    init {
        toplamOgrenciSayisi++
    }

    fun bilgileriYazdir() {
        System.out.printf("No: %d İsim: %s Toplam Öğrenci Sayısı: %d%n", id, isim, toplamOgrenciSayisi)
    }

    companion object {
        var toplamOgrenciSayisi = 0
    }
}