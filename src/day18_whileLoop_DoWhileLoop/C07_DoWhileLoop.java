package day18_whileLoop_DoWhileLoop;

public class C07_DoWhileLoop {
    public static void main(String[] args) {

        /*

            3 cesit loop gorduk
            hepsinin avantajlari ve dezavantajlari var
            1- for loop baslangic ve sonucu belirli sayi olan durumlarda
               veya kac kere tekrar edecegimizi bildigimiz durumlarda avantajli
            2- while loop; kac kere tekrar edecegini bilmedigimiz
               islemleri yapmak icin avantajli
            3- do-while loop kullanicidan deger alarak yaptigimiz islemlerde
               ilk deger atamasini kod yazan kisinin degil de
               kullanicinin yapmasi acisindan avantajli
         */


        int bas=10;
        int bit=20;
        int toplam=0;

        //while loop ile baslangıc ve bitis değeri arasındaki sayıları
        //toplayıp yazdırın.

        while (bas<=bit){
            toplam+=bas;
            bas++;

        }
        System.out.println("while loop ile sayıların toplamı: " + toplam);

        //ŞİMİD DE DOWHİLELOOP İLE YAPALIM

        bas=30;
        bit=20;
        toplam=0;

        do {
            toplam+=bas;
            bas++;

        }while (bas<=bit);
        System.out.println("do while loop ile sayıların toplamı: " + toplam);






    }
}
