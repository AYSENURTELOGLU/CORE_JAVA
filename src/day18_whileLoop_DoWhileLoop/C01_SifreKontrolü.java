package day18_whileLoop_DoWhileLoop;

import java.util.Scanner;

public class C01_SifreKontrolü {
    public static void main(String[] args) {

        //Soru 4 : main method da Kullanicidan bir sifre isteyip,
        //          oluşturacağımız bir methodda
        //          asagidaki sartlari kontrol edin ve methoddan true veya false döndürün.
        //         ve kullaniciya duzeltmesi gereken tum eksikleri soyleyin,
        //         tum sartlari saglanıncaya kadar tekrar değer isteyin
        //         ve şartlar sağlanınca "sifre basariyla kaydedildi" yazdirin
        //         - ilk harf kucuk harf olmali
        //         - son karakter rakam olmali
        //         - sifre bosluk icermemeli
        //         - uzunlugu en az 10 karakter olmali

        //BU SROUYU DAY17DE ÇÖZDÜK AMA JAVA DA DAHA PROFESYONEL KODLAMA İÇİN
        //2 DUZELTME YAPACAĞIZ.

        //1- WHİLE LOOP UN ÖNÜNDEKİ PARANTEZİN İÇİ TRUE
        //OLDUGU MÜDDETÇE LOOP ÇALIŞIR

        //BU SORUDA SONUC VARİAVLE DA BOOLEAN DEĞER İÇERİYOR
        //AMA SORUNUN MANTIGI AÇISINDAN SONUC FALSE OLDUGU MÜDDETÇE LOOP ÇALIŞMALI

        //2-WHİLE LOOP HER ÇALITIGINDA
        //Scanner scanner = new Scanner(System.in); ÇALIŞIYOR VE YENİ BİR
        //SCANNER OBJESİ OLUŞTURUYOR. BUNUN YERİNE DAHA GÜZEL OLANI LOOPTAN ÖNCE OBJEYİ
        //OLUŞTURUP LOOPUN İÇERİSİNDE SADECE DEĞER ATAMASI YAPMAKTIR.



        boolean sonuc=false;
        Scanner scanner;
        String sifre;


        while (!sonuc){   //eskisi ===> sonuc==false
            scanner = new Scanner(System.in);
            System.out.println("Lutfen sifrenizi giriniz");
            sifre = scanner.nextLine();
            sonuc=sifreKontolEt(sifre);

        }

        System.out.println("şifre başarlı"); //true veya false

    }

    public static boolean sifreKontolEt(String sifre){

        int sayac=0; //sayac hatayı saysın.çünkühata durumunda mesaj vereceğiz

        //         - ilk harf kucuk harf olmali
        char ilkHarf=sifre.charAt(0);
        if (!(ilkHarf>='a' && ilkHarf<='z')){
            System.out.println("ilk karakter küçük harf olmalı!");
            sayac ++;
        }

        //         - son karakter rakam olmali
        char sonKarakter=sifre.charAt(sifre.length()-1);
        if (!(sonKarakter>='0' && sonKarakter<='9')){
            System.out.println("son karakter rakam olmalı!");
            sayac ++;
        }

        //         - sifre bosluk icermemeli
        if ((sifre.contains(" "))){
            System.out.println("şifre boşlık içermemeki!");
            sayac++;
        }

        //         - uzunlugu en az 10 karakter olmali
        if (!(sifre.length()<10)){
            System.out.println("uzunlugu en az 10 karakter olmali!");
            sayac++;
        }
        if (sayac==0){
            return true;
        }else {
            return false;
        }





    }

}
