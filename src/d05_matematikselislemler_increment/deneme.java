package d05_matematikselislemler_increment;

import java.util.Scanner;

public class deneme {
    public static void main(String[] args) {

        // kullanıcadan 3 basamaklı bir sayı alıp sayının rakamları toplamını yazdırın.

        Scanner scanner= new Scanner(System.in);
        int girilensayi= scanner.nextInt();

        int a= girilensayi%10;
        int b= girilensayi;
    }
}
