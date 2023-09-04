package day11_StringManipulations;

public class C01_charArt {
    public static void main(String[] args) {

        String str= "Java Candir";

        //ilk harfi yazır
        System.out.println(str.charAt(0));

        //7.harfi yazdır
        System.out.println(str.charAt(6)); //a

        //BU METNİN UZUNLUGU: 11
        //son harfi yazdırmak için

        System.out.println(str.charAt(11-1));

        //sondan 3.harfi yazdırın
        System.out.println(str.charAt(11-3));

        //eğer sondan başa doğru gelecek şekilde bir char istenirse
        //charAt(uzunluk-sondan kaçıncı karakter) diyebiliriz.

        //metnin uzunluğundan daha büyük sıradaki karakter istenirse:
        //20.karakter mesela:
        //System.out.println(str.charAt(20)); //StringIndexOutOfBoundsException

        //4.büyük harf olaraak yazdırın:
        System.out.println(str.toUpperCase().charAt(3));
        /*
        charAt metodu bize char data türünde bir sonuc döndürür.
        toUpperCase gibi metodlar String variable lar ile çalıştıgından
        charat çalıştıktan sonra String maipulaitons yapılamaz.
        eğer manipulation htiyacı var ise charat metodu kullanılmadan önce yapılmalıdır.
         */





    }
}
