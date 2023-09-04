package day09_NestedIfElseStatmentTernary;

import java.util.Scanner;

public class C01_Emeklilik2incicozu {
    public static void main(String[] args) {

        //Kullanicidan cinsiyetini ve yasini alin, Kadin,
        // 60 yas ve uzeri , Erkek 65 yas ve uzeri emekli olabilir.
        // Cinsiyet ve yasini dikkate alarak “Emekli olabilirsin” veya
        // “Emekli olmak icin .. Yil daha calisman gerekir” yazdirin.

        Scanner scanner=new Scanner(System.in);
        System.out.println("lütfen cinsiyetinizİ girin E: erkek K:kadın");
        char c = scanner.next().charAt(0); //ilk karakter almak için parantez içi 0

        System.out.println("lütfen yaşınızı griniz:");
        double yas = scanner.nextDouble();

        if (yas<10 || yas>80){
            System.out.println("geçersiz yas");
        }else if (yas<60) {//kimse emekli olamaz
            if (c=='K'){
                System.out.println("Kadın emekli olabilmesi için daha" + (60-yas) + "yıl daha çalışmalı");
            } else if (c=='E') {
                System.out.println("erkek emekli olabilmesi için daha" + (65-yas) + "yıl daha çalışmalı");
            }else {
                System.out.println("cinsiyet hatalı");
            }

        } else if (yas<65) {//sadecd kadınlar emekli olailir
            if (c=='K'){
                System.out.println("kadın emekli olabilir");
            } else if (c=='E') {
                System.out.println("erkek emekli olabilmesi için daha" + (65-yas) + "yıl daha çalışmalı");
            }else {
                System.out.println("cinsiyet hatalı");
            }
        }else {
            if (c=='K' || c=='E'){
                System.out.println("emekli olabilir");
            }

        }


    }
}
