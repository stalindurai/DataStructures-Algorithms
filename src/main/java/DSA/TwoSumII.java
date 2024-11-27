package DSA;

/*
* * 1) Did I understand the problem? -> If yes, go to next step !!
     *
     * What is the input(s) type? -- Integer Array
     * What is the expected output? -- Integer Array
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
     * 1. Create an Integer arr2 of size 2
     * 2. Initialise an int i=0, j=arr.length-1
     * 3. Iterate in a for loop for int i
     * 4. Check if arr[i]+arr[j] == target if equal add i,j to the arr2
     * 5. If sum > target j-- and check the sum
     * 6. If sum < target i++ and check the sum
     * 8) Implement them in the code (editor)
     *
     * 9) Test against the different data set
     *
     * 10) If it fails, debug them to solve it !!
* */

import org.testng.annotations.Test;

public class TwoSumII {

    @Test
    public void test2(){
        int[] arr = {1,1,1,1,1,1};
        int exp = 1;
        twoSum(9);



    }
    @Test
    public int[] twoSum(int target){

        int[] arr = {2,7,11,15};
        int[] arr2 = new int[2];
        int j= arr.length-1;
        int i=0;
        if(arr[i]+arr[j] == target){
            arr2[0] = 1;
            arr2[1] = j;
            return arr2;
        }else if (arr[i]+arr[j] > target){
            j--;
        }else if(arr[i]+arr[j] < target){
            i++;
        }
        return arr2;
    }
}
