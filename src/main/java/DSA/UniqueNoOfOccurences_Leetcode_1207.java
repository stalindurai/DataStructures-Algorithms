package DSA;

    /*
    *
    *
    * */

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.HashMap;

public class UniqueNoOfOccurences_Leetcode_1207 {

    @Test
    public void test1(){
        int[] arr = {1,2,3,1};
        int k = 3;
        boolean actual = uniqueOccurences(arr);
        Assert.assertTrue(actual);
    }

    public boolean uniqueOccurences(int[] arr){
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0;i<arr.length;i++){
//            map.getOrDefault(arr[i]:0)+1, 1);
        }

        return false;
    }


}
