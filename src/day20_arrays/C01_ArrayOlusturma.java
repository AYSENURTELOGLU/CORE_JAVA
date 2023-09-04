package day20_arrays;

import java.util.Arrays;

public class C01_ArrayOlusturma {

    public static void main(String[] args) {

        int[] sayilar={2,4,6,7,8};

        String[] harfler={"a","e","d"};



        String[] ogrenciList={"burhan", "ramazan","samet","senol"};
        System.out.println(ogrenciList[1]); //ramazan

        //5 kişilik bir sınıf listesi oluşturalım

        String[] sinifListesi={null,null,null,null};

        sinifListesi=new String[5];
        /*
        bir arrya oluşturulurken 2 sey multaka belirtilmelidir.
        1- içine konulacak dataların türü
        2-array'in uzunluğu (bir array'e oluşturulurken yazılan fazla element konulamaz.
         */

        //bir Array in tümünü nasıl yazdırırız?
        System.out.println(sayilar); //[I@58ceff1
        for (int i = 0; i < sayilar.length; i++) {
            System.out.print(sayilar[i] + " ");
        } //2 4 6 7 8

        //Array'in tamamını yazdırmak istersek en kısa yol hazır metod kullanmaktır.
        System.out.println(Arrays.toString(sayilar)); //[2, 4, 6, 7, 8] parantez dahil oldu
        //for loop ile sadece element yazdırdık. fakat bu metodla tüm arrayı verdi.

        System.out.println(Arrays.toString(harfler)); //[a, e, d]

        System.out.println(Arrays.toString(sinifListesi));

        int[] notlar=new int[4]; //[null, null, null, null, null] default degeri verier
        System.out.println(Arrays.toString(notlar)); //[0, 0, 0, 0] int'ın default değeri 0 dır.

        boolean[] blList=new boolean[8];
        System.out.println(Arrays.toString(blList)); //[false, false, false, false, false, false, false, false]





    }


}
