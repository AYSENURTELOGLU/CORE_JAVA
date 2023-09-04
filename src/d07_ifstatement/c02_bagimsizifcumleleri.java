package d07_ifstatement;

public class c02_bagimsizifcumleleri {
    public static void main(String[] args) {
        int a=35;
        int b=30;

        /*
        dikkat edileceler:
        1-eğer booleam şarttan snora süslü parantez kullanımazsa
        java if bodysi olarak ilk noktalı virgüle kadarkibölümü alır.
        diğerleri if bodysinin dışında kalır.

        2-if cümleisnin  süslü parantez kllanmaz ve boolean şartının sonuna
        ; yazarsınız if hiçbir işlem yapmaz

        ÖZETLE
        if bodysi tek satırdan oluşuyorsa if body si birden fazla satırdan oluşuyorsa
        mutlaka süslü parantez kullanmalısınız
         */

        if(a<b){
            System.out.println("a b den küçük 1");
            System.out.println("a b den küçük 2");
            System.out.println("a b den küçük 3");
        }

        if (a%2==0) // ; kullanırsak bu satırda işem biter.
            System.out.println("a 2 ile tam bölnüyor 1"); //ilk virgüle kdarki kısım if bodysidir
            System.out.println("a 2 ile tam bölnüyor 2"); // sonraki satırların if ile ilgisi yoktur.
            System.out.println("a 2 ile tam bölnüyor 3");




            }
}
