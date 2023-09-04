package day27_parametreliConstructor_constructorCall;

public class C02_HastaneRunner {

    public static void main(String[] args) {

        C01_Hastane personel1= new C01_Hastane(); // c01 class'ından bir obje oluşturduk.
        //eşitliğin başı bu kısım obje deklarasyonu   //eşiliğin karşısı yeni obje oluşturmak ve classdaki
        //uygun değerleri atama (initialization)
        //consturctor ise C01_Hastane() yazan kısımdır.


        System.out.println(personel1); //default değeri yazdırır. @7c30a502
        //direk personel bilgisi versin istiyorsak o classta tostring metodu oluşturmalıyız.
        //code >> generate >> toString >> static olmayanlar gelir staticler isterse eklenebilir.

        System.out.println(personel1.personelIsmi); //isim atanmadi.

        System.out.println(personel1.personelTelefonu); //telefon atanamdi.

        System.out.println(personel1.hastaneAdi); //Yildiz Hastanesi
        //hastane adi static bir variable bu yüzden sarartıyor.açılır listede de gelmiyor

        System.out.println(personel1.hastaneTelefonu); //03122456754

        personel1.personelTelefonu="55523265656";
        personel1.personelIsmi="Mertkan";


        C01_Hastane personel2= new C01_Hastane();
        System.out.println(personel2.personelIsmi); //isim atanmadi.
        System.out.println(personel2.personelTelefonu); //telefon atanamdi.








    }





}
