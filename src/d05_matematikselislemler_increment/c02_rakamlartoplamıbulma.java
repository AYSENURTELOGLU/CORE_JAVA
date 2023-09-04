package d05_matematikselislemler_increment;

import java.util.Scanner;

public class c02_rakamlartoplamıbulma {
    public static void main(String[] args) {
        // kullanıcadan 3 basamaklı bir sayı alıp sayının rakamları toplamını yazdırın.

        Scanner scanner= new Scanner(System.in);
        System.out.println("lütfen 3 basamaklı pozitif bir tamsayı giriniz:");  //125
        int girilenSayi= scanner.nextInt();

        int birlerBasamagi= 0;
        int rakamlarToplami=0;

        //ilk sayı için birler basamagını bulalım.

        birlerBasamagi= girilenSayi%10;    //5
        rakamlarToplami= rakamlarToplami+birlerBasamagi; //5

        //ilk sayının birler basamağından kurtulalım.
        girilenSayi= girilenSayi/10; //12,5 u ondalığı almdaıgı için int olarak alacak 12

        //busatıra geldiğimizde girilen sayıyı 2 basamaklı oldu 12
        birlerBasamagi=girilenSayi%10; //2
        rakamlarToplami=rakamlarToplami+birlerBasamagi; //7

        girilenSayi=girilenSayi/10; //12/10=1,2 ==> 1

       //burada arrık sayı tek basamaklı istersek direk toplayabiliriz.

        birlerBasamagi=girilenSayi%10;
        rakamlarToplami=rakamlarToplami+birlerBasamagi;
        girilenSayi=girilenSayi/10;

        System.out.println(rakamlarToplami);

























    }



}
