package day14_forLoop;

import java.util.Scanner;

public class C08_asalSayi_soru11 {
    public static void main(String[] args) {

        /*
        Soru 11- Kullanicidan pozitif bir
        tamsayi isteyip, sayinin asal sayi olup olmadigini
        kontrol edin ve sonucu yazdirin.
         */

        Scanner scanner=new Scanner(System.in);
        System.out.println("lütfen asal sayı kontrolü için pozitif bir tam sayı giriniz:");
        int sayi=scanner.nextInt();


        boolean flag= true;
        for (int i = 2; i <sayi ; i++) {
            if (sayi%i==0){
                System.out.println("asaldeğil");
                flag = false;
                break;
            }

        }
        if (flag) {
            System.out.println("asal sayi");
        }



    }
}
