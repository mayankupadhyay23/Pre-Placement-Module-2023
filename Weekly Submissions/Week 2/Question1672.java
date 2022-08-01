import java.util.Arrays;
import java.util.Scanner;
public class Question1672 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        {
            System.out.println("Enter the number of rows ");
            int r = sc.nextInt();
            System.out.println("Enter the number of columns");
            int c = sc.nextInt();
            int sum =0;
            int[][] mat = new int[r][c];
            int[] maxWealthInAMatrix = new int[mat.length];
            for (int i = 0; i <mat.length ; i++) {
                for (int j = 0; j <mat[i].length ; j++) {
                    mat[i][j] = sc.nextInt();
                }
            }
//            for (int[] i:mat) {
//                System.out.println(Arrays.toString(i));
//            }
            for (int i = 0; i <mat.length ; i++) {
                for (int j = 0; j <mat[i].length ; j++) {
                    sum = sum + mat[i][j];
                }
                maxWealthInAMatrix[i] = sum;
                sum = 0;
            }
            int result =  CheckWhoHasMaxWealth(maxWealthInAMatrix);
            System.out.println(Arrays.toString(maxWealthInAMatrix));
            System.out.println(result);
        }
    }
    static int CheckWhoHasMaxWealth(int[]maxWealth){
        int max =Integer.MIN_VALUE;
        for (int i = 0; i < maxWealth.length; i++) {
            if(max<maxWealth[i])
            {
                max = maxWealth[i];
            }
        }
        return max;
    }
}
