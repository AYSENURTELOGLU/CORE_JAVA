package d07_ifstatement;

import java.util.Scanner;

public class c09_Ifelsestatment {
    public static void main(String[] args) {

        //Kullanicidan bir karakter girmesini isteyin, girilen karakterin
        // buyuk harf olup olmadigini yazdirin.

        Scanner scanner=new Scanner(System.in);
        System.out.println("lütfen karakter giriniz");
        char yas= scanner.next().charAt(0);

        if(yas>='A' && yas<='Z'){
            System.out.println("girilen karakter büyük harf");
        } else {
            System.out.println("girilen karakter büyük harf değil");
        }


    }
}
