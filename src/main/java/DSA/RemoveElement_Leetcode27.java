package DSA;

import org.testng.Assert;
import org.testng.annotations.Test;

public class RemoveElement_Leetcode27 {

    @Test
    public void test1(){
        int[] nums = {0,1,2,2,3,0,4,2};
        int exp = 5;
        int val=2;
        int actual = removeElement(nums, val);
        Assert.assertEquals(exp, actual);
    }
    @Test
    public void test2(){
        int[] nums = {3,2,2,3};
        int exp = 2;
        int val=3;
        int actual = removeElement(nums, val);
        Assert.assertEquals(exp, actual);
    }
    @Test
    public void test3(){
        int[] nums = {1};
        int exp = 0;
        int val=1;
        int actual = removeElement(nums, val);
        Assert.assertEquals(exp, actual);
    }
    @Test
    public void test4(){
        int[] nums = {3,3};
        int exp = 0;
        int val=3;
        int actual = removeElement(nums, val);
        Assert.assertEquals(exp, actual);
    }
    @Test
    public void test5(){
        int[] nums = {4,5};
        int exp = 1;
        int val=4;
        int actual = removeElement(nums, val);
        Assert.assertEquals(exp, actual);
    }
    @Test
    public void test6(){
        int[] nums = {2,2,2};
        int exp = 0;
        int val=2;
        int actual = removeElement(nums, val);
        Assert.assertEquals(exp, actual);
    }

    public int removeElement(int[] nums, int val){
        int p1=0;
        int p2= nums.length-1;
        int temp=0;
        int count =0;
        if(nums.length == 0){
            return 0;
        }else if(nums.length ==1){
            if(nums[0] == val){
                return 0;
            }else if(nums[0] !=val){
                return nums[0];
            }
        }else if(nums.length ==2){
            p2=1;
            if(nums[p1] == val && nums[p2] != val){
                temp=nums[p1];
                nums[p1] = nums[p2];
                nums[p2] = temp;
                return 1;
            }else if (nums[p1] == val && nums[p2] == val)  {
                return 0;
            }else if (nums[p1] !=val && nums[p2] == val) {
                return 1;
            }else if(nums[p1] != val && nums[p2] !=val){
                return 2;
            }
        }
        while(p1<= (nums.length-1)/2 && p2>=(nums.length)/2){
            if(nums[p1]==val && nums[p2]!=val){
                temp=nums[p1];
                nums[p1] = nums[p2];
                nums[p2] = temp;
                p1++;
                p2--;
            } else if (nums[p1] == val && nums[p2] == val)  {
                p2--;
            } else if (nums[p1] !=val && nums[p2] == val) {
                p1++;
                p2--;
            }else if(nums[p1] != val && nums[p2] !=val){
                p1++;

            }
        }
        for(int i=0;i< nums.length;i++){
            if(nums[i] == val){
                break;
            }else{
                count++;
            }
        }

        return count;
    }

    /*public int removeElement(int[] nums, int val){
        int p1=0;
        int p2= nums.length-1;
        int temp=0;
        int count =0;
        while(p1<= (nums.length-1)/2 && p2>=(nums.length)/2){
            if(nums[p1]==val && nums[p2]!=val){
                temp=nums[p1];
                nums[p1] = nums[p2];
                nums[p2] = temp;
                p1++;
                p2--;
            } else if (nums[p1] == val && nums[p2] == val)  {
                p2--;
            } else if (nums[p1] !=val && nums[p2] == val) {
                p1++;
                p2--;
            }else if(nums[p1] != val && nums[p2] !=val){
                p1++;

            }
        }
        for(int i=0;i< nums.length;i++){
            if(nums[i] == val){
                break;
            }else{
                count++;
            }
        }

        return count;
    }*/
}
