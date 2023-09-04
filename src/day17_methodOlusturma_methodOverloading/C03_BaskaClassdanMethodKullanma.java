package day17_methodOlusturma_methodOverloading;

import day16_methodOlusturma.C01_methodolusturma;
import day16_methodOlusturma.C03_MethodOlusturma;

public class C03_BaskaClassdanMethodKullanma {
    public static void main(String[] args) {

        C01_methodolusturma.altString("method budur", 7,8);

        System.out.println(C03_MethodOlusturma.isimDuzenle("AYSE", "KAUA"));

        System.out.println(C01_AsalSayiBulma.asalSayiMi(59)); //TRUE

        System.out.println(C02_TamBolenlerSayisiniBulma.tamBolenlerSayisi(60));


    }
}
