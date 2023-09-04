package day22_arrays_MultiDimeonsinalArryas;

import java.util.Arrays;
import java.util.Scanner;

public class C07_KullanicidanSayiAlipArrayeEkle {
    public static void main(String[] args) {

        int[] arr={3,5,8};

        //kullanıcıdan bir sayı alıp arr ye 4. element olarak ekleyin

        Scanner scanner=new Scanner(System.in);
        System.out.println("lütfen arrye eklemek istediğiniz sayıyı giriniz");
        int eklenecekSayi= scanner.nextInt();

        arr=C06_ArrayeBirElemanEkleme.arrayeBirElemanEkle(arr, eklenecekSayi);
        System.out.println(Arrays.toString(arr));

        //5.elemnt olarak 11 i ekleyin

        arr=C06_ArrayeBirElemanEkleme.arrayeBirElemanEkle(arr,11);
        System.out.println(Arrays.toString(arr));


    }
}
