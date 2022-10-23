package arrays;

import java.util.Arrays;

public class H14_SizeVerilenPozitifveNegatifSayilarIcerenBirIntegerArraydekienBuyukNegatifVeEnKucukPozitifElemaniBulunuz {
    public static void main(String[] args) {

        //Example 1: Size verilen pozitif ve negatif sayilar iceren bir  integer array'deki
        // "en buyuk negatif" ve "en kucuk pozitif" elemani bulunuz.

        int arr [] = {3, 12, -12, -5,0,70};

        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));//[-12, -5, 0, 3, 12, 70]

       int maximumNegatif = arr [0];

       int minumumPozitif = arr.length-1;

        for (int w :arr ) {

            if (w<0) {

                maximumNegatif = Math.max(maximumNegatif,w);
            } else if (w>0) {
                minumumPozitif = Math.min(minumumPozitif,w);
            }
        }
        System.out.println("En kucuk negatif deger = " + maximumNegatif + "\n" + "En buyuk negatif deger = " + minumumPozitif);
    }
}
