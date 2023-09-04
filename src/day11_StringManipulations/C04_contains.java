package day11_StringManipulations;

public class C04_contains {
    public static void main(String[] args) {

        String str= "Java gün geçtikçe güzelleşiyor";

        //str Java içeriyor mu?
        System.out.println(str.contains("Java")); //true

        //str java içeriyor mu
        System.out.println(str.contains("java")); //false

        //str a içerir mi
        System.out.println(str.contains("a")); //true

        // *** contains metodu aranan metnin sayısı ile ilgilenmez
        //sadece var yok sonucu döndürür.





    }
}
