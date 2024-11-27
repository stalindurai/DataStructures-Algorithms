package DSA;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SortColors_Leetcode_75 {

    @Test
    public void test2(){
        int[] nums = {2,0,2,1,1,0};
        int[] exp = {0,0,1,1,2,2};
        int[] actual = sortColors(nums);
        Assert.assertEquals(exp, actual);
    }
    @Test
    public void test1(){
        int[] nums = {2,0,1};
        int[] exp = {0,1,2};
        int[] actual = sortColors(nums);
        Assert.assertEquals(exp, actual);
    }
    @Test
    public void test3(){
        int[] nums = {0,0,2,1,1};
        int[] exp = {0,0,1,1,2};
        int[] actual = sortColors(nums);
        Assert.assertEquals(exp, actual);
    }
    @Test
    public void test4(){
        int[] nums = {0,0,0,0,0,2,1,1};
        int[] exp = {0,0,0,0,0,1,1,2};
        int[] actual = sortColors(nums);
        Assert.assertEquals(exp, actual);
    }

    public int[] sortColors(int[] nums){

        int left =0;int mid=0;
        int right = nums.length-1;
        int temp =0;

        //since mid is the fast pointer we compare it with right
        while(mid <= right){

            if(nums[mid] ==0){
                temp = nums[left];
                nums[left] = nums[mid];
                nums[mid] = temp;
                mid++; left++;
            }else if(nums[mid] == 1){
                mid++;
            }else{
                temp = nums[right];
                nums[right] = nums[mid];
                nums[mid] = temp;
                right--;
            }
        }return nums;

    }


}
