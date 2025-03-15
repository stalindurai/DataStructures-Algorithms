package DSA;

import org.testng.Assert;
import org.testng.annotations.Test;

public class MissingNumbers_AltSolution_Leetcode268 {

    @Test
    public  void test(){
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

    public int missingNumber(int[] nums){
        int n = nums.length;
        int sum = 0, initialSum =0;
        for(int i=0;i<=n;i++){
            sum = sum + i;
        }
        for(int a : nums){
            initialSum = initialSum +a;
        }

        return sum-initialSum;
    }
}
