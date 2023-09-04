package day27_parametreliConstructor_constructorCall;

public class C04_ArabaRunner {
    public static void main(String[] args) {

        C03_Araba araba1= new C03_Araba();
        System.out.println(araba1);
//Araba Bilgileri ==>marka='Marka belirtilmemis', model='Model belirtilmemis', yil=1900, fiyat=0, renk='Renk belirtilmemis'} initializition değerleri geldi.

        araba1.marka="mercedes";
        araba1.model="E200";
        araba1.yil=2010;
        araba1.fiyat=15000;
        araba1.renk="siyah";
        System.out.println(araba1);
        //Araba Bilgileri ==>marka='mercedes', model='E200', yil=2010, fiyat=15000, renk='siyah'}

        /*
        her yeni obje oluşturdugumuzda parametresiz default cons. çalıştıgından
        o class da instaance variable lara atanan değerleri alır.
        sonra bizim her variable için yeniden atama yapmamız gerekir.

        bunun yerine consturctor call a parametre olarak değerler yazalım
         */

        C03_Araba araba2 = new C03_Araba("BMW", "5.20", 2017, 33000, "MAVİ");
        System.out.println(araba2);
        //Araba Bilgileri ==>marka='BMW', model='5.20', yil=2017, fiyat=33000, renk='MAVİ'}

        C03_Araba araba3= new C03_Araba("volvo", "c40",2005,5000,"yeşil");
        System.out.println(araba3);
        //Araba Bilgileri ==>marka='volvo', model='c40', yil=2005, fiyat=5000, renk='yeşil'}





    }
}
