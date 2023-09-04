package day22_arrays_MultiDimeonsinalArryas;

import java.util.Arrays;

public class C04_StringSpiltMethodu {

    public static void main(String[] args) {

        //bu aslında string metdoudur. ama array döndürdüğü için şimdi işledik.

        String str="Java candir, Selenium heyecan";

        String[] kelimeler=str.split(" ");
        System.out.println(Arrays.toString(kelimeler));
        //[Java, candir,, Selenium, heyecan]
        //kelimeler spacelerden ayrılıca array otomatikolarak yazdırırken araya virgül ve space koyuyor.

        String[] yeniarr=str.split(",");
        System.out.println(Arrays.toString(yeniarr)); //[Java candir,  Selenium heyecan]

        String[] karakterler=str.split("");
        System.out.println(Arrays.toString(karakterler));
        //[J, a, v, a,  , c, a, n, d, i, r, ,,  , S, e, l, e, n, i, u, m,  , h, e, y, e, c, a, n]








    }
}
