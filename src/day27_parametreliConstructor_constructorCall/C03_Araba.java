package day27_parametreliConstructor_constructorCall;

public class C03_Araba {

    String marka = "Marka belirtilmemis";
    String model="Model belirtilmemis";
    int yil=1900;
    int fiyat;
    String renk="Renk belirtilmemis";

    C03_Araba(){
        //herhangi bir class a görünür bir constructor oluştutrursanız default consturcotr
        //silinir. daha önce default cons. ı kullanan başka classlarda default
        // cons.ın silinmesi sorun oluşturur.
        //GENEL UYGULAMA OLARAK
        //bir classa görünür bir parametreli cons. oluşturursak soruna sebebiyet vermemek için
        // default cons. yerine parametresiz bir cons. da oluşturmalıyız.
    }


    C03_Araba(String mrk, String ndl, int yl, int fyt, String rnk){
        marka=mrk;
        model=ndl;
        yil=yl;
        fiyat=fyt;
        renk=rnk;


}



    public String toString() {
        return "Araba Bilgileri ==>" +
                "marka='" + marka + '\'' +
                ", model='" + model + '\'' +
                ", yil=" + yil +
                ", fiyat=" + fiyat +
                ", renk='" + renk + '\'' +
                '}';
    }
}
