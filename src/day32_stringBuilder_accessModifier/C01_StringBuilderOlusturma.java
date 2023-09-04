package day32_stringBuilder_accessModifier;

public class C01_StringBuilderOlusturma {
    public static void main(String[] args) {

        StringBuilder sb1=new StringBuilder();
        //boş bir satır oluşturur

        System.out.println(sb1); //hiçlik yazdırıd
        System.out.println(sb1.length()); //0
        System.out.println(sb1.capacity()); //16 karakterlik , standart java kendi belirleyip sana bu kadar yer ayarlıyor.


        StringBuilder sb2=new StringBuilder("java candir.");
        System.out.println(sb2); //java candir.
        System.out.println(sb2.length()); //12
        System.out.println(sb2.capacity()); //16+12 karakterlik

        StringBuilder sb3=new StringBuilder(9);
        System.out.println(sb3); //hiçlik yazdırıd
        System.out.println(sb3.length()); //0
        System.out.println(sb3.capacity());//9


        sb3.append("java candir.");
        System.out.println(sb3); //java candir.
        System.out.println(sb3.length()); //12
        System.out.println(sb3.capacity()); //2*9*2=20 karakterlik yer ayırır.
        //kapasitesyi aşarsa 2 katıın 2 fazlasına çıkarıyor

        sb3.trimToSize(); //
        System.out.println(sb3); //hiçlik yazdırıd
        System.out.println(sb3.length()); //12
        System.out.println(sb3.capacity());//12






    }
}
