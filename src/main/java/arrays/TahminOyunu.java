package arrays;

import java.util.Scanner;

public class TahminOyunu {
    public static void main(String[] args) {

        oyun();


    }
    public static void oyun(){
        Scanner input = new Scanner(System.in);
        int sayi;
        int rasgeleNumara = (int) (Math.random()*100)+1;

        int counter = 0;

        System.out.println("Lütfen 0 ile 100 arasinda bir numara giriniz");
        System.out.println("5 hakkınız bulunmakta");
        do {

            sayi = input.nextInt();

            if (sayi<rasgeleNumara){
                System.out.println("Daha büyük bir numara giriniz");
                System.out.println("Kalan hakkınız: " + (4-counter));
                counter++;
            } else if (sayi>rasgeleNumara) {
                System.out.println("Daha küçük bir numara giriniz");
                System.out.println("Kalan hakkınız: " + (4-counter));
                counter++;

            } else if (sayi==rasgeleNumara) {
                System.out.println("Tebrikler!!!");
                cikis();
                break;
            }
            if (counter==5){
                System.out.println("Tahmin hakkınız kalmadı. Aradiginiz sayi = " + rasgeleNumara);
                cikis();
                break;
            }

        }while (sayi!=rasgeleNumara);
    }

    public static void cikis(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Devam etmek icin '1' i, Çıkış yapmak için '2' yi tuşlayınız");
        int cikisSayisi = scan.nextInt();
        if (cikisSayisi==1){
            oyun();
        } else {
            System.out.println("Görüşürüz!!");

        }

    }
}
