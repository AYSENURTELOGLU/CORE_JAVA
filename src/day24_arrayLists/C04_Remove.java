package day24_arrayLists;

import java.util.ArrayList;
import java.util.List;

public class C04_Remove {

    public static void main(String[] args) {

        List<String> isimler= new ArrayList<>();

        isimler.add("kaan");
        isimler.add("bulent");
        isimler.add("tugba");
        isimler.add("burhan");
        isimler.add("kaan");

        System.out.println(isimler); //[kaan, bulent, tugba, burhan, kaan]

        System.out.println(isimler.remove("hasan")); //false
        System.out.println(isimler.remove("kaan")); //true

        System.out.println(isimler); //[bulent, tugba, burhan, kaan] ilk buldugunu kaldırdı.

        System.out.println(isimler.remove(1));

        List<Integer> tumsayilar=new ArrayList<>();
        tumsayilar.add(1);
        tumsayilar.add(3);
        tumsayilar.add(5);
        tumsayilar.add(7);

        //ben illa da 1 i silmek istersem
        Integer silinecekElement=1;
        tumsayilar.remove(silinecekElement);
        System.out.println(tumsayilar); //[3,7]

        tumsayilar.clear();
        System.out.println(tumsayilar);//[]

    }
}
