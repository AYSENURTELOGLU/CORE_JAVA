package day32_stringBuilder_accessModifier;

public class C03_StringBuilder_StringMethodlari {

    public static void main(String[] args) {

        String str="java candir";
        StringBuilder sb1=new StringBuilder();
      //  sb1=str;
        //non primitive data türlerinda farklı data türleri arasında atama
        //yapabilmek için bu iki non primitive data turu arasında Parent-Child ilişkisi olmalıdır.

        sb1=new StringBuilder(str);

        System.out.println(sb1); //java candir
        System.out.println(sb1.substring(0, 4)); //java
        System.out.println(sb1); //java candir muteable özellik gitti. string döndürdüğğü için


        //j harfi içeriyor mu
        System.out.println(sb1.toString().contains("j")); //true

        // StringBuilder'da olmayip, String'de olan method'lari kullanmak istersek
        // StringBuilder.toString() ile String'e gecis yapabiliriz
        // bu durumda calisan method'larin sb'i kalici olarak degistirmeyeceklerini UNUTMAMALIYIZ






    }
}
