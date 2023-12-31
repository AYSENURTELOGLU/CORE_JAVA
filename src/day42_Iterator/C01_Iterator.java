package day42_Iterator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class C01_Iterator {
      /*
            Collections icerisindeki tum yapilar index'i desteklemez
            Index olmadan tum elementleri manipule edecegimiz for-each loop'u kullanabiliriz
            ANCAK for-each loop ile yapilan degisiklikler, kalici olmaz
            Java, index kullanmayan yapilarda
            tum elementleri bize getirebilecek
            ve bizim tum elementleri manipule edebilmemize izin verecek
            Iterator ve ListIterator interface'lerini olusturmustur
         */

    public static void main(String[] args) {

        int[] arr={3,4,5,6};

        //index kullanmadan tum elementelri 2'şer arttırın.

        System.out.println("for each loop'dan önce arr= " + Arrays.toString(arr));
        for (int each: arr
             ) {
            each +=2;

        }
        System.out.println("for each loop'dan sonra arr= " + Arrays.toString(arr));

        List<Integer> sayilar= new ArrayList<>();
        sayilar.add(5);
        sayilar.add(23);
        sayilar.add(2);
        sayilar.add(13);
        sayilar.add(1);

        System.out.println(sayilar);

        Iterator itr=sayilar.iterator();

        itr.next();
        itr.remove();
        System.out.println("ilk iterate'den sonra : " + sayilar); // ilk iterate'den sonra : [23, 2, 13, 1]
        itr.next();
        itr.remove();

        itr.next();
        itr.remove();

        itr.next();
        itr.remove();

        itr.next();
        itr.remove();

        System.out.println("sayilar listesinin son hali : " + sayilar); // sayilar listesinin son hali : []
    }





    }


