package day17_methodOlusturma_methodOverloading;

public class C05_MethodOverloading {

    public static void main(String[] args) {

        /*
        method overlodaing olan bir class da hangi method un
        çalışacağına karar vermek için aşağıdaki
        sırlamaya göre method incelenir:
        1-isim
        2-parametre sayısı
        3-argüment-parameetre uyumu
        4-minimum casting

         */

        toplama('s'); //tek int girilirse 2 katı yazdırır. 230
        toplama(3,4); //casting olmayan method u tercih eder 7
        toplama('a','b'); //iki int toplamı 195
        toplama(5,6,5.3);

    }

        String str="Java gün geçtikçe güzelleşiyor";

        public static void toplama(int sayi1, int sayi2){
            System.out.println("iki int toplamı:" + (sayi1+sayi2));
        }

        public static void toplama(double sayi1, double sayi2){
            System.out.println("double ile double ın toplamı: " + (sayi1+sayi2));
        }

        public static void toplama(double b, int a){
            System.out.println("double ve int toplamı:" + (b+a));
        }

        public static void toplama(int sayi){
            System.out.println("tek girilen int 2 katı yazılır:" + 2*sayi);
        }

        public static void toplama(int a, int b, int c){
            System.out.println("3 int in toplamı:" + (a+b+c));
        }

        public static void toplama(double a, double b, double c){
            System.out.println("3 double ın toplamı:" + (a+b+c));
        }






    }




