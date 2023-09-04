package d06_concatenation_operatorler;

public class c04_OrOperatoru {
    public static void main(String[] args) {

        //or, veya, || operatörü iyimserdir. yani bir true varsa sonuc true olur.
       // tüm sonuçlar false ise sonuc ancaak false olur yoksa true.
       //or operatörü matemetikteki toplama işlemine benzer toplanan sayılarda
       //bir tane bile sıfır olmayan varsa sonuc sıfır olmaz.
       //2+0+0+0+0=2 true
        //0+0+0+0=0 false

        System.out.println(3>5 || 6>4); // false or true ==> true
        System.out.println(3<5 || 6>4); // true or treu ==> ttrue
        System.out.println(3<5 || 6<4); //true or false ==> true
        System.out.println(3>5 || 6<4); //false or false ==> false

        //sayı 3 e veya 5 e bölünmelidir.
         int sayi=24;
        System.out.println(sayi%3==0 || sayi%5==0); // true or false ==> true

        //sayi 0dan büyük veya 100den küçük olmalıdır.
        System.out.println(sayi>0 || sayi<100); //true || true sonuc true









    }
}
