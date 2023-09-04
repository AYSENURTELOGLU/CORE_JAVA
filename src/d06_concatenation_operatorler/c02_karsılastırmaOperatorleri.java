package d06_concatenation_operatorler;

public class c02_karsılastırmaOperatorleri {
    public static void main(String[] args) {

        //relational operators:


        int a=10;
        int b=20;

        //java da tek eşittir iişareti karşılaştırma değil atama işaretidir.
        //assigment işarti yani

        b=2*a;

        //javada eşitliği kontrol etmek istersek == kullanırız.
        System.out.println(b==2*a); //20==20 b eşittir 2 a mı? true.

        //assıgnment da eşitliğin sol tarafında sadece variable bulunur.
        //sol tarafta matematiksel işlem olmaz. ama karşılaştırma operatörlerinde
        //iki taraftada işlem olabilir.
        System.out.println(3*b>5*a); // 60>50 true olacak

        System.out.println(b>=b-a); //20>=10 true

        System.out.println(a<=b-a); //10<=10 true

        //javada karşılaştırma operaötlrerinde kullanılan boolan değeri
        //tersine çevirir.
        // != eşit değildir demek. ünlem terse çevirir.

        System.out.println(a<b); //true
        System.out.println(! (a<b)); // true==>false
        System.out.println(a!=b); //true






    }
}
