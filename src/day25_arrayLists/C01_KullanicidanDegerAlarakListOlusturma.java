package day25_arrayLists;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C01_KullanicidanDegerAlarakListOlusturma {
    public static void main(String[] args) {

        //Soru 2- Kullanicidan istedigi kadar isim alip,
        //Q’ya bastiginda girdigi isimleri bize liste olarak
        // dondurecek bir method olusturun


        System.out.println(ListOlustur());


    }

    public static List<String> ListOlustur(){

        Scanner scanner=new Scanner(System.in);
        String girilenisim;
        List<String> isimList=new ArrayList<>();

        do{

            scanner=new Scanner(System.in);
            System.out.println("listeye eklemek istediğinix isimleri girin:\nbitirmek için q ya bassın");
            girilenisim= scanner.nextLine();

            if (!girilenisim.equalsIgnoreCase("q")){
                isimList.add(girilenisim);

            }

        }while (!girilenisim.equalsIgnoreCase("q"));

        return isimList;
    }



}
