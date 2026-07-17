package DSA;

public class FindSmallestSubArraywith0Sum_MINLength {

  /* - Initialise hashmap//hashset also works because values is not necessary. only boolean return.
* iterate the array and load entries
* before adding check if nums[i] is already there and i-map.get(nums[i])<k
*	- if yes return true
*	- else update
*
*return false
 * 
 */

  @Test
	public static void Test1() {
		int[] inputArray = {4, 2, -3, 1, 6};
		
		int isPresent = findsubArray0Sum(inputArray);
		System.out.println(isPresent);
		
	} 
	
	@Test
	public static void Test2() {
		int[] inputArray = {4, 2, 0, 1, 6};
		
		int isPresent = findsubArray0Sum(inputArray);
		System.out.println(isPresent);
		
	} 
	@Test
	public static void Test3() {
		int[] inputArray = {-3, 2, 3, 1, 6};
		
		int isPresent = findsubArray0Sum(inputArray);
		System.out.println(isPresent);
		
	}
	@Test
	public static void Test4() {
		int[] inputArray = {0};
		
		int isPresent = findsubArray0Sum(inputArray);
		System.out.println(isPresent);
		
	}
	@Test
	public static void Test5() {
		int[] inputArray = {15,-2,2,-8,1,7,10,23};
		
		int isPresent = findsubArray0Sum(inputArray);
		System.out.println(isPresent);
		
	}

  public static int findsubArray0Sum(int[] nums) {
	 
		int sum = 0, minLen = Integer.MAX_VALUE; //check what should we return if no subarrays at all.
		
		HashMap<Integer, Integer> map = new HashMap<>();
		
		map.put(0, -1);
		
		for(int i=0;i<nums.length;i++){
			
			sum += nums[i];
			
			if(map.containsKey(sum)) {
				
				minLen = Math.min(minLen, i - map.get(sum));
			}
			else {
			map.put(sum, i);
			}
		}
			return minLen;
}
}
