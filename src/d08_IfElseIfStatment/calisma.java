package d08_IfElseIfStatment;

import java.sql.SQLOutput;
import java.util.Scanner;

public class calisma {
    public static void main(String[] args) {
        /*
         Kullanicidan aldigi urun adedi ve ve liste fiyatini alin, kullaniciya musteri
         karti olup olmadigini sorun. Musteri karti varsa 10 urunden fazla alirsa
         %20, yoksa %15 indirim yapin, Musteri karti yoksa 10 urunden fazla
         alirsa %15, yoksa %10 indirim yapinS
         */

        Scanner scanner= new Scanner(System.in);
        System.out.println("lütfen ürün adedini ve fiyatını giriniz:");
        int adet= scanner.nextInt();
        double fiyat= scanner.nextDouble();

        System.out.println("Müşteri kartınız var mı? Varsa ise E, değilse H giriniz");
        char c = scanner.next().charAt(0);

        if (c == 'E'){
            if (adet>=10){
                fiyat=fiyat-(fiyat*0.2);
            } else {
                fiyat=fiyat-(fiyat*0.15);
            }
            System.out.println("fiyat:"+fiyat);
        } else if (c == 'H') {
            if (adet>=10){
                fiyat=fiyat-(fiyat*0.15);
            } else {
                fiyat=fiyat-(fiyat*0.1);
            }
            System.out.println("fiyat:"+fiyat);
        } else {
            System.out.println("indiriminiz bulunmamaktadır.");
            System.out.println("fiyat:"+fiyat);
        }


    }
}
