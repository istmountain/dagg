package hakansoru;

import java.util.Arrays;

        public class arrays12 {
            public static void main(String[] args) {
         /*asagidaki cok boyutlu arrayin ic arraylarinin toplamini bulan
        her bir sonucu yeni bir arrayin elemani yapan bir program yaziniz.
        ornek {{1,2,3},{4,5}{6,7}}=1+2+3=6 4+5=9 6+7=13
          */
                int[][] array = {{1, 2, 3}, {4, 5}, {6, 7}};
                int[] arraytoplam = new int[array.length];
                int toplam = 0;
                for (int i = 0; i < array.length; i++) //  i    [0],[1],[2]
                {
                    for (int j = 0; j < array[i].length; j++) {  //j [0(1,2,3)] [1(4,5)] [2(6,7)]


                        toplam=toplam+array[i][j];

                    }

                    arraytoplam[i]=toplam;
                    toplam=0;
                }
                System.out.println(Arrays.toString(arraytoplam));
            }
        }



