package arrays;

public class H10_BirArrayinIcindeHerhangiBirElemaninOlupOlmadiginiKontrolEdenveKacKereTekrarlandiginiGosterenKoduYaziniz {
    public static void main(String[] args) {

        //Example 2: Bir Array'in icinde herhangi bir elemanin olup olmadigini kontrol eden
        //               ve kac kere tekrarlandigini gosteren kodu yaziniz.
        //               [2, 1, 2, -3, 2] ==> Kullanici 2'yi sordu ==> 2 elemani ver 3 kere tekrarlandi
        //                                ==> Kullanici 6'yi sordu ==> 6 array'de yok


        int arr [] = {2, 1, -3, 2};

        int elaman = 2;

        int counter =0;

        for (int w: arr) {

            if (w==elaman) {
                counter++;
            }
        }if (counter>0) {
            System.out.println(elaman +  "Array de " + counter + " defa var ");
            } else {
             System.out.println(elaman + " Array'de yok");
            }
    }
}
