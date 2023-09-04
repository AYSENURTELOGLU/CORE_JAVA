package day27_parametreliConstructor_constructorCall;

public class C06_ArabaRunner {

    public static void main(String[] args) {

        C05_Araba araba1= new C05_Araba("opel", "2010", 4000);
        System.out.println(araba1);
        //Araba Bilgileri ==>marka='opel', model='2010', yil=4000, fiyat=0, renk='Renk belirtilmemis'

        C05_Araba araba2 = new C05_Araba("nissan", "micra", 2005);
        System.out.println(araba2);
        //Araba Bilgileri ==>marka='nissan', model='micra', yil=2005, fiyat=0, renk='Renk belirtilmemis'








    }
}
