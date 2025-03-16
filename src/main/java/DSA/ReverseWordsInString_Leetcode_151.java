package DSA;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ReverseWordsInString_Leetcode_151 {

    @Test
    public void test1(){
        String s = "the sky is blue";
        String exp = "blue is sky the";
        String act = reverseWords(s);
        Assert.assertEquals(act, exp);
    }
    @Test
    public void test2(){
        String s = "  hello world  ";
        String exp = "world hello";
        String act = reverseWords(s);
        Assert.assertEquals(act, exp);
    }

    @Test
    public void test3(){
        String s = "a good   example";
        String exp = "example good a";
        String act = reverseWords(s);
        Assert.assertEquals(act, exp);
    }

    public String reverseWords(String s){

        s = s.trim();

        String[] words = s.split("\\s+");
        int left =0, right = words.length-1;

        while(left < right){
            String temp = words[left];
            words[left] = words[right];
            words[right] = temp;
            left++;
            right--;
        }
        return String.join(" ", words);
    }
}
