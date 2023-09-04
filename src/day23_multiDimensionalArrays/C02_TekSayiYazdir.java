package day23_multiDimensionalArrays;

public class C02_TekSayiYazdir {
    public static void main(String[] args) {

        int[][] arr={{3,6,8},{2,5,9},{1,3},{12,23,34}};

        /*
        verilen arraydeki tek sayıları aralarında bir boşluk bırakarak
        yanyana yazdırın. en sonna da "toplam ... sayı yazdırıldı" deyin

         */

        int sayac=0;

        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j <arr[i].length ; j++) {
                //arr[i][j] tum elementleri sırasıyla bana getirir.

                if (arr[i][j]%2==1){
                    System.out.print(arr[i][j]+ " ");
                    sayac++;
                }
            }

        }
        System.out.println("\nToplam " + sayac + " adeet sayı yazdırıldı.");

    }
}
