package DSA;

public class L560_Subarray_Sum_Equals_K {

  /*PsuedoCode:
	 * Define HAshmap. Initialize it with Key 0 and value 1. iterate through the input array, calculate prefixSum and add the PREFIX SUM as key in the map and count as value.
	 * Before adding, find sum-k = index value, if index value is present in the map, add it to the result. increment counter value and put it in the map both if else cases using getdefault.
	 * return result. 
	 */

  @Test
	public static void Test1() {
		int[] inpArray = {1,1,1};
		int k =2;
		int result = findSubarraySumEqualsK(inpArray, k);
		System.out.println(result);
	}
	@Test
	public static void Test2() {
		int[] inpArray = {1,2,3};
		int k =3;
		int result = findSubarraySumEqualsK(inpArray, k);
		System.out.println(result);
	}

  public static int findSubarraySumEqualsK(int[] nums, int k) {
		
		 HashMap<Integer,Integer> map = new HashMap<>();
		 
		 map.put(0, 1); //Initialize to 0 to handle edge cases.
		 
		 int prefixSum = 0, result = 0;
		 
		 for( int i = 0; i < nums.length; i++) {
		
			 prefixSum += nums[i];
			 
			 if(map.containsKey(prefixSum - k)) {
			
				 result += map.get(prefixSum-k);
			 
			 }
			 
			 map.put(prefixSum, map.getOrDefault(prefixSum, 0) +1);
		 }
		 
		 
		return result;
	}
}
