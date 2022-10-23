package arrays;

public class H03_StdAgesArrayiIcindekiTumElemanlarinToplaminiEkranaYazdiranKoduYaziniz {
    public static void main(String[] args) {

       // Example 2: stdAges Array'i icindeki tum elemanlarin toplamini ekrana yazdiran kodu yaziniz.


        int stdAges [] = new int[7]; // [0, 0, 0, 0, 0, 0, 0 ]

        stdAges [0] = 4;
        stdAges [1] = 14;
        stdAges [2] = 22;
        stdAges [3] = 13;
        stdAges [4] = 75;
        stdAges [5] = 36;
        stdAges [6] = 19;

        //1.yol: for-loop

        int sum =0;

        for (int i = 0; i <stdAges.length; i++) {

            sum = sum + stdAges [i];

        }
        System.out.println(sum);

        //2.yol While-loop
        int i = 0;
        int toplam =0;

        while (i<stdAges.length) {

            toplam = toplam + stdAges [i];

            i++;
        }

        System.out.println(toplam);

        //3.yol do-while-loop

        int k = 0;

        int s = 0;

        do {
            s = s + stdAges [k];
            k++;

        } while (k<stdAges.length);

        System.out.println(s);

        //4.yol foreach

        int t =0;

        for (int w : stdAges) {

            t = t + w;
        }
        System.out.println(t);
    }
}
