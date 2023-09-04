package day13_stringManipulations_forloop;

import java.util.Scanner;

public class C03_replaceAll {
    public static void main(String[] args) {

        // Kullanicidan bir metin isteyin
        // metin'deki tum sayilari ve space disindaki ozel karakterleri temizleyin
        // metnin sonuna da . koyun.
        // ornek    input : J1*2av4.a C67//an=+dir--_
        //          output "Java Candir."

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen istediginiz mesaji girin");
        String metin = scanner.nextLine();

        //önce sayılardan kurtulalım
        metin=metin.replaceAll("\\d","");

        // ozel karakterlerden kurtulmak istedigimizde, space de kaybolur
        // bunun icin once space'i korumaya almaliyiz
        // artik metnimizde sayi yok, onun icin space yerine herhangi bir sayiyi atayalim
        metin=metin.replaceAll("\\s","1");

        metin=metin.replaceAll("\\W","");

        metin=metin.replaceAll("1", "");

        metin= metin.replace("_","");

        metin = metin + ".";

        System.out.println(metin);







    }
}
