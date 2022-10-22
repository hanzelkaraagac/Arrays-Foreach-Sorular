package arrays;

import java.util.Arrays;
import java.util.Comparator;

public class H11_SizeVerilenBirCumledekiEnUzunKelimeyiBulanKoduYaziniz {
    public static void main(String[] args) {

        //Example 3: Size verilen bir cumledeki en uzun kelimeyi bulan kodu yaziniz.
        //           "Java kolaydir calisana, ne kolay ki calismayana."

        String cumle = "Java kolaydir calisana, ne kolay ki calismayana.";
        System.out.println(cumle);//Java kolaydir calisana, ne kolay ki calismayana.

        cumle = cumle.replaceAll("\\p{Punct}", "");
        System.out.println(cumle);//Java kolaydir calisana ne kolay ki calismayana

        cumle.split(" ");

        String kelimeler [] = cumle.split(" ");//[Java, kolaydir, calisana, ne, kolay, ki, calismayana]
        System.out.println(Arrays.toString(kelimeler));

        Arrays.sort(kelimeler, Comparator.comparingInt(String::length));//[ne, ki, Java, kolay, kolaydir, calisana, calismayana]
        System.out.println(Arrays.toString(kelimeler));

        System.out.println(kelimeler [kelimeler.length-1]);//calismayana



    }
}
