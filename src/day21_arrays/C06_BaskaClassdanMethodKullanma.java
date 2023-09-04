package day21_arrays;

import java.util.Arrays;

public class C06_BaskaClassdanMethodKullanma {
    public static void main(String[] args) {

        int[] arr= {2,4,5,3};
        System.out.println("eski array:" + Arrays.toString(arr));

        arr= C02_ArrayinElementleriniIstenenKadarArttirma.elementleriArtir(arr, 4);
        System.out.println("yeni array:" + Arrays.toString(arr));

        System.out.println(C03_PozitifElementleriTopla.pozitifElementleriTopla(arr));

        C04_ElementSay.elemanSay(arr, 4 ); //method void oldugu için sout yapmaya gerek yok

        // kullanicidan deger alarak int[] olusturmak istiyo

        int[] kullaniciArrayi= C05_ArrayOlustur.arrayOlustur();
        System.out.println(Arrays.toString(kullaniciArrayi));



    }
}
