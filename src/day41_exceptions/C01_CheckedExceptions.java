package day41_exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class C01_CheckedExceptions {

    public static void main(String[] args) throws FileNotFoundException {

        FileInputStream fis=new FileInputStream("src/day41_exceptions/dosya.txt");

        // String str=23; Compile time error verir.
        // List<String> liste = new List<>();  CTE


    }


    /*
    javadaki fileınputstream class i bilgisayarımızda var olan
    herhangi bir dosyaya erişmek için kullanılır.

    Fileınputstream class ından oluşturdugumuz fis objesinin, istediğimiz dosyayı
    bulabilmesi için obje olusturulurken, istediğimiz dosyanın
    dosya yolunu parametre olarak vermeliyiz.

    Java dosya okuma islemini yapmasini istedigimizde
        o dosyaya erisememe durumunda ne yapilmasi gerektigini bilmek ister
        bunun icin de kodun altini kirmizi cizer

        Compile Time Exceptions (Checked Exceptions) icin 2 ihtimal vardir

        1- standart exceptions gibi try - catch blogu ile sarmalayabiliriz
           try - catch ile exception durumunda ne yapacagini soyleriz
           dolayisiyla kodlarimiz exception olussa bile calismaya devam eder (handle)
        2- Eger exception olustugunda kodun calismaya devam etmesini ISTEMIYORSAK
           veya kodumuzdan emin oldugumuz icin bu riski onemsemiyorsak
           exception'i handle etmek yerine
           Java'ya SEN CALISMANA BAK, biz exception riskinin farkindayiz demek istiyorsak
           method deklarasyonuna THROWS keyword ile bekledigimiz exception'i yazabiliriz


     */


}
