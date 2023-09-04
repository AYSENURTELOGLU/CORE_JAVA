package d06_concatenation_operatorler;

public class c03_AndOperator {
    public static void main(String[] args) {

        //logical operatörler:

        //and operatörü &&, iki tane & sonuçlardan biri false ise sonuc falsedur
        //and opertörü mükemmelliyetçidir.
        System.out.println(5>3&&6>4); //true and true
        System.out.println(5<3&&6>4); //false and true ==> false
        System.out.println(5>3 && 6<=4); //true and false ==> false
        System.out.println(5<=3 && 6<=4); //false and false  ==>false

        /* and operatörü ile bsğlanan boolean ifadeler kaç tane olursa olursa
        olsun sonuc true, bunun dışındaki tüm durumlarda sonuc false olur. bu yönüyle
        matematikteki çarpmaya benzer.
        1*1*1*1*1=1
        1*0*1*1*1=0 gibi
        1*0*0*0*0=0 gibi

         */

        //bir sayının hem 2 heem 3 hem 5 ile bölünebilmesi lazım.
        int sayi=24;
        System.out.println(sayi%2==0 && sayi%3==0 && sayi%5==0); //false
        //modulus sayının 2 ile bölümünden kalan sıfır olmalı demek

        //syı 0 veya daha büyük ve 100 veya daha küçük olamlıdır.
        //sayı 0 ile 100 arasında olmalı 0 ve 100 dahil.
        System.out.println(sayi>=0 && sayi<=100); //true





    }
}
