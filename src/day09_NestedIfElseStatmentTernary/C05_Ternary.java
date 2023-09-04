package day09_NestedIfElseStatmentTernary;

import java.util.Scanner;

public class C05_Ternary {
    public static void main(String[] args) {
        /*
        Soru 2- Kullanicidan bir ucgenin 3 kenar uzunlugunu alin,
        ucgen eskenar ise “Eskenar ucgen” yazdirin, degilse
         “Eskenar degil” yazdirin.
         */



        Scanner scanner=new Scanner(System.in);
        System.out.println("üçgenin 3 kenar uzunlugunu grin");
        double s1= scanner.nextDouble();
        double s2= scanner.nextDouble();
        double s3= scanner.nextDouble();

        System.out.println(s1==s2 && s2==s3 ?
                "eşkenar üçgen"
                :
                "eşkenar değil");

    }
}
