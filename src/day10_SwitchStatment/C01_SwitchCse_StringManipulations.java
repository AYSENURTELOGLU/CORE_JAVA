package day10_SwitchStatment;

import java.util.Scanner;

public class C01_SwitchCse_StringManipulations {
    public static void main(String[] args) {

       /*
        Soru 4- Kullanicidan ISTQB kisaltmasindan harfin anlamini ogrenmek istedigini alin
        ve girilen harfin karsiligini yazdirin.
                I : International S : Software T : Testing Q : Qualifications B: Board

        */

        Scanner scan = new Scanner(System.in);
        System.out.println("lütfen anlamını görmek istediğiniz harfi girin:");
        char harf=scan.next().toUpperCase().charAt(0); //küçük farfte olsa büyüğe çeviriyor touppercase
        //char ı almak için char at kullandık

        switch (harf){
            case 'I':
                System.out.println("I:International");
                break;
            case 'S' :
                System.out.println("Software");
                break;
            case 'T' :
                System.out.println("Testing");
                break;
            case 'Q' :
                System.out.println("Qualifications");
                break;
            case 'B' :
                System.out.println("Board");
                break;
            default:
                System.out.println("Yazdiginiz harf ISTQB'de yok");



        }



    }
}
