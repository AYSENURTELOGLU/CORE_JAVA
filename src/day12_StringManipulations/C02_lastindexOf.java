package day12_StringManipulations;

public class C02_lastindexOf {
    public static void main(String[] args) {

        String str="Javayi öğreneceğiz, başka yolu yok";

        //a harfinin ilk kullanım indxsini yazdır
        System.out.println(str.indexOf("a"));

        //a harfinin son kullanımının indexsini yazdır
        System.out.println(str.lastIndexOf("a")); //24, inex saymaya hep en baştan 0 ile başlar

        //j harfinin ilk indexsi
        System.out.println(str.indexOf("J")); //0

        //J harfinin son kullanım indexsş
        System.out.println(str.lastIndexOf("J"));

        //metne bakmadan e harfinin iki kere veya daha fazla kullanılıp kullanılmadaıgını yadırın.

        int ilkIndex=str.indexOf("e");
        int sonIndex=str.lastIndexOf("e");

        if (ilkIndex==-1){
            System.out.println("e hiç kullanılmamış");
        } else if (ilkIndex==sonIndex) {
            System.out.println("sadece 1 e kullanıldı");
        }else {
            System.out.println("e harfi 2 kere veya daha fazlaa kullanılmış");
        }


     //String str="Javayi öğreneceğiz, başka yolu yok";
        System.out.println(str.lastIndexOf("o")); //32

        System.out.println(str.lastIndexOf("o", 31)); //27

        //k harfinin son kullnım indexsi
        System.out.println(str.lastIndexOf("k"));




}
}
