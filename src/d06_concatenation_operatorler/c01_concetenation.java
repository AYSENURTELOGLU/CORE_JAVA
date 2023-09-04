package d06_concatenation_operatorler;

public class c01_concetenation {
    public static void main(String[] args) {

        String s1= "java";
        String s2= "candır";
        String s3= " ";
        String s4= "";
        int a= 3;
        int b=5;

        //yukarıdakilerle yazalım

        //java35
        System.out.println(s1+a+b);

        //java15
        System.out.println(s1+a*b);

        //8candır
        System.out.println(a+b+s2);

        //53java
        System.out.println(s4+b+a+s1);
        System.out.println(b+(a+s1));

        //23 ==> ıntegera cevirmek icin Integer.parseInteger("23"); (wrapper method)

       //35 java
        System.out.println(a+s4+b+s3+s1);







    }
}
