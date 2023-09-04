package day24_arrayLists;

import java.util.ArrayList;
import java.util.List;

public class C02_List {

    public static void main(String[] args) {

        //bir list oluştutalım
        //elmas içerisine data türü yazılmalıdır. data türü pritimive olamaz
        //non primitive olmak zorundadır.

      //  List<String> isimler= new List(); list abstract oldugu için buşekilde yazılmaz

        List<String> isimler= new ArrayList<>();
        ArrayList<String> isimler2=new ArrayList<>(); //2.yöntem çok kullanılmaz.

        //her list oluşturuuldugunda boş olarak oluşturulur. sonra elementler tek tek eklenir.
        System.out.println(isimler); //[] verir.

        isimler.add("Burhan");
        isimler.add("Şeref");
        isimler.add("Gülşah");
        System.out.println(isimler); //hangi sırayla eklediysek liste o sıra ile oluşur.

        isimler.add(2, "nergiz");
        System.out.println(isimler); //[Burhan, Şeref, nergiz, Gülşah]

        isimler.add(1,"omer");
        System.out.println(isimler); //[Burhan, omer, Şeref, nergiz, Gülşah]

        isimler.addAll(2,isimler);
        System.out.println(isimler); //[Burhan, omer, Burhan, omer, Şeref, nergiz, Gülşah, Şeref, nergiz, Gülşah]

        System.out.println(isimler.add("eyüp")); //true , ekledi mi sorusu sorar. boolean döndürür.
        System.out.println(isimler); //[Burhan, omer, Burhan, omer, Şeref, nergiz, Gülşah, Şeref, nergiz, Gülşah, eyüp]




    }
}
