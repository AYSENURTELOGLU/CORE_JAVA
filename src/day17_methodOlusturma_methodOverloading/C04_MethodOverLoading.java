package day17_methodOlusturma_methodOverloading;

public class C04_MethodOverLoading {

    public static void main(String[] args) {


        toplama(4,6);
        toplama(5.3,6);
        toplama(5, 2.3);
        toplama(4.3, 5.6);
        toplama(3.4f, 5); // double ve int toplamı:8.400000095367432
        toplama(2.3f, 5f); //double ile double ın toplamı: 7.299999952316284


        /*
        biz bir method call yaptıgımızda java öncelikle method ismini
        kontrol eder. sonra argüment olarak verilen değerler ile
        parametre olarak yazılan variableların data türlerini karşılaştırır.
        ve uyumlu ise method u çalıştırır.
        argümentler ve parametreler uyumlu değil ise
        CTE uyarı verir.

        java da aynı data türüne ve parametre sayisina sahip
        birden fazla method oluşturamazsınız


        farklı data türlerinde parametreler var ise diziliş değiştirildiğinde
        java farklı bir method gibi kabul eder
         */
    }

    public static void toplama(int sayi1, int sayi2){
        System.out.println("iki int toplamı:" + (sayi1+sayi2));
    }

    public static void toplama(int a, double b){
        System.out.println("int ile double ın toplamı:" + (a+b));

    }

    public static void toplama(double b, int a){
        System.out.println("double ve int toplamı:" + (b+a));
    }

    public static void toplama(double sayi1, double sayi2){
        System.out.println("double ile double ın toplamı: " + (sayi1+sayi2));
    }

    /*
    method ismi + parametrelerin data türlerine method signature denir
    java aynı class da signature i aynı olan 2 method a izin vermez.

    bir class ta ismi aynı akat signature i farklı birden fazla method
    oluştrulurmasına METHOD OVERLOADİNG denir.
     */






}
