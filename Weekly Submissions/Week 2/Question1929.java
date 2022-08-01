//Concatenate two Arrays
//Naive Approach
import java.util.Arrays;

public class Question1929 {
    public static void main(String[] args) {
        int[] arr = {1,2,1};

        System.out.println("this is arr1"+" "+Arrays.toString(arr));

        int[] arr3 = new int[arr.length*2];
        for (int i = 0; i < arr.length ; i++) {
            arr3[i] = arr[i];
        }

        for (int i =0 ; i < arr.length; i++) {
            arr3[i+ arr.length] = arr[i];
        }
        System.out.println(Arrays.toString(arr3));

//        int [] arr1 = new int[arr.length*2];
//        for (int i = 0; i <arr1.length ; i++)
//        {
//          arr1[i] = arr[i];
//        }
//        System.out.println(Arrays.toString(arr1));
    }
}
