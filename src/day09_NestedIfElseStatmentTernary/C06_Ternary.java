package day09_NestedIfElseStatmentTernary;

import java.util.Scanner;

public class C06_Ternary {
    public static void main(String[] args) {

        //Soru 5- Kullanicidan iki sayi alin ve buyuk olmayan sayiyi yazdirin

        Scanner scanner=new Scanner(System.in);
        System.out.println("iki tamsayı giriniz");
        double s1= scanner.nextDouble();
        double s2= scanner.nextDouble();

        System.out.println(s1>s2 ? s2 : s1);





    }
}
