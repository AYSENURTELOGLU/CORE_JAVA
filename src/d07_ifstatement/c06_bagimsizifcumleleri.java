package d07_ifstatement;

import java.util.Scanner;

public class c06_bagimsizifcumleleri {
    public static void main(String[] args) {
        /*
        SORU kullanııdan tam sayı iste. sayı 3 veya 5 ile bölünürse
         "güzel sayı yazdır.

         */

        Scanner scanner=new Scanner(System.in);
        System.out.println("lütfen pozitif bir tamsayi grin");
        int s1= scanner.nextInt();

        if(s1%3==0 || s1%5==0 ){
            System.out.println("güzel sayı");
        }


    }
}
