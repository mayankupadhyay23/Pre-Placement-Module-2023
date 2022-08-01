//Running SUM of 1-D Array
import java.util.Arrays;

public class Question1480 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        int sum = 0;
        int[] arr2 = new int[arr.length];
        for (int i = 0; i <arr.length ; i++) {
            sum = sum+arr[i];
            arr2[i] = sum;
        }
//        System.out.println(Arrays.toString(arr2));
        //OPTIMIZED approach
        System.out.println(Arrays.toString(arr));
    }
}
