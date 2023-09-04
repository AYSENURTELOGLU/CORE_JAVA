package day23_multiDimensionalArrays;

public class C01_TumElementleriTolama {

    public static void main(String[] args) {

        int[] arrTek={3,7,1,9};
        //bu arrayın elemenlerini toplayın

        int toplam=0;
        for (int i = 0; i < arrTek.length; i++) {
            toplam+=arrTek[i];
        }
        System.out.println("arrTel'in elementleri toplamı:" + toplam);


        int[][] sayilar={{1,2,5},{7,4},{9},{3,0,1}};
        //arr[i] dersek inner arraylei getirir.
        //arr[i][j] bize int elementleri verir
        //yani katsayısı kadar index'e yaniforloop'a ihtiyacımız var
        toplam=0;
        for (int i = 0; i < sayilar.length; i++) {//dışarıdaki forloop outer arrayi kontrol eder

            for (int j = 0; j <sayilar[i].length ; j++) {//içerideki forloop inner arrayı kontrol eder
                //sayilar[i][j] sırasıyla her bir int elementi getirir
                toplam+=sayilar[i][j];

            }

        }
        System.out.println("sayilar'in elementleri toplamı:" + toplam);


    }


}
