package d08_IfElseIfStatment;

import java.util.Scanner;

public class C07_Nestedifelsestatment {
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

        //birden fazla değişken varsa içlerinden brini değişken olarak alıp sadece
        //ona öre bir if else if else kuralım

        if(c=='E'){
            if (yas < 0 || yas>100){
                System.out.println("geçersiz yaş girildi");
            } else if (yas>=65 ) {
                System.out.println("erkek emekli olabilir");
            } else{
                System.out.println("emekli olmak için daha" +(65-yas)+ "daha çalışman lazım");
            }

        } else if (c=='K') {
            if (yas < 10 || yas>100){
                System.out.println("geçersiz yaş girildi");
            } else if (yas>=60 ) {
                System.out.println("kadın emekli olabilir");
            } else{
                System.out.println("emekli olmak için daha" + (60-yas) + "daha çalışman lazım");
            }

        }else{
            System.out.println("cinsiyet hatalı girildi");
        }


    }
}
