package day18_whileLoop_DoWhileLoop;

public class C03_StringiTersineCevirme {

    /*
    Soru 3- While loop kullanarak verilen bir
    String’i terse cevirip, bu halini bize donduren bir method olusturun.
     */

    public static void main(String[] args) {

        System.out.println(metniTerseCevir("bu iş bu kadar"));

        System.out.println(metniTerseCevir("ey edipadanada pide ye"));

    }

    public static String metniTerseCevir(String metin){
        String tersMetin="";
        int index=metin.length()-1;

        while (index>=0){
            tersMetin+=metin.charAt(index);
            index--;
        }
        return tersMetin;
    }



}
