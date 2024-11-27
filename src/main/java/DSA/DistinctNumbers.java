package DSA;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Arrays;

/*
* * 1) Did I understand the problem? -> If yes, go to next step !!
     *
     * What is the input(s) type? -- Integer Array
     * What is the expected output? -- Integer
     * Do I have constraints to solve the problem? -- Yes
     * Do I have all informations to go to next step!! -- Yes
//     * How big is your test data set will be?
     *
     * 2) Test data set
     *
     * Minimum of 3 data set !!
     * Positive, Edge, Negative
     * {3,-3}, {1,1,1,1,1,1,1}{1,5,3,3,4,6,7,7,8}
     * Validate with the interviewer if the data set is fine by his/her assumptions
     *
     * 3) Do I know how to solve it? -- Yes
     *
     * Yes - great, is there an alternate? -- Yes
     *
     * 4) Ask for hint (If you do not know how to solve)
     *
     * 5) Do I know alternate solutions as well? -- Yes
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
     * 1. Declare a int variable 'count' and intialise to 0
     * 2.
     *
     * 8) Implement them in the code (editor)
     *
     * 9) Test against the different data set
     *
     * 10) If it fails, debug them to solve it !!
* */

public class DistinctNumbers {

    @Test
    public void test1(){
        int[] arr = {1,2,3,4,5,6,7,7,8,9,9};
        int exp = 9;
        int actual = disticnt(arr);
        Assert.assertTrue(exp == actual);
    }
    @Test
    public void test2(){
        int[] arr = {1,1,1,1,1,1};
        int exp = 1;
        int actual = disticnt(arr);
        Assert.assertTrue(exp == actual);
    }
    @Test
    public void test3(){

        int[] arr = {3,-3};
        int exp = 2;
        int actual = isDistinct(arr);
        Assert.assertTrue(exp == actual);
    }
    @Test
    public void test4(){

        int[] arr = {1,5,3,3,4,6,7,7,8};
        int exp = 7;
        int actual = isDistinct(arr);
        Assert.assertTrue(exp == actual);
    }

    public int disticnt(int[] arr){

        int count =1;
        Arrays.sort(arr);
        for(int i=0;i< arr.length-1;i++){

            if(arr[i] != arr[i+1]){
                count++;
            }

        }
        System.out.println(count);
        return count;

    }

    public int isDistinct(int[] nums){

        int count =1; int j=0; int i=1;

        while (i<nums.length && j< nums.length) {
            if (nums[i] != nums[j]) {
                i++;
                j++;
            } else if (nums[i] == nums[j]) {
                count++;
                i++;
                j = 0;
            }
        }



        return count;
    }
}
