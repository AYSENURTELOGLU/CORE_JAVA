package day09_NestedIfElseStatmentTernary;

public class C04_Ternary {
    public static void main(String[] args) {

        /*
        input olarak verilen bir sayının 3 ile tam bölünüp bölünmediğini
        bulun
         */

        int input= 20;

      //  input%3== 0 ? "3 ile tam bölünür" : "3 ile tam bölünmez"; // böyle kullanılmasına izin vermiyor
      //ternary bize bir strng döndürüyor burada
      //bunu ya direk yazdırmalısınız,//veyabir string variable a atamalısınız.

        System.out.println(input%3== 0 ? "3 ile tam bölünür" : "3 ile tam bölünmez");

        //string olarak yazdırıp konsolda sonucuda bakabiliriz.
        String sonuc= input%3== 0 ? "3 ile tam bölünür" : "3 ile tam bölünmez";
        System.out.println(sonuc);

        //verilen input çift sayi ise "çift sayi",
        //input tek sayi ise 2*input sonucunu veren bir ternary yazın

       // String sonuc2= input%2==0 ? "çift sayi" : 2*input; //ksbul etmez çünkü input string değil int dır
        //eğer ternary de true durumu ile false durumu bize farklı data türünde sonuçlar döndürüyorsa
        //sonucu bir variable a atayamayız ama direk yazdırabiliriz.



    }
}
