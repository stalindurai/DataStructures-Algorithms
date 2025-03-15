package DSA;

import org.testng.Assert;
import org.testng.annotations.Test;

public class MissingNumber_Leetcode_268 {

    @Test
    public void test1(){
        int[] nums = {3,0,1};
        int exp = 2;
        int act = missingNumber(nums);
        Assert.assertEquals(act, exp);
    }
    @Test
    public void test2(){
        int[] nums = {0,1};
        int exp = 2;
        int act = missingNumber(nums);
        Assert.assertEquals(act, exp);
    }
    @Test
    public void test3(){
        int[] nums = {9,6,4,2,3,5,7,0,1};
        int exp = 8;
        int act = missingNumber(nums);
        Assert.assertEquals(act, exp);
    }


    public int missingNumber(int[] nums) {

        int result =0;
        int n = nums.length;

        for(int i=0;i<=n;i++){
            result ^= i;
        }

        for(int a: nums){
            result ^= a;
        }

        return result;
    }


}
