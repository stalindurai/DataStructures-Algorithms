package DSA;

public class FindMajorityElement {

  /*PsuedoCode:
	 * If length of both the strings are not matching then return false
	 * Inside for loop check for the following condition until length of str1(any string) 
	 * If char at str1 not present in str2 or chat at str2 not present in str1 then return false.
	 * At the end of the loop, return true.
	 *
	 */

  @Test
	public static void Test1() {
		int[] inpArray = {3,2,3};
		int result = findMajorityElement(inpArray);
		System.out.println(result);
	}
	@Test
	public static void Test2() {
		int[] inpArray = {2,2,1,1,1,2,2};
		int result = findMajorityElement(inpArray);
		System.out.println(result);
	}
	@Test
	public static void Test3() {
		int[] inpArray = {1};
		int result = findMajorityElement(inpArray);
		System.out.println(result);
	}

  public static int findMajorityElement(int[] nums) {
				
		int len = nums.length;
		
		if(len==1){
        
			return nums[0];
        
		}
		
		HashMap<Integer,Integer> hashMap = new HashMap<>();
		
		for(int i =0; i< len;i++) {
			
			hashMap.put(nums[i],hashMap.getOrDefault(nums[i], 0)+1);
			
			if ((hashMap.get(nums[i])) > len/2) {
			
				return nums[i];
				
			}
			
		}
		
		return -1;
		
	}
}
