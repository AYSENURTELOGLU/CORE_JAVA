package d07_ifstatement;

public class c01_bagimsizifcumleleri {

    public static void main(String[] args) {

        /*
        bağımsız if cümleleri isminden de anlaşılcagı üzere kodun kalanıyla ilgilenmz
        sadece boolen şartına odaklanır. sonuc true ise if body çalışır.
        boolean şartın sonucu false ise if body si devereye girmez.

        birden fazla bagımsız olan ıf cumkesi çalıştıgında kaç tane if sinin çalışacağı
        verilen değerlere bağlıdır.

         tüm if bodyleri çalışabilir, bazılarıçalışabilir, hiçbiri çalışmayabilir.
         */

        int a =201;
        int b=33;

        if (a > 0) { //false
            System.out.println("a sayısı pozitif");
        }

        if (a+b>100){ //
            System.out.println("sayıların toplamı 100'de büyük");
        }

        if (b%3==0){
            System.out.println("b 3 ile tam bölünen bir sayıdr");
        }

        if (b<100){
            System.out.println("b yüzden küçük bir tam sayıdır");
        }






    }
}
