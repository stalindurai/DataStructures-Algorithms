package DSA;

import org.testng.Assert;
import org.testng.annotations.Test;

public class MergeSortedArray_LeetCode88 {

    @Test
    public void test1(){
        int[] nums1 = {1,2,3,0,0,0};
        int m = 3;
        int[] nums2 = {2,5,6};
        int n = 3;
        int[] exp = {1,2,2,3,5,6};
        int[] actual = mergeSorted(nums1, m, nums2, n);
        Assert.assertEquals(actual, exp);
    }

    public int[] mergeSorted(int[] nums1, int m, int[] nums2, int n){

        int p1=m-1, p2=n-1, index=nums1.length-1;

        while(p1 >= 0 && p2 >= 0){
            if(nums1[p1] < nums2[p2]){
                nums1[index] = nums2[p2];
                p2--;
                index--;
            } else if (nums1[p1] > nums2[p2]) {
                nums1[index] = nums1[p1];
                p1--;
                index--;
            }else if (nums1[p1] == nums2[p2]){
                nums1[index] = nums1[p1];
                p1--;
                index--;
            }

        }
//        while(p2 >= 0){
//            nums1[index] = nums2[p2];
//            p2--;
//            index--;
//        }
        while(p1 >= 0){
            nums1[index] = nums1[p1];
            p1--;
            index--;
        }

        return nums1;

    }
}
