package d08_IfElseIfStatment;

import java.util.Scanner;

public class c03_IfElseIfStatment {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("lütfen pozitif bir tamsayi grin");
        double not = scanner.nextDouble();

        /*
        bir if - else if- else .. statment else ile bitmek zorunde değildir.
        else ile biten kodlar her durum için mutlaka bir sonuc üretirler
        else ile bitmezse tüm durumları kapsamaz yani bazı değerler için sonuc üretmeyebişir.
         */

        if(not>=85){
            System.out.println("AA");
        } else if (not>=65){
            System.out.println("BB");
        } else if (not>50) {
            System.out.println("CC");
        }else System.out.println("DD");
    }
}
