package DSA;

public class L724PivotIndex {

  /*PsuedoCode:
	 * Define HAshmap.  iterate through the input array, calculate prefixSum from right and add the PREFIX SUM as key in the map and index as value.
	 * calculate prefix sum from left, if sum matches (compare with index value from end) then return index. else -1 in the end.
	 * return result. 
	 */

  @Test
	public static void Test1() {
		int[] inpArray = {1,7,3,6,5,6};
		
		int result = findPivotIndex(inpArray);
		System.out.println(result);
	}
	@Test
	public static void Test2() {
		int[] inpArray = {1,2,3};
		
		int result = findPivotIndex(inpArray);
		System.out.println(result);
	}
	@Test
	public static void Test3() {
		int[] inpArray = {2,1,-1};
		
		int result = findPivotIndex(inpArray);
		System.out.println(result);
	}
	@Test
	public static void Test4() {
		int[] inpArray = {0,1};
		
		int result = findPivotIndex(inpArray);
		System.out.println(result);
	}
	@Test
	public static void Test5() {
		int[] inpArray = {-1,-1,0,0,-1,-1};
		
		int result = findPivotIndex(inpArray);
		System.out.println(result);
	}

  public static int findPivotIndex(int[] nums) {
		
		
		int[] outputArray = new int[nums.length];
		int prefixLeftSum = 0, prefixRightSum = 0;
		
		for(int i = nums.length-1;i>=0;i--) {
				prefixRightSum += nums[i];
				outputArray[i] = prefixRightSum;
		}
		for(int i = 0; i < nums.length; i++) {
			prefixLeftSum += nums[i];
			if(prefixLeftSum == outputArray[i]) {
				return i;
			}
		}
		
		return -1;
	}
}
