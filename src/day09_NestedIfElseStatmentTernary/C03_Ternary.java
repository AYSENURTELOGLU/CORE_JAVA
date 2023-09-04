package day09_NestedIfElseStatmentTernary;

import java.util.Scanner;

public class C03_Ternary {
    public static void main(String[] args) {
        //kullanıcıdan pozitif bir sayı alın tek mi çift mşi yazdırın

        Scanner scanner= new Scanner(System.in);
        System.out.println("lütfen pozitif bir tamsayı giriniz:");
        int sayi= scanner.nextInt();

        if (sayi%2 ==0){
            System.out.println("çift sayi");
        }else{
            System.out.println("tek sayı");
        }

        /*
        if else ile yapabilceğimiz basit işlemleri daha ksa yazabilmek için ternary kullanılır

         */

        System.out.println(sayi%2==0 ? "çift sayi" : "tek sayı");







    }
}
