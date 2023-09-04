package day11_StringManipulations;

import java.io.OutputStream;

public class C05_statrsWith_endWith {
    public static void main(String[] args) {

        String str="Java çok güzel";

        //str Java ilee mi başlıyor
        System.out.println(str.startsWith("Java"));

        //str J ile mibaşlıyor
        System.out.println(str.startsWith("J"));

        //str Ja ile mi başlıyor
        System.out.println(str.startsWith("Ja"));

        //str "java cok güzel" ile mi başlıuor
        System.out.println(str.startsWith("Java çok güzel"));

        System.out.println(str.startsWith(""));

        //5.indexten sonrası c ile mi başlar?
        System.out.println(str.startsWith("c", 5));

        //6.indexten sonrası ok ile mi başlar?
        System.out.println(str.startsWith("ok",6));




        //"Java çok güzel";

        //str güzel le mi biter
        System.out.println(str.endsWith("güzel")); //true

        //str el ile mi biter
        System.out.println(str.endsWith("el")); //true

        //str "" ile mi biter
        System.out.println(str.endsWith("")); //true











    }
}
