package com.example.kotlindersleri.odev

//Fahrenheit

class Odev2 {
    fun donustur(derece: Double): Double {
        val fahrenheit = derece * 1.8 + 32
        return fahrenheit
    }
// Çevre Hesaplama

    fun cevre(kisaKenar: Int, uzunKenar: Int) {
        val cevreHesabi = 2 * kisaKenar + 2 * uzunKenar
        println("Dikdörtgen Çevresi : $cevreHesabi")

    }
// Faktöriyel

    fun faktöriyelHesaplama(sayi: Int): Int {
        var sonuc = 1

        for (i in 1..sayi) {
            sonuc = sonuc * i

        }

        return sonuc
    }
// Harf

    fun kelimeAdedi(kelime: String, harf: Char) {

        var sonuc = 0

        for (k in kelime) {

            if (k == harf) {
                sonuc = sonuc + 1

            }
        }
        println("Harf Adedi : $sonuc")

    }

    fun icAciToplama(kenarSayisi: Int): Int {
        val toplam = (kenarSayisi - 2) * 180
        return toplam

    }

//Maaş

    fun maasHesaplama(gunSayisi: Int): Int {
        val calismaSaati = gunSayisi * 8
        println("Çalışma Saati : $calismaSaati")

        var maas = 0

        if (calismaSaati > 160) {
            val mesaiFazlasi = calismaSaati - 160
            maas = 160 * 10 + mesaiFazlasi * 20

        } else {
            maas = calismaSaati * 10

        }

        return maas


    }

//İnternet

    fun internetUcretiHesaplama(GB: Int): Int{
        var ucret = 0

        if (GB > 50) {
            val kotaFazlasi = GB - 50
            ucret = 100 + kotaFazlasi * 4
        }else{
            ucret = 100
        }

        return ucret

    }

}
