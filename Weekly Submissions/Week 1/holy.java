package com.jaitly;

public class holy {
    public static void main(String[] args) {
        int [] nums = {5,7,7,8,8,10};
//        obj.Solution = new  obj
    }

}
         class Solution {
    public int[] searchRange(int[] nums, int target) {
        int mid = (nums.length)/2;
        int []arr = new int[2];
        if(mid == target)
        {
            int i = mid;
            while(i != 0)
            {
                if(nums[i] == target)
                {
                    arr[0] = i;
                }
                else
                    i--;
            }
        }
        return arr;
    }
}
