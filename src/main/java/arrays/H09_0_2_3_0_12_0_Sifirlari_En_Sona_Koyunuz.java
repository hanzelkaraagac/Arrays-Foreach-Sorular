package arrays;

import java.util.Arrays;

public class H09_0_2_3_0_12_0_Sifirlari_En_Sona_Koyunuz {
    public static void main(String[] args) {

        //Example 1: [0, 2, 3, 0, 12, 0] sifirlari en sona koyunuz
        //           [2, 3, 12, 0, 0, 0]

        int orijinal [] = {0,2,3,0,12,0};

        int yeni [] = new int [orijinal.length];// yeni Array olusturduk. orijinal Array ile ayni uzunlukta olmasi lazim.

        int index = 0;// yeni Array icin calisacak index'e ihtiyacimiz var.

        for (int i = 0; i < orijinal.length; i++) {

            if (orijinal[i] !=0) {

               yeni [index] = orijinal [i];
               index++;
            }
        }
        System.out.println(Arrays.toString(yeni));

    }
}
