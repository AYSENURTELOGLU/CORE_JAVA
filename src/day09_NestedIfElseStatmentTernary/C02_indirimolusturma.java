package day09_NestedIfElseStatmentTernary;

import java.util.Scanner;

public class C02_indirimolusturma {
    public static void main(String[] args) {

        /*
         Kullanicidan aldigi urun adedi ve ve liste fiyatini alin, kullaniciya musteri
         karti olup olmadigini sorun. Musteri karti varsa 10 urunden fazla alirsa
         %20, yoksa %15 indirim yapin, Musteri karti yoksa 10 urunden fazla
         alirsa %15, yoksa %10 indirim yapinS
         */

        Scanner scanner= new Scanner(System.in);
        System.out.println("lütfen ürün adedini giriniz:");
        int adet= scanner.nextInt();
        System.out.println("lütfen ürün fiyatını giriniz:");
        double fiyat= scanner.nextDouble();

        System.out.println("Müşteri kartınız var mı? \nVarsa ise E, değilse H giriniz");
        char c = scanner.next().toUpperCase().charAt(0);

        //anadeğişken kart var mı bilgisi olsun.

        if (c=='E'){
            if (adet>10){
                System.out.println("%20indirimli toplm fiyat:" + adet*fiyat*80/100);
            }else {
                System.out.println("%20indirimli toplm fiyat:" + adet*fiyat*85/100);
            }

        } else if (c=='H') {
            if (adet>10){
                System.out.println("%20indirimli toplm fiyat:" + adet*fiyat*85/100);
            }else {
                System.out.println("%20indirimli toplm fiyat:" + adet*fiyat*90/100);
            }

        }else{
            System.out.println("hatalı kart bilgisi");
        }


    }
}
