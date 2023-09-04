package d08_IfElseIfStatment;

import java.util.Scanner;

public class c06_Emeklilik {
    public static void main(String[] args) {
        //Kullanicidan cinsiyetini ve yasini alin, Kadin,
        // 60 yas ve uzeri , Erkek 65 yas ve uzeri emekli olabilir.
        // Cinsiyet ve yasini dikkate alarak “Emekli olabilirsin” veya
        // “Emekli olmak icin .. Yil daha calisman gerekir” yazdirin.

        Scanner scanner=new Scanner(System.in);
        System.out.println("lütfen cinsiyetinizİ grin E: erkek K:kadın");
        char c = scanner.next().charAt(0); //ilk karakter almak için parantez içi 0

        System.out.println("lütfen yaşınızı griniz:");
        double yas = scanner.nextDouble();

        if (c=='E' && yas>=65) {
            System.out.println("erkek emekli olabilir");
        } else if (c=='E' && yas<65) {
            System.out.println("erkek emekli olamaz" + (65-yas)+ "yıl daha çalışmalısın");

        }else if(c=='K' && yas>=60){
            System.out.println("kadın emekli olabilir");
        } else if (c=='K' && yas<60) {
            System.out.println("KADIN emekli olamaz" + (60-yas)+ "yıl daha çalışmalısın");


        }


    }
}
