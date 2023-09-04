package d07_ifstatement;

import java.util.Scanner;

public class c05_bagimsizifcumleleri {
    public static void main(String[] args) {

        /*
        SORU3- kullanıcıdan bir ücgenin 3 kenar uzunlugunu alın, uc kenar
        eş işe "eşknar üçgen yazır".
         */

        Scanner scanner= new Scanner(System.in);
        System.out.println("lütfen üçgenin kenar uzunluklarını giriniz");
        double s1= scanner.nextDouble();
        double s2= scanner.nextDouble();
        double s3= scanner.nextDouble();

       // if(s1==s2==s3){ //javada 3lü karşılaştırma olmaz. ikili karşılaşma and veya or ile bağlanabilir.
         //   System.out.println("eşkenar üçgendir.");

        if (s1==s2 && s1==s3 && s1>0){
            System.out.println("eşkenar üçgen");

        }



    }
}
