package DSA;

/*
* * 1) Did I understand the problem? -> If yes, go to next step !!
     * Yes
     * What is the input(s) type? -- Integer Array
     * What is the expected output? -- Integer
     * Do I have constraints to solve the problem? -- Yes
     *      1 <= nums.length <= 3 * 104
            -3 * 104 <= nums[i] <= 3 * 104
     * Do I have all informations to go to next step!! -- Yes
//     * How big is your test data set will be?
     *
     * 2) Test data set
     *
     * Minimum of 3 data set !!
     * Positive, Edge, Negative
     * {-3,-3}
     * {30000, -3, 30000}
     * {1}
     * {4,1,2,1,2}

     * Validate with the interviewer if the data set is fine by his/her assumptions
     *
     * 3) Do I know how to solve it? -- Yes
     *
     * Yes - great, is there an alternate? -- Yes
     *
     * 4) Ask for hint (If you do not know how to solve)
     *
     * 5) Do I know alternate solutions as well? -- No
     *
     * No - That is still fine, proceed to solve by what you know !!
     *
     * 6) If you know alternate solutions -> find out the O Notations
     * (Performance)
     *
     * Then, explain either both or the best (depends on the time)
     *
     * Approach 1: Start with worst -> Improve (Optimize) -> End up with the best
     * Approach 2: Write down the options and benefits and code the best
     *
     * 7) Start always with Psuedo code // Bruteforce
     * 1. Declare a Map<K,V>
     * 2. Iterate the given array in a for loop
     * 3. Add the ith value in the Key of the map, and the add 1 to the key
     * 4. When a duplicate value occurs, iterate the key by 1
     * 5. After iterating all the values, return the Key, with the value as 1
     * 9) Test against the different data set
     *
     * 10) If it fails, debug them to solve it !!
* */

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.HashMap;

public class SingleNumber_Leetcode136 {

    @Test
    public void test1(){
        int[] nums = {4,1,2,1,2};
        int exp = 4;
        int actual = singleNumber(nums);
        Assert.assertEquals(exp, actual);
    }

    public int singleNumber(int[] nums){
        int key =0;

        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(!map.containsKey(nums[i])){
                map.put(nums[i], 1);
            }else{
                map.put(nums[i], map.get(nums[i])+1);
            }
        }

        System.out.println(map.containsValue(1));
        return key;
    }
}
