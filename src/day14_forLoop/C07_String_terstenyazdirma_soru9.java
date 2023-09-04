package day14_forLoop;

import java.util.Scanner;

public class C07_String_terstenyazdirma_soru9 {
    public static void main(String[] args) {

        /*
        Soru 9 (interview)- Kullanicidan bir String isteyin ve String’i tersten yazdirin.
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen bir cümle giriniz");
        String str = scanner.nextLine();

        //Java candır
        for (int i = str.length()-1; i >=0 ; i--) {
            System.out.print(str.charAt(i));

        }


        //SORU10- TERSE ÇEVRİLMİŞ HALİNİ KAYDEDELİM
        String tersmetin="";

        for (int i = str.length()-1; i >=0 ; i--) {
            tersmetin += str.charAt(i);

        }
        System.out.println(tersmetin);


    }
}
