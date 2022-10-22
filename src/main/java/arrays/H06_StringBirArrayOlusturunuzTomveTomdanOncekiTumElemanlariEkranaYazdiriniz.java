package arrays;

public class H06_StringBirArrayOlusturunuzTomveTomdanOncekiTumElemanlariEkranaYazdiriniz {
    public static void main(String[] args) {

        //Example 1: String bir Array olusturunuz ve "Hanzel" ve "Hanzel" dan onceki tum elemanlari ekrana yazdiriniz.
        //           "Emir","Kazim","Hanzel","Leyla","Seyma" ==> Emir Kazim Hanzel

        String isimler [] = {"Emir","Kazim","Hanzel","Leyla","Seyma"};

        for (String w:isimler) {
            System.out.print(w + " ");

            if (w.equals("Hanzel")) {
                break;
            }
        }

        System.out.println();

        //Example 2: String bir Array olusturunuz ve "Yasmin" ve "Yasmin" dan onceki tum elemanlari ekrana yazdiriniz.
        //           "Kumsal","Cagatay","Ali","Yasmin","Mira","Asya" ==> Kumsal Cagatay Ali Yasmin

        String ss [] = {"Kumsal","Cagatay","Ali","Yasmin","Mira","Asya"};

        for (String w:ss) {
            System.out.print(w + " ");
            if (w.equals("Yasmin")) {
                break;
            }
        }

    }
}
