package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class H08_KullaniciIleBeraberBirArrayOlusturunuzVeIcineDataEkleyiniz {
    public static void main(String[] args) {

        //Example 3: Kullanici ile beraber bir Array olusturunuz ve icine data ekleyiniz.
        //           Bir ogretmenin sinifindaki ogrencilerin isimlerini application'a yuklemesini saglayan kodu yaziniz.


        Scanner input = new Scanner(System.in);
        System.out.println("Kac ogrenci ismi gireceksiniz");
        int isim = input.nextInt();

        String names [] = new String [isim];

        System.out.println("Girisi sonlandirmak icin Q harfine basiniz.");

        for (int i = 1; i <=isim ; i++) {


            System.out.println("Lutfen " + i + ". ogrenci isminiz giriniz");

            String ogrenciIsimleri = input.next();

            if (ogrenciIsimleri.equalsIgnoreCase("Q")) {
                break;
            }

            names [i-1] = ogrenciIsimleri;// [i-1] ==> i-1 dememizin nedeni i = 1 oldugu icin index sifir olmali
                                          // bundan dolayi i-1 yazdik sifirinci index'i allmak icin


        }   System.out.println(Arrays.toString(names));

    }
}
