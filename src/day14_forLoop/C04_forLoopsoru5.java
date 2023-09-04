package day14_forLoop;

import java.util.Scanner;

public class C04_forLoopsoru5 {
    public static void main(String[] args) {

        /*
        Soru 5- Kullanicidan 20’den kucuk bir sayi alip,
        bu sayinin faktoryel degerini hesaplayin.
        Or : 6! = 6 * 5 * 4 * 3 * 2 * 1 = 720
         */

        Scanner scanner=new Scanner(System.in);
        System.out.println("lütfen 20'deb küçük bir tam sayı giriniz:");
        int deger=scanner.nextInt();

        int carpim=1;

        for (int i = 1; i <=deger ; i++) {
            carpim *=i;

        }
        System.out.println("faktöriyel "+deger+"!:" + carpim);





    }
}
