package arrays;

import java.util.Arrays;

public class H01_ArraysIlkKullanim {
    public static void main(String[] args) {

         /*
            1)Ayni data tipinde, coklu data'i depolamak icin Java'nin olusturdugu yapilar vardir.
            Bu yapilardan birisi de "Array" lerdir.

         */

        //Array nasil olusturulur?
      int stdAges [] = new int[7];

        //Array nasil yazdirilir?

        System.out.println("stdAges = " + Arrays.toString(stdAges));


        //Array'lere elemanlar nasil eklenir?

        stdAges [0] = 4;
        stdAges [1] = 14;
        stdAges [2] = 22;
        stdAges [3] = 13;
        stdAges [4] = 75;
        stdAges [5] = 36;
        stdAges [6] = 19;
        System.out.println(Arrays.toString(stdAges));

        //Array'deki herhangi bir elemani nasil yazdirabiliriz?
        System.out.println(stdAges[4]);



    }
}
