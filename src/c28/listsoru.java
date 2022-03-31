package c28;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class listsoru {
    public static void main(String[] args) {


    /* TASK :
   Bir integer list oluşturunuz ve bu list’deki tum sayıların karesinin
   toplamını bulan code create ediniz.
    */

        List<Integer> sayi = new ArrayList<>();
        sayi.add(1);
        sayi.add(2);
        sayi.add(3);
        sayi.add(4);


        int toplam = 0;

        for (int i = 0; i < sayi.size(); i++) {
            for (int j = 0; j < sayi.size(); j++) {

                if (i == j) {
                    toplam = i * j;


                }
                toplam = 0;

            }
        }

    }

}


























