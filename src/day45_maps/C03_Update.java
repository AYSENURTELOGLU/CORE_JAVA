package day45_maps;

import day44_maps.MethodDeposu;

import java.util.Map;

public class C03_Update {

    public static void main(String[] args) {

        Map<Integer,String> ogrenciMap= MethodDeposu.ogrenciMapOlustur();

        //ogrenci map inde TM yazan bölüm ismini EA olarak değiştirin.
        /*
            {
            101=Ali-Can-11-H-MF,
            102=Veli-Cem-10-K-TM,
            103=Ali-Cem-11-T-TM,
            104=Ayse-Can-10-H-MF,
            105=Sevgi-Han-11-M-TM,
            106=Sevgi-Can-10-K-MF}
         */

        ogrenciMap=MethodDeposu.ogrenciBolumDegistir(ogrenciMap,"TM","EA");

        System.out.println(ogrenciMap);

        ogrenciMap=MethodDeposu.ogrenciBolumDegistir(ogrenciMap,"MF","say");

        System.out.println(ogrenciMap);
    }

}
