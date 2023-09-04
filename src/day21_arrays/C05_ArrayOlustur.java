package day21_arrays;

import java.util.Arrays;
import java.util.Scanner;

public class C05_ArrayOlustur {
    /*
    Soru 5- Kullanicidan array’in boyutunu ve elementlerini alip array’i
    olusturan ve bize donduren bir method olusturun.
     */

    public static void main(String[] args) {

        System.out.println(Arrays.toString(arrayOlustur()));


    }

    public static int[] arrayOlustur(){

        Scanner scanner=new Scanner(System.in);

        System.out.println("lütfen arrayin uzunluğunu giriniz:");

        int uzunluk= scanner.nextInt();
        int[] arr=new int[uzunluk];

        for (int i = 0; i < arr.length; i++) {
            scanner=new Scanner(System.in); // forloop ile her seferinde değer alabilmesi için var
                                            //olan scanner objesine yeniden değer atayalım
            System.out.println("array için element giriniz: ");
            arr[i]=scanner.nextInt();

        }

        return arr;


    }



}



