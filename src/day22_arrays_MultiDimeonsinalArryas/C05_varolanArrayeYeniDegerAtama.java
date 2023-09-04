package day22_arrays_MultiDimeonsinalArryas;

import java.util.Arrays;

public class C05_varolanArrayeYeniDegerAtama {
    public static void main(String[] args) {

        /*
        varolan bir arraye length olarak belirlenenden daha fazla element atanamaz

         */

        int[] arr={3,4,5,6,8,1};
        System.out.println(arr.length);//6

        //7.eleemnt atamak istersek;
        // arr[6]=13; // error! .ArrayIndexOutOfBoundsException

        arr = new int[8];
        System.out.println(Arrays.toString(arr)); //[0, 0, 0, 0, 0, 0, 0, 0]
        //varolan arrayin uzunlgunu 8e çıkaramıyoruz. o nedenle eski elementler gitti.

        String[] harfler={"a","n","y"};
        String[] yeniHarfler={"k","l","m","n"};

        harfler=yeniHarfler;

        System.out.println(Arrays.toString(harfler)); //[k, l, m, n]
        System.out.println(Arrays.toString(yeniHarfler));

        //eğer varolan bir arraye yeni değer ataması için liste yazmak istersek aşağıdaki gibi yapabiliriz.
        harfler= new String[]{"x"};
        System.out.println(Arrays.toString(harfler)); //x


    }
}
