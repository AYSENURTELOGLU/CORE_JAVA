package day11_StringManipulations;

public class C07_indexOf {

    public static void main(String[] args) {

        String str="Ali topu at, at ali at";

        //Ali nin index si nedir? 0
        System.out.println(str.indexOf("Ali"));

        //at'ın index'i nedir? 9
        System.out.println(str.indexOf("at"));

        //op'un indexsi nedir?
        System.out.println(str.indexOf("op"));

        System.out.println(str.indexOf('a')); //9

        System.out.println(str.indexOf("a", 10)); //10

        System.out.println(str.indexOf("YUSUF")); //-1




    }
}
