package array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class sum3{
    public static void main(String args[]){
        int nums[]={-1,0,1,2,-1,-4};
        List<List<Integer>> l1= threeSum(nums);   
    System.out.println(l1.toString());
    }
     public static List<List<Integer>> threeSum(int[] nums) {
    List<List<Integer>> l1= new ArrayList<List<Integer>>();
    Arrays.sort(nums);
    for(int i=0;i<nums.length;i++){
        if(i>0&&nums[i]==nums[i-1])
        continue;
        int l=i+1,r=nums.length-1;
        while(l<r){
            int s=nums[i]+nums[l]+nums[r];
            if(s==0){
            l1.add(Arrays.asList(nums[i],nums[l],nums[r]));
            while(l<r&&nums[l]==nums[l+1])
            l++;
            while(l<r&&nums[r]==nums[r-1])
            r--;
            l++;
            r--;
            }
            else if(s<0)
            l++;
            else
             r--;
        }
    }
    return l1;
    }
}
