package day22_arrays_MultiDimeonsinalArryas;

import java.util.Arrays;

public class C06_ArrayeBirElemanEkleme {
    public static void main(String[] args) {

        //verilen bir arrayin uzunlugunu 1 arttırarak
        //verilen bir elemente ekleyin

        int[] arr={3,7,8};
        int eklenecekSayi=10;

        //1-önce uzunlugu eski arrayden 1 fazla olan yeni arr oluşturalım

        int[] yeniarr=new int[arr.length+1];
         //2-arr deki var olan elementleri anı indexlerle yeniArrre kopyalayım.

        for (int i = 0; i < arr.length; i++) {

            yeniarr[i]=arr[i];
        }
        System.out.println(Arrays.toString(yeniarr)); //[3, 7, 8, 0]

        //3-eklenecek elementi yeni arrayin son indexsine atayalım

        yeniarr[yeniarr.length-1]=eklenecekSayi;
        System.out.println(Arrays.toString(yeniarr)); //[3, 7, 8, 10]

        //4-eski arr ye yeni değeri atayalım
        arr=yeniarr;
        System.out.println(Arrays.toString(arr)); //[3, 7, 8, 10]

  }
  //bir de method şekilinde yazalım
  public static int[] arrayeBirElemanEkle(int[] eskiarr, int eklenecekSayi){

        int[] yeniarr=new int[eskiarr.length+1];

      for (int i = 0; i < eskiarr.length; i++) {

          yeniarr[i]=eskiarr[i];
      }
      yeniarr[yeniarr.length-1]=eklenecekSayi;
      eskiarr=yeniarr;
      return yeniarr;


  }



}
