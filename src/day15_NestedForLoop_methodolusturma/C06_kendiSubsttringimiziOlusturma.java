package day15_NestedForLoop_methodolusturma;

public class C06_kendiSubsttringimiziOlusturma {
    public static void main(String[] args) {

        String str="Java candır";
        int baslagic=9;
        int bitis = 7 ;

        /*
        Verilen String ve baslangic,bitis degerlerini dikkate alarak
        1- bitis degeri baslangic degerinden kucukse hata mesaji yazdirin
        2- baslangic veya bitis degerleri index degerleri ile uyusmuyorsa hata mesaji
        3- degerler uygunsa baslangic index'inden(dahil), bitis index'ine(haric) kadar
           karakterleri yazdirin
         */

        if (baslagic>bitis) System.out.println("baslangıc değeri bitis değerinden büyük olamaz!");
        else if (baslagic<0 || bitis<0 || baslagic>=str.length() || bitis>=str.length()) {
            System.out.println("İndexler hatalı!");
        }else {
            for (int i = baslagic; i <bitis ; i++) {
                System.out.print(str.charAt(i));

            }
        }

        System.out.println(str.substring(baslagic,bitis));

        str.substring(5);
        /*
            Bu method bize "Candir" döndürür
            ancak
            yazdırmazsak veya bır variable'a atamazsak
            bu method'un dondurdugu sonuc bir ise yaramaz
         */

        String strIstenenBolum = str.substring(5); // kaydeder ama yazdirmaz
        System.out.println(str.substring(5)); // yazdirir ama kaydetmez


    }
}
