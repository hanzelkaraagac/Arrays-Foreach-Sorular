package arrays;

import java.util.Arrays;

//binarySearch() method: bu method'i kullanarak bir elemanin Array'de olup olmadigini anlariz.
//                       binarySearch() method'unu kullanmadan once mutlaka Arrays.sort() kullanilmalidir.
//                       binarySearch() method'u aradiginzi eleman Array'de varsa o elemanin index'ini return eder.

//                       binarySearch() method'u aradiginzi eleman Array'de yoksa "-a" seklinde bir negatif sayi alirsiniz.
//                       Bu sayidaki "-" isaretinin anlami bu eleman Array'de yok demektir. "a" nin anlami olsaydi kacinci sirada olurdu demektir.

//                       binarySearch() method'u tekrarlayan elemanlar icin kullanilmaz.

public class H12_BinarySearchMethodKullanimi {
    public static void main(String[] args) {

        int arr [] = {12, 31, 43, 14};

        int sayi1 = 43;

        Arrays.sort(arr);// [12, 14, 31 ,43]

        int indexiniVer = Arrays.binarySearch(arr,sayi1);

        System.out.println(indexiniVer);


        int sayi2 = 58;
        int sonuc = Arrays.binarySearch(arr,sayi2);
        System.out.println(sonuc);//bastaki "-" isareti olmadigini gosterir. sonraki sayi olsaydi hangi sirada oldugunu gosterir.(-5)






        int cilek [] = {20,100,500,10,5};

        int sayi3 = 10;

        Arrays.sort(cilek);//
        System.out.println(Arrays.toString(cilek));//[5, 10, 20, 100, 500]

        int cilekSepeti = Arrays.binarySearch(cilek,sayi3);
        System.out.println(cilekSepeti);//1



    }
}
