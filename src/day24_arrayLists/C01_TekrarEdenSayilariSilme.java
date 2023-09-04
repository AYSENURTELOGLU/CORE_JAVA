package day24_arrayLists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C01_TekrarEdenSayilariSilme {
    public static void main(String[] args) {

        //verilen bir arrayde tekrar eden elementleri silin
        //arrayi unique değerlerden oluşan haline dönüştürün

        int[] arr={2,4,5,3,2,5,1,5,3,7};

        //[2,4,5,3,1,7]
        /*
        Arrayin en büyük problemi uzunlugunun değişememesidir. bunun için java,
        array altyapısını kullanan ama uzunlugu esnek olan arrayList classını
        oluşturmuştur.
         */

        List<Integer> tekrarList=new ArrayList<>();
        System.out.println(tekrarList); //[]

        /*
        benzersi elementlerden oluşan bir list için forloop ile arraydeki tüm
        elementleriele alıp elealdıgımız elementlistede yoksa listeye ekleyebiliriz
         */

        for (int i = 0; i < arr.length; i++) {

            if(!tekrarList.contains(arr[i])){
                tekrarList.add(arr[i]);
            }
        }
        System.out.println(tekrarList); //[2,4,5,3,1,7]

        arr=new int[tekrarList.size()];

        System.out.println(Arrays.toString(arr)); //[0, 0, 0, 0, 0, 0]

        //bir loop ile listedki elementleri arraye atayabiliriz.

        for (int i = 0; i < arr.length; i++) {

            arr[i]=tekrarList.get(i);
        }
        System.out.println(Arrays.toString(arr)); //[2, 4, 5, 3, 1, 7]








    }
}
