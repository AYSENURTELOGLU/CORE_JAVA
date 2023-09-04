package day17_methodOlusturma_methodOverloading;

public class C06_WhileLoop {
    public static void main(String[] args) {

        /*
        1den 100e kadar olan sayıları sınırla daihl
        for loop ile hesapla
         */

        int toplam=0;

        for (int i = 1; i <=100 ; i++) {
            toplam+=i;
        }
        System.out.println("for loop ile toplam: " + toplam);

        toplam=0;

        int i=1;
        while (i<=100){
            toplam+=i;
            i ++;
        }
        System.out.println("while: " + toplam);





    }
}
