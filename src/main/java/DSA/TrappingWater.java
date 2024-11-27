package DSA;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TrappingWater {

    @Test
    public void test1(){
        int[] nums = {0,1,0,2,1,0,1,3,2,1,2,1};
        int exp = 6;
        int actual = trappingWaterTwoPointer(nums);
        Assert.assertEquals(exp, actual);
    }

    public int trappingWaterTwoPointer(int[] nums){
        int ans=0;
        int leftMax = nums[0];
        int rightMax = nums[nums.length-1];
        int left = 1; int right = nums.length-2;

        while (left <= right) {
            if (nums[left] <= nums[right]) {
                if (nums[left] < leftMax) {
                    ans += leftMax - nums[left];
                } else {
                    leftMax = nums[left];

                }
                left++;

            } else {
                if (nums[right] < rightMax) {
                    ans += rightMax - nums[right];
                } else {
                    rightMax = nums[right];

                }
                right--;
            }
        }
        return ans;
    }

    public int trappingWater(int[] nums){
        int ans=0;
        int[] leftMaxHeights = new int[nums.length];
        int[] rightMaxHeights = new int[nums.length];
        leftMaxHeights[0] = nums[0];
        rightMaxHeights[rightMaxHeights.length-1] = nums[nums.length-1];

        for(int i=1;i< nums.length;i++){
            leftMaxHeights[i] = Math.max(leftMaxHeights[i-1], nums[i]);

        }
        for(int i=nums.length-2;i>0;i--){
            rightMaxHeights[i] = Math.max(rightMaxHeights[i+1], nums[i]);
        }

        for(int i=0;i< nums.length;i++){
            ans += Math.max(0,Math.min(leftMaxHeights[i], rightMaxHeights[i])-nums[i]);
        }


        return ans;
    }
}
