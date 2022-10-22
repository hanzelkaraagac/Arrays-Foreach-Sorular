package arrays;

public class H07_StringBirArrayOlusturunuzVeHanzelVeHanzeldanOncekiTumElemanlariEkranaYazdiriniz {
    public static void main(String[] args) {

        //Example 2: String bir Array olusturunuz ve "Hanzel" ve "Hans" haric tum elemanlari ekrana yazdiriniz.
        //           "Hanzel","Hanabi","John","Hans","Balmond","Karina" ==> Hanabi John Karina Balmond


        String isimler [] = {"Hanzel","Hanabi","John","Hans","Balmond","Karina"};

        for (String w:isimler) {

            if (w.equals("Hanzel") || w.equals("Hans")) {
                continue;
            }
            System.out.print(w + " ");
        }
    }
}
