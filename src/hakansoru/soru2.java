package hakansoru;

import java.util.Scanner;

public class soru2 {
    public static void main(String[] args) {


            Scanner scan=new Scanner(System.in);
            int toplam = 0;

            System.out.println("Bir sayi giriniz: ");
            int sayi = scan.nextInt();

            while(sayi > 0) {
                toplam += sayi % 10;
                sayi /= 10;  // sayi = sayi / 10;
            }
            System.out.println("Girilen sayinin rakamlarının toplamı = " + toplam);
        }
    }

