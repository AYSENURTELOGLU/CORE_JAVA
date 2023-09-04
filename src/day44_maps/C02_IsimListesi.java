package day44_maps;

import java.util.Map;

public class C02_IsimListesi {

    public static void main(String[] args) {
        //ogrenci map in de bulunan öğrencilerin isim ve soyisimlerini
        //sıra numaralı bir liste olarak yazdırın

        /*
        mapler kompleks bilgiler barındırabilir. barındırgı bilgi
        ne kadaar kompleks olursa o bilginin detaaylarına ulaşmakta
        o kadar aşama gerektirebilir.

        bu tür kompleks işlemleri her seferinde yeniden kodlamak yerine
        ilk istendiğinde method olarak olusturup sonra ihtiyac durumunda
        o methodu kullanmak daha mantıklı olur

        Bir map ile islem yapmak istedigimizde
            ilk bakacagimiz sey istenen bilginin key mi yoksa value'da mi bulundugudur

            Eger sadece value'de olan bir bilgiyi ariyorsak

            1- tum value'leri bir Collection olarak kaydedelim
            2- bir for-each loop ile herbir value'yu ele alalim
            3- value'lar belirli bir ayirac ile birlestirilen String'lerden olustugu icin
               bu ayirac kullanilarak split() ile bir array'e donusturulebilir
            4- artik bir array ve icerisinde value'yu olusturan bilgiler mevcut
               istenen bilgiyi, array'den index ile alabiliriz

         */

        Map<Integer, String> ogrenciMap=MethodDeposu.ogrenciMapOlustur();
        ogrenciMap.put(110, "Kaan-can-12-k-mf");

        System.out.println(ogrenciMap);

        MethodDeposu.isimSoyisimListesiYazdir(ogrenciMap);









    }
}
