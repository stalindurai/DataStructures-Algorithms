package DSA;

import org.testng.Assert;
import org.testng.annotations.Test;

public class MoveZeros_Leetcode283 {

    @Test
    public void test1(){
        int[] nums = {0,1,0,3,12};
        int[] exp = {1,3,12,0,0};
        int[] actual = moveZeros(nums);
        Assert.assertEquals(exp, actual);
    }
    @Test
    public void test2(){
        int[] nums = {2,1};
        int[] exp = {2,1};
        int[] actual = moveZeros(nums);
        Assert.assertEquals(exp, actual);
    }

    public int[] moveZeros(int[] nums){

        int p1=0;
        int p2=1;
        int temp=0;
        while(p1< nums.length && p2< nums.length){
            if(nums[p1] == 0 && nums[p2] !=0){
                temp=nums[p1];
                nums[p1] = nums[p2];
                nums[p2] = temp;
                p1++;
                p2++;
            } else if (nums[p1] !=0 && nums[p2] == 0) {
                p1++;
                p2++;
            }else if (nums[p1] !=0 && nums[p2] != 0){
                p1++;
                p2++;
            }else{
                p2++;
            }
        }


        return nums;
    }
}
