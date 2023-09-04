package day32_stringBuilder_accessModifier;

public class C04_BaskaObjelerleKarsilastirma {
    public static void main(String[] args) {

        StringBuilder sb1= new StringBuilder("Java");
        StringBuilder sb2= new StringBuilder("Java");
        String str="Java";


        System.out.println(sb1==sb2); //false
        System.out.println(sb1.equals(sb2)); // false

        //string builder da equals metodu yerine compareTo kullanılır.
        System.out.println(sb1.compareTo(sb2)); //0

       // System.out.println(sb1==str);

        System.out.println(sb1.equals(str));//itiraz etmesz ama false döner;


        //equals sadece objenin kendisii ile karşılasştırıldıgında true döner
        System.out.println(sb1.equals(sb1)); //true







    }
}
