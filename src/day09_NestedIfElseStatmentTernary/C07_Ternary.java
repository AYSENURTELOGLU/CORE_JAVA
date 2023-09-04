package day09_NestedIfElseStatmentTernary;

import java.util.Scanner;

public class C07_Ternary {
    public static void main(String[] args) {

        //Soru 6- Kullanicidan bir sayi alin ve mutlak degerini yazdirin

        Scanner scanner=new Scanner(System.in);
        System.out.println("bir tamsayı giriniz");
        double s1= scanner.nextDouble();

        System.out.println(s1>0 ? s1 : -1*s1);


    }
}
