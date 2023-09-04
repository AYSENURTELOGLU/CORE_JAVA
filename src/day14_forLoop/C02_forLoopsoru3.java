package day14_forLoop;

import java.util.Scanner;

public class C02_forLoopsoru3 {
    public static void main(String[] args) {
        /*Soru 3- Kullanicidan baslangic ve bitis degeri olarak pozitif sayilar alin,
        sinirlar dahil olarak aralarindaki tum sayilarin toplamini yazdirin.
        Bitis degeri baslangic degerinden kucukse, uyari yazdirip islemi sonlandirin
         */

        Scanner scanner=new Scanner(System.in);
        System.out.println("lütfen başlangıç değeri için pozitif bir tam sayı giriniz:");
        int baslagic=scanner.nextInt();

        System.out.println("lütfen bitiş değeri için pozitif bir tam sayı girin:");
        int bitis=scanner.nextInt();

        if (bitis<baslagic){
            System.out.println("başlangıç değeri bitişdeğerinden büyük olamaz");
        }else {

            int toplam=0;

            for (int i = baslagic; i <=bitis ; i++) {
                //toplam=toplam+i; bu yazım acemi işi oluyor
                toplam+=i;
            }
            System.out.println("sınırlar arasındaki değerlerin toplamı:" + toplam);






        }





    }
}
