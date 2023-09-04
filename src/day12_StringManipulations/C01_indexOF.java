package day12_StringManipulations;

public class C01_indexOF {

    public static void main(String[] args) {

        String str="Ali topu at, topu at ali";

        //ilk "top" kelimesinin indexi kaçtır.
        System.out.println(str.indexOf("top"));

        //ikinci top metin parçasının indexsini yazdır
        System.out.println(str.indexOf("top",4));//4
        System.out.println(str.indexOf("top",5)); //13
        System.out.println(str.indexOf("top",str.indexOf("top")+1));//13

        //at kelimesinin iki kere kullanılıp kullanılmadıgını metne bakmadan bulun

        int ilkIndex=str.indexOf("at"); // ya -1 ya da doğal sayı olabilir.

        if (ilkIndex==-1){// hiç kullanılmamış demek
            System.out.println("2 kere kullanılmamıştır.");

        } else { // en az 1 kere kullanılmıs

            int ikinciIndex=str.indexOf("at",ilkIndex+1);
            // -1 veya 2. kez kullnıldıysa doğal sayı olur

            if (ikinciIndex==-1) { //sadece 1 kere kulllanılmıs
                System.out.println("2 kere kullanılmamıştır.");
            }else {
                System.out.println("2 veyaz daha fazla kullanılmıstır");
            }
        }








    }
}
