package day22_arrays_MultiDimeonsinalArryas;

import java.util.Arrays;

public class C02_sort {
    public static void main(String[] args) {

        String[] harfler={"L", "a","P", "d", "T", "t"};

        System.out.println(Arrays.toString(harfler)); //[L, a, P, d, T, t]

        Arrays.sort(harfler);
        System.out.println(Arrays.toString(harfler)); //[L, P, T, a, d, t]

        //Arrays.sort metodu arraydeki elementleri Natural Order'a göre sıralar.

        //Arraylerde ve bundan sonra göreceğimiz Array Listlerdde method kullanıldıgında
        //array veya arraylist kalıcı olarak değişir.

        String[] isimler={"Ayşe", "Yusuf","Bugra","Burak","Abdullah","Nergiz","gülay","ramazan"};
        //[Abdullah, Ayşe, Bugra, Burak, Nergiz, Yusuf, gülay, ramazan]
        //ilk harfler aynı ise ikinci  harflere bakarak sıralar

        Arrays.sort(isimler);
        System.out.println(Arrays.toString(isimler));

        int[] sayilar={4,78,4,2,98,3,7,1};
        Arrays.sort(sayilar, 3,6);
        System.out.println(Arrays.toString(sayilar)); //[4, 78, 4, 2, 3, 98, 7, 1]

        Arrays.sort(sayilar);
        System.out.println(Arrays.toString(sayilar)); //[1, 2, 3, 4, 4, 7, 78, 98]



    }
}
