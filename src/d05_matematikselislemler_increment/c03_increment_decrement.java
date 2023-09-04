package d05_matematikselislemler_increment;

public class c03_increment_decrement {
    public static void main(String[] args) {

        int sayi=10;
         //sayı variablenın değerini 2 katının 5 fazlası yapın

        sayi=2*sayi+5;

        System.out.println(sayi);

        //2.yöntemle yaparsak

        sayi=10;
        sayi *=2;
        sayi +=5;
        System.out.println(sayi);

        sayi=10;
        sayi*=3; //30
        sayi-=3; //27
        sayi/=3; //9
        System.out.println(sayi); //9


        int a=10;
        //a'nın değerini yeni oluşturduğumuz b ye aayıp sonra a nın değerini bir artırın.

        int b= a;
        a+=1;
        System.out.println("a"+ a + "b"+b);


        a=10;
        // a nın değerni 1 artırın sonra a nın değerini b ye ata

        a++;
        b=a;
        System.out.println("a"+ a + "b"+b);










    }
}
