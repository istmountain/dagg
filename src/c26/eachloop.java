package c26;

public class eachloop {
    public static void main(String[] args) {

        int [] arr={2,4,6,9,11,3};
        for (int i = 0; i <arr.length; i++) {
            System.out.print(arr[i] +" ");

        }
        System.out.println(" ");
        for (int each:arr
             ) {
            System.out.print(each+ " ");
            
        }


    }
}
