package com.company;

import java.util.Arrays;
//Two Sum//
public class Main {

    public static void main(String[] args) {
        int[] nums=new int[] {2,7,11,15};
Main main=new Main();
        System.out.println(Arrays.toString(main.twoSum(nums, 17)));
    }
    public int[] twoSum(int[] nums,int target){
        for (int i = 0; i <nums.length; i++) {
            for (int j = i+1; j <nums.length; j++) {
                if (nums[j]==target-nums[i]){
                    return new int[] {i,j};

                }
                
            }
        }
throw new IllegalArgumentException("No solution for defined input data!");
    }

}
