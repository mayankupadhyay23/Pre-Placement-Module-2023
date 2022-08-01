//Build Arrays from zero permutation
//Naive Approach.
import java.util.Arrays;
import java.util.Scanner;

public class Questions1920 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr1 = {0,2,1,5,3,4};
       int[]arr3= buildArray(arr1);
        System.out.println(Arrays.toString(arr3));

    }
    static int[] buildArray(int[] arr1){
        int[] arr2 = new int[arr1.length];
        for (int i = 0; i < arr1.length ; i++) {
            arr2[i] = arr1[arr1[i]];
        }
        return arr1;
    }
}
