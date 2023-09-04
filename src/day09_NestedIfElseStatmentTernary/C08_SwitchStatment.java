package day09_NestedIfElseStatmentTernary;

import java.util.Scanner;

public class C08_SwitchStatment {
    public static void main(String[] args) {

        //Soru 3- Kullanicidan ay numarasini alip ayismini yazdirin.

        Scanner scanner= new Scanner(System.in);
        System.out.println("Kaçıncı ayda olduğunuzu yazınız:");
        int ay= scanner.nextInt();

        //süslü parantez kullanmazsak tek satırı if body si olarak kabul eder.

        if (ay==1) System.out.println("Ocak");

        else if (ay==2) System.out.println("şubat");
        else if (ay==3) System.out.println("mart");
        else if (ay==4) System.out.println("nisaa");
        else if (ay==5) System.out.println("mayıs");
        else if (ay==6) System.out.println("hazira");
        else if (ay==7) System.out.println("temmuz");
        else if (ay==8) System.out.println("ağustos");
        else if (ay==9) System.out.println("eylül");
        else if (ay==10) System.out.println("ekim");
        else if (ay==11) System.out.println("kasım");
        else if (ay==12) System.out.println("aralık");
        else System.out.println("ay numarası yanlış");

        System.out.println("-------------");

        switch (ay){
            case 1:
                System.out.println("ocak");
                break;
            case 2:
                System.out.println("şubat");
                break;
            case 3:
                System.out.println("mart");
                break;
            case 4:
                System.out.println("nisan");
                break;
            case 5:
                System.out.println("mayıs");
                break;
            case 6:
                System.out.println("hazt");
                break;
            case 7:
                System.out.println("temm");
                break;
            case 8:
                System.out.println("agsts");
                break;
            case 9:
                System.out.println("eylül");
                break;
            case 10:
                System.out.println("ekim");
                break;
            case 11:
                System.out.println("kasım");
                break;
            case 12:
                System.out.println("ararlık");
                break;
            default:
                System.out.println("geçersiz");

        }

        }


    }

