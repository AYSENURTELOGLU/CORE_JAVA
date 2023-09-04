package d07_ifstatement;

import java.util.Scanner;

public class c04_bagimsizifcumleleri {
    public static void main(String[] args) {

        /*
        SORU2- kullanıcıdan sayı alın sayı 3 ile bölünüyorsa
        "3ile bölünebilen sayı,5 ile bölünüyorsa "5 ile bölünen sayı yazdır.
         */

        Scanner scanner=new Scanner(System.in);
        System.out.println("lütfen bir tamsayı giriniz:");
        int s1=scanner.nextInt();

        if(s1%3 == 0) System.out.println("sayı 3 ile bölünür");
        if (s1%5 == 0) System.out.println("sayı 5 ile bölünür");




    }
}
