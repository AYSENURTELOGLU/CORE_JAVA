package d04_datacasting_wrapper;

public class c02_explicit_norrowing {
    public static void main(String[] args) {

        double dbl1=123.6;

        int sayi= (int) dbl1;

        System.out.println("sayi:" + sayi);

        int sayi2= 130;
        byte by2= (byte)sayi2; //byte maks 127 alıyor. üç daha giderse -126 a geliyor.
        System.out.println("by2=" + by2);




    }
}
