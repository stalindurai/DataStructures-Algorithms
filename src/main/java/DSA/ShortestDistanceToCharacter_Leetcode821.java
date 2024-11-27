package DSA;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ShortestDistanceToCharacter_Leetcode821 {

    @Test
    public void test1(){
        String s = "aaab";
        char c = 'b';
        int[] exp = {3,2,1,0};
        int[] actual = shortestDistance(s,c);
        Assert.assertEquals(exp, actual);
    }
    @Test
    public void test2(){
        String s = "loveleetcode";
        char c = 'e';
        int[] exp = {3,2,1,0,1,0,0,1,2,2,1,0};
        int[] actual = shortestDistance(s,c);
        Assert.assertEquals(exp, actual);
    }
    @Test
    public void test3(){
        String s = "baaa";
        char c = 'b';
        int[] exp = {0,1,2,3};
        int[] actual = shortestDistance(s,c);
        Assert.assertEquals(exp, actual);
    }

    public int[] shortestDistance(String s, char c){
        char[] ch = s.toCharArray();
        int[] nums = new int[ch.length];
        int p1 = ch.length;
        for(int i=0;i<nums.length;i++){
            if(ch[i] == c){
                nums[i] = 0;
//                p1++;
                p1=0;
            }else{
                p1++;
                nums[i] = p1;
            }
        }
        for(int i= nums.length-1;i>=0;i--){
            if(ch[i] == c){
                nums[i] =0;
                p1=0;
            }else{
                p1++;
                nums[i] = Math.min(p1, nums[i]);
            }
        }
        return nums;
    }

    /*public int[] shortestDistance(String s, char c){
        char[] ch = s.toCharArray();
        int[] nums = new int[ch.length];
        ArrayList<Integer> arr = new ArrayList<>();
        int p1,idx=0;
        int j=0;
        int counter =0;
        for(int i=0;i< ch.length;i++) {
            if (ch[i] == c) {
                arr.add(i);
                counter++;
            }
          }
        p1=0;
        while(p1 < nums.length){
            nums[p1] = Math.abs(p1-arr.get(j));
            if(nums[p1] == 0 && j<=counter/2){
                j++;
            }
            else if(nums[p1] == 0 && j>=counter/2){
//                j--;
                j++;
            }
            p1++;
        }
        return nums;

    }*/

    /*public int[] shortestDistance(String s, char c){
        char[] ch = s.toCharArray();
        int[] nums = new int[ch.length];
        int p1,idx=0;
        for(int i=0;i< ch.length;i++) {
            if (ch[i] == c) {
                idx = i;
            }
          }
        p1=0;
        while(p1 < nums.length){
            nums[p1] = Math.abs(p1-idx);
            p1++;
        }


        return nums;

    }*/
}
