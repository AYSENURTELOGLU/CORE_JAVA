package day27_parametreliConstructor_constructorCall;

public class C05_Araba {

    String marka = "Marka belirtilmemis";
    String model="Model belirtilmemis";
    int yil=1900;
    int fiyat;
    String renk="Renk belirtilmemis";

    public C05_Araba() {
    }

    C05_Araba(String marka, String model, int yil, int fiyat, String renk) {

        this.marka = marka; // this. ilkmarkayaı ilk class level daki markaya atamak için
        this.model = model;
        this.yil = yil;
        this.fiyat = fiyat;
        this.renk = renk;
    }
    public C05_Araba(String marka, int yil, int fiyat) { //code>>geneerate>>constructor>>otomatik olutşurur
        this.marka = marka;
        this.yil = yil;
        this.fiyat = fiyat;
    }

    public C05_Araba(String marka, String model, int yil) {
        this.marka = marka;
        this.model = model;
        this.yil = yil;
    }

    public String toString() {
        return "Araba Bilgileri ==>" +
                "marka='" + marka + '\'' +
                ", model='" + model + '\'' +
                ", yil=" + yil +
                ", fiyat=" + fiyat +
                ", renk='" + renk + '\'';
    }
}
