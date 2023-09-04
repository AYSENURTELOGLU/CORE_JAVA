package day22_arrays_MultiDimeonsinalArryas;

import java.util.Arrays;

public class C03_binarySearch {
    public static void main(String[] args) {

        int[] arr={0,13,4,7,10,2,1,23};

        System.out.println(Arrays.binarySearch(arr, 13)); //-8
        System.out.println(Arrays.binarySearch(arr, 7)); //3
        System.out.println(Arrays.binarySearch(arr, 10)); //-8
        System.out.println(Arrays.binarySearch(arr, 4)); //-2

        /*
        binary yapisi çok büyükdataları kolayca depolayabilmek için
        java nın kullandıgı bir yöntemdir.

         binary mantıgı aranan sayının kolayca bulunmasına dayanır.
         binary search'ün sağlıklı işlemsi için öncelikle arrayi küçükten büyüğe doğru sıralamasınız.

         sıralama yapmadan binary search kullanlırsa sonuc için hiç şey diyemeyiz.
         doğru da olabilir yanlış da olabilir.

         */

        //sortla sıralarsak bu karışıklıgı çözeriz.
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr)); //[0, 1, 2, 4, 7, 10, 13, 23]
        System.out.println(Arrays.binarySearch(arr, 13)); //6
        System.out.println(Arrays.binarySearch(arr, 7)); //4
        System.out.println(Arrays.binarySearch(arr, 10)); //5
        System.out.println(Arrays.binarySearch(arr, 4)); //3

        //olmayan bir elementi aratirsak;
        //olsalardı hangi sıradaolacaklarına göre yazdırıyor olmadıkları için de - ile yazdırdı.
        System.out.println(Arrays.binarySearch(arr, -5)); //-1
        System.out.println(Arrays.binarySearch(arr, 5)); //-5
        System.out.println(Arrays.binarySearch(arr, 25)); //-9
        System.out.println(Arrays.binarySearch(arr, 44)); //-9




    }
}
