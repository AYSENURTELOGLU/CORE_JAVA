package d07_ifstatement;

import java.util.Scanner;

public class c07_ifbagimsizcumleler {
    public static void main(String[] args) {

        /*
        SORU- kullanıcıdan bir not alın. 50 ve
        üzeri ise sınıfı geçtin değilse kaldın yazdırın.
         */

        Scanner scanner=new Scanner(System.in);
        System.out.println("lütfen bir ayı giriniz");
        double s1= scanner.nextDouble();

        if(s1>=50) System.out.println("sınıfı geçtin");
        if(s1<50) System.out.println("sınıfta kaldın");

        /*
        eger bir şart için sadece 2 durum söz konusu ise
        2 durumu ayrı ayrı kontrol etmekyerine tek bir kontrolile de yapabiliriz
         */

        if(s1>=50){
            System.out.println("sınıfı geçtin");
        } else {
            System.out.println("sınıfta kaldın");
        }


    }
}
