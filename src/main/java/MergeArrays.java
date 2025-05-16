import org.testng.Assert;
import org.testng.annotations.Test;

/*
* Declare int p1=0, p2=0, index=0
* compare the nums1[p1] with nums2[p2]
* if nums1[p1] < nums2[p2]
* Add nums1[index] = nums1[p1] p1++, index++
* if nums1[p1] > nums2[p2]
* Add nums1[index] = nums2[p2] p2++, index++
* if nums1[p1] == nums2[p2]
* Add nums1[index] = nums1[p1] p1++ indexx ++
*     nums2[index] = nums2[p2] p2++ index++
*
*
* */

public class MergeArrays {

    @Test
    public void test4(){
        int[] nums1 = {1,2,3,0,0,0};
        int [] nums2 = {2,5,6};
        int[] exp = {1,2,2,3,5,6};
        int[] actual = mergeArrays(nums1, nums2);
        Assert.assertEquals(actual, exp);

    }

    public int[] mergeArrays(int[] nums1, int[] nums2){
        int p1=0, p2=0,index=0, temp=0;
        int[] arr = new int[nums1.length];
        while(p1< nums1.length){
            while(nums1[p1] == 0 && p2< nums2.length){
                arr[index] = nums2[p2];
                try{
                    p1++;p2++;index++;
                }catch (Exception e){
                    break;
                }
                if(p2 == nums2.length){
                    return arr;
                }

            }
            if(nums1[p1] < nums2[p2]){
                arr[index] = nums1[p1];
                p1++;
                index++;
            }else if(nums1[p1] > nums2[p2]){
                arr[index] = nums2[p2];
                p2++;
                index++;

            }else if(nums1[p1] == nums2[p2]){
                arr[index] = nums1[p1];
                p1++; index++;
                arr[index] = nums2[p2];
                p2++; index++;
            }
        }

        return arr;
    }
}
