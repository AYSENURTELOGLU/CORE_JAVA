package d08_IfElseIfStatment;

import java.util.Scanner;

public class c04_IfElseIfStatement {
    public static void main(String[] args) {

        //kullanıcıdan bir sayı isteyin sayı isteyin
        // satı 3e bölünüoyrsa 3ün katı
        //sayı 5 e bölünüyorsa 5 in katı
        //ikisi birden bölünürse süper sayı


        Scanner scanner=new Scanner(System.in);
        System.out.println("lütfen pozitif bir tamsayi grin");
        int s1= scanner.nextInt();

        if (s1%3==0 && s1%5==0) System.out.println("süper sayı");
        else if(s1%3==0) System.out.println("3ün katı");
        else if(s1%5==0) System.out.println("5in katı");




    }
}
