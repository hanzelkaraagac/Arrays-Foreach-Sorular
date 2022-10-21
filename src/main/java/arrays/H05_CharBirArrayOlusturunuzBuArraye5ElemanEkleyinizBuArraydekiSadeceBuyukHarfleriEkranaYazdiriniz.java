package arrays;

public class H05_CharBirArrayOlusturunuzBuArraye5ElemanEkleyinizBuArraydekiSadeceBuyukHarfleriEkranaYazdiriniz {
    public static void main(String[] args) {

        //Example 4: Char bir array olusturunuz
        //           Bu array'e 5 eleman ekleyiniz
        //           Bu array'deki sadece buyuk harfleri ekrana yazdiriniz.

        char harfler [] = {'A','b','c','D','S'};


        for (char w: harfler) {

            if (w>='A' && w<='Z') {
                System.out.println(w);
            }

        }



    }
}
