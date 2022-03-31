package hakansoru;

import java.util.Scanner;

public class soru1 {
    public static void main(String[] args) {
        // bir sayi yaziniz ve rakamlari toplamini bulunuz

        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen bir sayi giriniz");
        int sayi = scan.nextInt();
        int toplam =0;

        while (sayi > 0)
         {
             toplam+=sayi%10;
             sayi/=10;

         }
        System.out.println(toplam);
    }
}
