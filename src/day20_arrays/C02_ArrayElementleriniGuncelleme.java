package day20_arrays;

import java.util.Arrays;

public class C02_ArrayElementleriniGuncelleme {
    public static void main(String[] args) {

        int[] sayilar=new int[6];

        System.out.println(Arrays.toString(sayilar)); //[0, 0, 0, 0, 0, 0]

        //2.indexxteki elementi 5 yapalım

        sayilar[2]=5;
        System.out.println(Arrays.toString(sayilar)); //[0, 0, 5, 0, 0, 0]

        //2. indexteki sayiyi 7 yapalım
        sayilar[2]=7;

        //index kullanmadan bir elemente atama yapmam mümkün değildir

        //5.indexteki elementi 8 yapin.
        sayilar[5]=8;
        System.out.println(Arrays.toString(sayilar)); //[0, 0, 7, 0, 0, 8]

        //6.index'eyeni bir element ekleyelim
        sayilar[6]=20; //hata verir. çünkü 6.index yok. run dedikten sonra hata veriyor
        System.out.println(Arrays.toString(sayilar));
        //run dedikten sonra error verdiği için buna RUN TİME ERROR denir.

        /*
        uzunlugu verilen bir array de
        var olan elementler index ile update edilebilir
         ancak
         yeni element ekleyip uzunlugunu değiştirmek isterseniz
        run time error oluşur.


         */







    }
}
