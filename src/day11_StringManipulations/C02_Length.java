package day11_StringManipulations;

import java.util.Scanner;

public class C02_Length {
    public static void main(String[] args) {

        String isim= "Ramazan Uzunkavaklaraltindayataruyumazoglu";

        //son harfi yazdırın:
        System.out.println("isim uzunlugu:" + isim.length());

        System.out.println("sonharf:" + isim.charAt(isim.length()-1));

        //sondan 5.harfi yazdırın
        System.out.println(isim.charAt(isim.length()-5));

        //kullanıcıdanismini alın
        //ve ortadaki harfi yazdırın
        //ismin uzunlugu çift sayı ise orta kısımdaki 2 harfi yazdırın.

        /*benim denemem:
        System.out.println("lütfenisminizi girin:");
        String ad= scan.nextLine();

        if(ad.length()%2 == 0){
            System.out.println(isim.charAt((isim.length()/2-1)+(isim.length()/2+1)));
        }else System.out.println(isim.charAt(isim.length()/2));

*/
            //!!length de karakter saymaya 1 den başlar index sayarkenki gibi sıfırdan başlamaz


        Scanner scan=new Scanner(System.in);
        System.out.println("lütfenisminizi girin:");
        String ad1= scan.nextLine();

        int uzunluk= ad1.length();

        if (uzunluk%2==0){ //uzunluk çiftse
            System.out.println("uzunluk çift," +
                    ad1.charAt((uzunluk/2-1)) + " " +
                    ad1.charAt(uzunluk/2));

        }else {
            System.out.println("uzunluk tek," + ad1.charAt((uzunluk-1)/2));
        }


    }
}
