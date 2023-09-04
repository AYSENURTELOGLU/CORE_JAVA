package day15_NestedForLoop_methodolusturma;

public class C05_NestedForLoop {
    public static void main(String[] args) {

        int satir = 5;
        int sutun = 7 ;
        // dikdortgen bicimde, satir ve sutun numaralarini yazdiralim

        for (int i = 1; i <=satir ; i++) { ///satır kontrolü

            for (int j = 1; j <=sutun ; j++) {  ///sutün kontrolü yapar
                System.out.print(i + ","+j + "    ");
            }
            System.out.println("");

        }

        System.out.println("=================");


        //üçgen için satır ve sutun numaralarını yazalım

        for (int i = 1; i <=satir ; i++) {

            for (int j = 1; j <=i ; j++) {
                System.out.print(i + ","+j + "    ");

            }
            System.out.println("");
        }







    }
}
