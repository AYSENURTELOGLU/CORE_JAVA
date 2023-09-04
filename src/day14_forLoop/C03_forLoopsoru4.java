package day14_forLoop;

import java.util.Scanner;

public class C03_forLoopsoru4 {
    public static void main(String[] args) {

        /*
        Soru 4- Kullanicidan baslangic ve bitis degeri
        olarak pozitif sayilar alin, sinirlar
        dahil olarak aralarindaki tum sayilarin toplamini
        yazdirin. Bitis degeri baslangic degerinden kucuk olsa da program calissin
         */


        Scanner scanner=new Scanner(System.in);
        System.out.println("lütfen başlangıç değeri için pozitif bir tam sayı giriniz:");
        int baslagic=scanner.nextInt();

        System.out.println("lütfen bitiş değeri için pozitif bir tam sayı girin:");
        int bitis=scanner.nextInt();

        int toplam=0;
        if (baslagic<bitis){
            for (int i = baslagic; i <=bitis ; i++) {
                toplam +=i;
            }
        }else {
            for (int i = bitis; i <=baslagic ; i++) {
                toplam +=i;
            }

        }
        System.out.println("sınırlar arasındaki değerlerin toplamı:" + toplam);







    }
}
