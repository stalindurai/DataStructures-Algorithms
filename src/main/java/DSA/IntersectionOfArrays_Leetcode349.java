package DSA;

/* intersection of two arrays


	- sort the arrays
	- initialise the pointers with value 0, to traverse both the arrays
	- compare the elements at index p1, p2
		- if(num1[p1]<nums2[p2])
			-p1++;
		- else if (nums1[p1]>nums2[p2]){
			-p2++;
		- else
			// add the element into the set //an array
			p1++;p2++
			*/

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Arrays;


public class IntersectionOfArrays_Leetcode349 {

    @Test
    public void test1(){
        int[] nums1 = {1,2,2,1};
        int[] nums2 = {2,2};
        int[] exp = {2};
        int[] actual = intersectionOfArrays(nums1, nums2);
        Assert.assertEquals(actual, exp);
    }

    public int[] intersectionOfArrays(int[] nums1, int[] nums2){

        int minLength = Math.min(nums1.length, nums2.length);
        int[] output = new int[minLength];
        Arrays.fill(output, -1);
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int p1=0, p2=0, index=0;
        while (p1 < nums1.length && p2 < nums2.length) {


            if (nums1[p1] < nums2[p2]) {
                p1++;
            } else if (nums1[p1] > nums2[p2]) {
                p2++;
            } else if (nums1[p1] == nums2[p2]) {
                if(!isElementPresent(nums1[p1],output)){
                    output[index] = nums1[p1];
//                    index++;
                }

                p1++;
                p2++;
            }

        }    return Arrays.copyOfRange(output, 0, index+1);

    }

    public boolean isElementPresent(int a, int[] arr){
        for(int i=0;i< arr.length;i++){
            if(arr[i] == a);
            return false;
        }return true;
    }
}
