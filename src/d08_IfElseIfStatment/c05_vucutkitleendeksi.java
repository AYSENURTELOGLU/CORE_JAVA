package d08_IfElseIfStatment;

import java.util.Scanner;

public class c05_vucutkitleendeksi {
    public static void main(String[] args) {

        //Kullanicinin kilo(kg) ve boyunu(cm) isteyip vucut
        // kitle endeksini hesaplayin (kilo*10000 / (boy *boy))
        // vucut kitle endeksi 30’dan buyukse
        //obez, 25-30 arasi ise kilolu, 20-25 arasi ise normal,
        // 20’den kucukse zayif yazdirin.

        Scanner scanner=new Scanner(System.in);
        System.out.println("lütfen boy ve kilonuzu grin");
        double boy = scanner.nextDouble();
        double kilo = scanner.nextDouble();

        double endeks=(kilo*10000/(boy*boy));
        System.out.println(endeks);

        if (endeks>=30) System.out.println("obez");
        else if (endeks>=25) { //30dan büyükse üstteki satır zaten yakalar
            System.out.println("kilolu");
        } else if (endeks>=20) {
            System.out.println("normal");
        } else System.out.println("zayıf");


    }
}
