package day26_forEachLoop_constructor;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class C03_OrtakElementleriBulma {
    public static void main(String[] args) {

        //Soru 5- Verilen iki array’in elementlerini karsilastirip,
        // ikisinde ortak olan elementleri ayri bir liste
        // olarak veren bir program yazin.

        int[] arr1={3,5,8,1,3,9,2,4,7,1};
        int[] arr2={2,7,3,5,8,1,9,0,3,5,7};

        //iki array'in elementlerini bana getirmesi için içiçe 2 for-each loop oluşttualım
        //elementleri karşılaştıralım eğer esitlerse ve daha önce
        //listeye eklenmemişsse listeye ekleyelim

        List<Integer> ortakElemanlarListesi=new ArrayList<>();

        for (Integer each1: arr1
             ) {

            for (Integer each2: arr2
                 ) {

                if (each1==each2 && !ortakElemanlarListesi.contains(each1)){
                    ortakElemanlarListesi.add(each1);
                }
            }

        }
        Collections.sort(ortakElemanlarListesi);
        System.out.println(ortakElemanlarListesi);





    }
}