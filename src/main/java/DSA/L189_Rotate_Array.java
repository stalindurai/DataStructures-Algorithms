package DSA;

public class L189_Rotate_Array {

  /*PsuedoCode:
	 * Define HAshmap. Initialize it with Key 0 and value 1. iterate through the input array, calculate prefixSum and add the PREFIX SUM as key in the map and count as value.
	 * Before adding, find sum-k = index value, if index value is present in the map, add it to the result. increment counter value and put it in the map both if else cases using getdefault.
	 * return result. 
	 */

  @Test
	public static void Test1() {
		int[] inpArray = {1,2,3,4,5,6,7};
		int k = 3;
		System.out.println(Arrays.toString(rotateArray(inpArray,k)));
	}
	
	@Test
	public static void Test2() {
		int[] inpArray = {-1,-100,3,99};
		int k = 2;
		System.out.println(Arrays.toString(rotateArray(inpArray,k)));
	}
	
	public static int[] rotateArray(int[] nums, int k) {
		
		 k = k % nums.length;  
	     reverse(nums, 0, nums.length - 1); 
	     reverse(nums, 0, k - 1); 
	     reverse(nums, k, nums.length - 1); 
	     return nums;
	   } 
	private static void reverse(int[] nums, int start, int end) {
	    while (start < end) { 
	    int temp = nums[start]; 
	    nums[start] = nums[end]; 
	    nums[end] = temp; 
	    start++; 
	    end--;
	      }
	 }
}
