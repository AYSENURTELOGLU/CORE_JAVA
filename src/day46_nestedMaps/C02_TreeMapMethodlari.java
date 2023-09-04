package day46_nestedMaps;

import java.util.Map;
import java.util.TreeMap;

public class C02_TreeMapMethodlari {
    public static void main(String[] args) {

        TreeMap<String, Integer> harfler= new TreeMap<>();

        harfler.put("K", 25);
        harfler.put("L", 10);
        harfler.put("T", 5);
        harfler.put("Z", 50);
        harfler.put("A", 15);

        System.out.println(harfler); //{A=15, K=25, L=10, T=5, Z=50}

        System.out.println(harfler.tailMap("L")); //{L=10, T=5, Z=50} Lden itibaren kuyruktaki hepsini alır
        System.out.println(harfler.tailMap("C")); //C OLSA NEREDE OLURDU ONA GÖRE DÜŞÜNÜP ORADAN İTİBAREN VERİR. YOKSA DİYE HATA VERMEZ

        System.out.println(harfler.tailMap("L", false)); //{T=5, Z=50} L yi dahil etmeden yazdır diyor.
        System.out.println(harfler.tailMap("C", false)); //{K=25, L=10, T=5, Z=50}

        System.out.println(harfler.headMap("T")); //{A=15, K=25, L=10} BAŞTAN T YE KADAR OLANI AL
        System.out.println(harfler.headMap("M")); //{A=15, K=25, L=10} M olsa hangi arada olurdu o araya kadar yazdırır.

        System.out.println(harfler.headMap("T", true)); //{A=15, K=25, L=10, T=5}
        System.out.println(harfler.headMap("M", true)); //{A=15, K=25, L=10}


        //{A=15, K=25, L=10, T=5, Z=50}
        System.out.println(harfler.ceilingKey("K")); // K
        System.out.println(harfler.ceilingKey("N")); // T
        System.out.println(harfler.ceilingKey("U")); // Z

        System.out.println(harfler.higherKey("K")); //L



    }
}
