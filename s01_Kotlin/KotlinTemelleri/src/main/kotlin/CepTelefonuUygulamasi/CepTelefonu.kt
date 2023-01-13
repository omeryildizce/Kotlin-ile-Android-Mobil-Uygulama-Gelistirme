package CepTelefonuUygulamasi

class CepTelefonu(val kendiNumaram: String) {
    private val rehber: ArrayList<Kisi>

    init {
        this.rehber = ArrayList()
    }

    fun tumKisileriListele() {
        repeat(10) { print("*") }
        print("   Rehber   ")
        repeat(10) { print("*") }
        println()
        if (rehber.size == 0)
            println("Kayıtlı kişi yok")
        else {
            for (oankiKisi: Kisi in rehber) {
                println(
                    "* İsim: ${oankiKisi.isim}\n" +
                            "** Numara: ${oankiKisi.telNo}\n"
                )
            }
        }
    }

    fun ekleYeniKisi(yeniKisi: Kisi): Boolean {
        if (kisiBul(yeniKisi.isim) >= 0) {
            println("${yeniKisi.isim} zaten rehberde kayıtlı")
            return false
        }
        this.rehber.add(yeniKisi)
        println("${yeniKisi.isim} eklendi")
        return true
    }

    fun kisiBul(aranacakKisi: Kisi): Int {
        return this.rehber.indexOf(aranacakKisi)
    }

    fun kisiBul(isim: String): Int {
        for (i in rehber.indices) {
            val oankiKisi = rehber[i]
            if (oankiKisi.isim.equals(isim)) {
                return i
            }
        }
        return -1
    }

    fun kisiSorgula(isim: String) : Kisi?{
        val position= kisiBul(isim)
        return if (position>=0) rehber[position] else null
    }

    fun kisiSil(silinecekKisi: Kisi) : Boolean{
        val position = kisiBul(silinecekKisi)
        if (position<0){
            println("Böyle bir kişi yok!")
            return false

        }
        else{
            println("${silinecekKisi.isim} silindi!")
            this.rehber.remove(silinecekKisi)
            return true
        }
     }

    fun kisiGuncelle(eskiKisi: Kisi, guncellenecekKisi: Kisi) : Boolean{
      val position = kisiBul(eskiKisi)
        if (position <0 )
        {
            println("Kişi bulunamadi")
            return false
         }

        else
        {
            rehber[position] = guncellenecekKisi
            println("Güncellendi")
            return true
        }

    }
}