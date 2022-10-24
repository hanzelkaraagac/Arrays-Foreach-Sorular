package arrays;

import java.util.Arrays;

public class H15_BirStringdekiSesliHarflerinSayisiniBulanKoduYaziniz {
    public static void main(String[] args) {

        //example 1: Bir String'deki sesli harflerin sayisini bulan kodu yaziniz.
        //           a-e-i-o-u A-E-I-O-U

        String str = "Java ogrenince para kazanmak kolay, ogrenmeyince ne kolay ki.";

        str = str.toLowerCase();
        str.split("");
        String harfler [] = str.split("");

        int counter = 0;

        System.out.println(Arrays.toString(harfler));//[j, a, v, a,  , o, g, r, e, n, i, n, c, e,  , p, a, r, a,  , k, a, z, a, n, m, a, k,  , k, o, l, a, y, ,,  , o, g, r, e, n, m, e, y, i, n, c, e,  , n, e,  , k, o, l, a, y,  , k, i, .

        for (String w : harfler) {

            switch (w) {

                case "a":

                case "e":

                case "i":

                case "o":

                case "u":
                    counter++;
                    break;

            }
        }
        System.out.println(counter);
        }

    }
