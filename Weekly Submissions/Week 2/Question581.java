//Naive Approach [nlogn]

import java.util.*;
public class Question581 {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5};
//        System.out.println(Arrays.toString(arr));
       int ans =  findUnsortedSubArray(arr);
        System.out.println(ans);
    }
    public static int findUnsortedSubArray(int[] nums){
       int [] arr = nums.clone();
       Arrays.sort(arr);
       int result = 0;int result2 = 0;
            if(Arrays.equals(arr,nums))
            {
                return 0;
            }
        for (int i = 0; i < nums.length; i++)
        {
                if(nums[i] != arr[i]){
                    result2 =i;
                    break;
                }
        }
        for (int j = nums.length-1; j >=0; j--)
        {
                if(nums[j] != arr[j])
                {
                   result = j;
                   break;
                }
        }
        int ans = result-result2+1;
        return ans;
    }
}
