package day11_StringManipulations;

public class C03_substring {
    public static void main(String[] args) {

        String str= "Java Candır";

        /*
        sunstring metodu bize verilen bir stringin istenen parçasını alma
        imkanı tanır. iki türlü kullanımı vardır.

        1-baslanıgc indexini verirseniz, o indexten sona kadar olan kısımı verir.

        2-baslanıgc ve bitiş indexlerini verirseniz baslangıc indexinden dahil olarak
        baslar. bitiş indexsine kadar(hariç) aradı karakterleri yazdırır.
         */

        System.out.println(str.substring(3));//a candır
        System.out.println(str.substring(7));//ndır
        System.out.println(str.substring(0));// java candır
       // System.out.println(str.substring(15)); // sınırıların dışınnda çalışmaz
        System.out.println(str.substring(11)); //boş satır yazdırı. hiçlik


       // "Java Candır";

        System.out.println(str.substring(3,6)); // a C
        System.out.println(str.substring(5,10)); //Candi
        System.out.println(str.substring(1,2)); // a
        System.out.println(str.substring(6,7)); // a
        //bu yazım istenen indexteki tek lementi verir. charAt e benze
        //bu nedenle metin gri çıktı. ama arti bir özelliği var
        //substrng bize string verdiği için manipulaiton yapmaya devam edebiliriz.

        //6.indexteki harfi büyük harf olarak yazdırın
        System.out.println(str.substring(6,7).toUpperCase());

        System.out.println(str.substring(3,3)); // hiçlik

        // System.out.println(str.substring(8,5)); //geri gitmez

        //son üç harfi yazdırın.
        System.out.println(str.substring(str.length()-3));
        System.out.println(str.substring(8,11));

        //CONCATENATİON
        String s1="Java";
        String s2=" ";
        String s3="Candir";

        System.out.println(s1+s2+s3);
        System.out.println(s1.concat(s2).concat(s3)); //java candır






    }
}
