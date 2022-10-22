package arrays;

import java.util.Arrays;

public class H09_0_2_3_0_12_0_Sifirlari_En_Sona_Koyunuz {
    public static void main(String[] args) {

        //Example 1: [0, 2, 3, 0, 12, 0] sifirlari en sona koyunuz
        //           [2, 3, 12, 0, 0, 0]

        int sayilar [] = {0,2,3,0,12,0};

        int yeni [] = new int[sayilar.length];

        int idx = 0;

        for (int i = 0; i < sayilar.length; i++) {

            if (sayilar [i] != 0) {

                yeni [idx] = sayilar [i];
                idx++;
            }
        }  System.out.println(Arrays.toString(yeni));



    }
}
