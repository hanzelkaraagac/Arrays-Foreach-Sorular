package arrays;

import java.util.Arrays;

public class ArraydekiEnKucukBeEnBuyukElemaninToplaminiEkranaYazdiriniz {
    public static void main(String[] args) {


        //Example 1:Array'deki en kucuk ve en buyuk elemanin toplamini ekrana yazdiriniz.

        int stdAges [] = new int[7]; // [0, 0, 0, 0, 0, 0, 0 ]

        stdAges [0] = 4;
        stdAges [1] = 14;
        stdAges [2] = 22;
        stdAges [3] = 13;
        stdAges [4] = 75;
        stdAges [5] = 36;
        stdAges [6] = 19;

        Arrays.sort(stdAges);//kucukten buyuge dogru sirala
        System.out.println(Arrays.toString(stdAges));

        int ilk = stdAges[0];

        //Note length() String'lerde kullanilir. "Length" Array'lerde kullanilir.
        int son = stdAges[stdAges.length-1];

        System.out.println(ilk+son);//79



    }
}
