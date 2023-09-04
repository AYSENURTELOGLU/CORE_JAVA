package d07_ifstatement;

import java.util.Scanner;

public class c03_bagimsizifcumleleri {
    public static void main(String[] args) {

        //SORU1-kullanıcıdan bir tam pozitif ssayı iste. sayıyı kontrol edip 5
       // 5 ile bölünürme bak yazdır.

        Scanner scanner= new Scanner(System.in);
        System.out.println("lütfen bir pozitif tam sayı grin:");
        int girilensayi= scanner.nextInt();

        if (girilensayi%5==0) System.out.println("sayi 5in tam katıdır.");





    }
}
