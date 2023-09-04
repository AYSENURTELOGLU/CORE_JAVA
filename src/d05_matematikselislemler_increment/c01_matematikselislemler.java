package d05_matematikselislemler_increment;

public class c01_matematikselislemler {
    public static void main(String[] args) {

        int a=27;
        int b=4;

        System.out.println(a/b);  // 27/4=6,75 a ve b int oldugu için sonucu int veerir. 6
        System.out.println(32/5); // 32/5 =6,4

        double c=27;
        System.out.println(c/b); // biri double olugu için java geniş variable göre düşünür.

        // a yı bye bölüp sonucu ondalıklı yazdırın.
        double sayi= a/b;  //27/4=6,75 a ve be int oldugu için sonucu int yapıp sayıya int olraka 6 atadı.
        System.out.println("sonuc" + sayi);

        double sayii2= (double)(a/b); // bu sefer de ilk parasntez içini yaptı yine int atandı double a
        System.out.println("souc2" + sayii2);

        double sayi3= (double) a/b;
        System.out.println("souc3" + sayi3); // 6,75 oldu a yı sadece double a cevirdik.



        System.out.println(2567/10); //256,7 ===> 256 verir
        System.out.println(256/10); //25.6 25 e döner
        System.out.println(25/10); // 2.5 2 ye çevirir.
        System.out.println(2/10); // 0 yazar.

        System.out.println(2567%10); // 7 verir
        System.out.println(256%10); // 6
        System.out.println(25%10); // 5.
        System.out.println(2%10); // 2 yazar.

        //2567 rakamlar toplamı:






    }
}
