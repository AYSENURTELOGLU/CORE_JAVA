package day21_arrays;

import java.util.Arrays;

public class C02_ArrayinElementleriniIstenenKadarArttirma {

    public static void main(String[] args) {

        int[] arr = {3,5,2,7};
        int artis = 3 ;
        // verilen array'in tum elementlerini
        // artis miktari kadar artirin

        for (int i = 0; i < arr.length; i++) { // i indexleri kontrol eder

            arr[i]+=artis;

        }
        int[] sayilar = {3,5,2,7};
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(elementleriArtir(sayilar, 5)));

    }

    public static int[] elementleriArtir(int[] arr, int artis){ //return yaptıgımız için void değil data türü yazıldı

        for (int i = 0; i < arr.length; i++) { // i indexleri kontrol eder

            arr[i] += artis;
        }
        return arr;

    }


}
