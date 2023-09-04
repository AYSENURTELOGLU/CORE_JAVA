package d07_ifstatement;

import java.util.Scanner;

public class c08_ifbagimsizcumleleri {
    public static void main(String[] args) {

        /*
        kullanıcdan 3 kenar uzunlugu sayı alın:
        sayı3 şle bölünürse "eşkenaar yazdır. değilse değil yazdın
         */


        Scanner scanner= new Scanner(System.in);
        System.out.println("lütfen üçgenin kenar uzunluklarını giriniz");
        double s1= scanner.nextDouble();
        double s2= scanner.nextDouble();
        double s3= scanner.nextDouble();

        if(s1==s2 && s1==s3 && s1>0) {
            System.out.println("eşkenar üçgen");
        } else {
            System.out.println("eşkenar değil");
        }



    }
}
