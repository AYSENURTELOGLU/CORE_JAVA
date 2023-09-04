package day24_arrayLists;

import java.util.ArrayList;
import java.util.List;

public class C05_get_set {

    public static void main(String[] args) {

        List<String> isimler=new ArrayList<>();

        isimler.add("cemil");
        isimler.add("ömer");
        isimler.add("mertkan");

        isimler.add(2,"burhan");
        System.out.println(isimler); //[cemil, ömer, burhan, mertkan]

        //set ile add arasındaki fark budur. add araya ekler.kalanları kaydırır.
        //set ise update eder/varolan elementin değerini değiştirir.

        isimler.set(2,"ayse");
        System.out.println(isimler); //[cemil, ömer, ayse, mertkan]

        System.out.println(isimler.get(1)); //ömer



    }
}
