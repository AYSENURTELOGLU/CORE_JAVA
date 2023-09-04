package day32_stringBuilder_accessModifier;

public class C02_StringBuilderMethodlari {

    public static void main(String[] args) {

        StringBuilder sb1=new StringBuilder("Java daha da guzellesiyor");

        sb1.reverse();
        System.out.println(sb1); //royisellezug ad ahad avaJ

        System.out.println(sb1.reverse()); //Java daha da guzellesiyor

        //sondaki karakteri silelimm
        sb1.deleteCharAt(sb1.length()-1);
        System.out.println(sb1);

        //-da yı silelim. başlangıç indexsi dahil bitiş daahil değil
        sb1.delete(9,12);
        System.out.println(sb1);

        sb1.insert(sb1.length(), "r.");
        System.out.println(sb1);


        String str="java da bundan memnun";
        sb1.insert(9, str, 4, 7);
        System.out.println(sb1);






    }
}
