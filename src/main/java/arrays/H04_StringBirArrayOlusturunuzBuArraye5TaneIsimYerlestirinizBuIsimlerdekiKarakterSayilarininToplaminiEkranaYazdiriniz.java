package arrays;

public class H04_StringBirArrayOlusturunuzBuArraye5TaneIsimYerlestirinizBuIsimlerdekiKarakterSayilarininToplaminiEkranaYazdiriniz {
    public static void main(String[] args) {

        //Example 3: String bir array olusturunuz
        //          Bu array'e 5 tane isim yerlestiriniz
        //          Bu isimlerdeki karakter sayilarinin toplamini ekrana yazdiriniz.

        String stdNames [] = new String[5];

        stdNames [0] = "ali";
        stdNames [1] = "tom";
        stdNames [2] = "veli";
        stdNames [3] = "kemal";
        stdNames [4] = "cem";

        int karakterSayilariToplami = 0;

        for (String w: stdNames) {

            karakterSayilariToplami = karakterSayilariToplami + w.length();
        }
        System.out.println(karakterSayilariToplami);

    }
}
