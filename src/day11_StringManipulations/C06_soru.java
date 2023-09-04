package day11_StringManipulations;

import java.util.Scanner;

public class C06_soru {
    public static void main(String[] args) {
        /*SORU : kullanicidan bir mail alin
        - mail @ icermiyorsa “gecersiz mail”
        - mail @gmail.com icermiyorsa, “mail gmail olmali”
        - mail @gmail.com ile bitmiyorsa, “mailde yazim hatasi var”
        yazdirin.

         */

        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen mail gir:");
        String mail= scan.nextLine();

        if (!mail.contains("@")){ //başına ünlem koymak tersine çevirir.
            System.out.println("geçersiz mail");

        }else if (!mail.contains("@gmail.com")){
            System.out.println("mail gmail olmalı");

        }else if (!mail.endsWith("@gmail.com")){
            System.out.println("mailde yazım hatası var");
        }







    }
}
