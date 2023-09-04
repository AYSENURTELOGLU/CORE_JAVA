package day14_forLoop;

import java.util.Scanner;

public class C05_forLoopsoru7_rakamlarToplami {
    public static void main(String[] args) {

        /*
        Soru 7- Kullanicidan pozitif bir tamsayi alip, rakamlar toplamini yazdirin.
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Rakamlarını toplamak üzere pozitif bir tam sayı giriniz:");
        int sayi = scanner.nextInt();

        int deger = sayi;
        int birlerBasamagi = 0;
        int rakamlarToplami = 0;

        //basamak sayısınca işlem yapmamız lazım. basamak sayısını bulmamız lazım
        int basamakSayisi = (sayi + "").length(); //sayıyı stringleştirmek için hiçlik ekledik.böylece lengthini buluyoruz.

        for (int i = 1; i <= basamakSayisi; i++) {
            birlerBasamagi = deger % 10;
            rakamlarToplami += birlerBasamagi;
            deger /= 10;
        }

        System.out.println("girilen" + sayi + "in rakamlar toplamı:" + rakamlarToplami);


    }
}
