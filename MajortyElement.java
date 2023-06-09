package com.company;

import java.util.Arrays;

public class MajortyElement {
    public static int majorityElement(int[] nums) {
//        int max=0;
//        int num=0;
//        for(int i=0;i<nums.length;i++){
//            int count=0;
//            for(int j=0;j<nums.length;j++){
//                if(nums[i]==nums[j]) {
//               count++;
//               if(count>max){
//                   max=count;
//                   num=nums[i];
//               }
//           }
//           }
//        }
//        return num;
        Arrays.sort(nums);
        return nums[nums.length/2];


    }
    public static void main(String[] args) {
       int [] nums = {3,2,3,4,4,4,2};
     int ans=   majorityElement(nums);
        System.out.println(ans);
    }
}
