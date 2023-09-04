package day26_forEachLoop_constructor;

import java.util.Arrays;

public class C02_HarfKullanimAdedi {
    public static void main(String[] args) {

        /*
        Soru 4- Kullanicidan bir cumle ve bir harf alin, harf cumlede
        kullanilmissa kac kere kullanildigini yazdirin, kullanilmadiysa
        “harf cumlede kullanilmamis” yazdirin.
         */

        String cumle= "Java her gecen gün daha zevkli hale geliyor";
        String harf="a";

        String [] cumleArr=cumle.split(""); //harflerden ayırması için hiçlik kullandık
        System.out.println(Arrays.toString(cumleArr));

        int sayac=0;

        for (String each: cumleArr
             ) {

            if (each.equals(harf)){
                sayac++;
            }
        }

        if (sayac==0){
            System.out.println("aradaıgınız harf cümlede kullanılmamıştır");
        }else{
            System.out.println("aradıgınız harf " + sayac + " kere kullanılmıştır.");
        }



    }
}
