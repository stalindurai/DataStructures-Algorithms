package DSA;

import org.testng.Assert;
import org.testng.annotations.Test;

public class MaximumSum {

    @Test
    public void test1(){
        int[] nums = {34,23,1,24,75,33,54,8};
        int val=60;
        int exp = 58;
        int actual = maxSum(nums, val);
        Assert.assertEquals(exp, actual);
    }

    public int maxSum(int[] nums, int val){
        int max =0;
        int p1,p2;
        for(int i=0;i< nums.length;i++){
            p1=i;
            p2=p1+1;
            while(p2 < nums.length){
                if((nums[p1]+nums[p2]>max) && (nums[p1]+nums[p2]<val)){
                    max=nums[p1]+nums[p2];
                }
                p2++;
            }
        }

        return max;
    }
}
