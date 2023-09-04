package day18_whileLoop_DoWhileLoop;

import java.util.Scanner;

public class C06_DoWhileLoop {
    public static void main(String[] args) {
        /*
        // kullanicidan pozitif bir tamsayi isteyin
        kullanıcı işlemi bitirmek için 0 a basmalıdır.
        kullanıcı 0 a bastıgında kaç pozitif sayı girdiğini
        ve toplamlarının kaç oldugunu yazın

         */

        /*ÖNCE WHİLELOOP İLE YAPALIM!

        Scanner scanner;
        int sayac = 0;
        int toplam = 0;
        int girilenSayi=1;

        while (girilenSayi != 0) {

            scanner = new Scanner(System.in);
            System.out.println("lütfen toplamak pozitif bir tam sayi giriniz: ");
            girilenSayi = scanner.nextInt();

            if (girilenSayi!=0){
                toplam+=girilenSayi;
                sayac++;
            }


        }
        System.out.println("girilen " + sayac + "adet sayının toplsmı " + toplam);

         */

        //DOWHİLE İLE YAPALIM!!

        Scanner scanner;
        int sayac = 0;
        int toplam = 0;
        int girilenSayi;

        do {
            scanner = new Scanner(System.in);
            System.out.println("lütfen toplamak pozitif bir tam sayi giriniz: ");
            girilenSayi = scanner.nextInt();

            if (girilenSayi != 0) {
                toplam += girilenSayi;
                sayac++;
            }

            }while (girilenSayi != 0);
                System.out.println("girilen " + sayac + "adet sayının toplsmı " + toplam);


    }
}
