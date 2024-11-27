package DSA;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;

public class ContainsDuplicate_Leetcode219 {

    /*Pseudocode:

    *1. Create an empty map with <Integer, Integer>
    2. Iterate through the given array
    3. Check if nums[i] exists in the Map
    4. Add the nums[i] to the key,

    - Initialise hashmap
    - iterate the array and load entries
    - before adding check if nums[i] is already there and i-map.get(nums[i])<k
	- if yes return true
	- else return false
    * */

    @Test
    public void test1(){
        int[] arr = {1,2,3,1};
        int k = 3;
        boolean actual = containsDup(arr, k);
        Assert.assertTrue(actual);
    }
    @Test
    public void test3(){
        int[] arr = {1,0,1,1};
        int k = 1;
        boolean actual = containsDup(arr, k);
        Assert.assertTrue(actual);
    }
    @Test
    public void test2(){
        int[] arr = {1,2,3,1,2,3};
        int k = 2;
        boolean actual = containsDup(arr, k);
        Assert.assertFalse(actual);
    }

    public boolean containsDup(int[] nums, int k){
        Map<Integer, Integer> map = new HashMap<>();
        boolean output = false;
        for(int i=0;i< nums.length;i++){
            if(map.containsKey(nums[i]) && i-map.get(nums[i])<=k){
                return true;
            }else{
                map.put(nums[i], i);
            }
        }return output;
    }
}
