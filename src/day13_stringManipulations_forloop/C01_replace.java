package day13_stringManipulations_forloop;

public class C01_replace {
    public static void main(String[] args) {

        String str="Javayı anlıyorum ama yazamıyorum";

        // var olan stringin herangi bir bölümünü değiştirebiliriz

        System.out.println(str.replace('J', 'T')); //Tavayı anlıyorum ama yazamıyorum

        System.out.println(str.replace('a', '*')); //J*v*yı *nlıyorum *m* y*z*mıyorum

        System.out.println(str.replace("ama yazamıyorum", "ve yazabiliirim"));
        //Javayı anlıyorum ve yazabiliirim

        System.out.println(str.replace("Java", "AA"));
        //AAyı anlıyorum ama yazamıyorum





    }
}
