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
