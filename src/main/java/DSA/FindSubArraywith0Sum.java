package DSA;

public class FindSubArraywith0Sum {

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
		
		boolean isPresent = findsubArray0Sum(inputArray);
		System.out.println(isPresent);
		
	} 
	
	@Test
	public static void Test2() {
		int[] inputArray = {4, 2, 0, 1, 6};
		
		boolean isPresent = findsubArray0Sum(inputArray);
		System.out.println(isPresent);
		
	} 
	@Test
	public static void Test3() {
		int[] inputArray = {-3, 2, 3, 1, 6};
		
		boolean isPresent = findsubArray0Sum(inputArray);
		System.out.println(isPresent);
		
	}
	@Test
	public static void Test4() {
		int[] inputArray = {0};
		
		boolean isPresent = findsubArray0Sum(inputArray);
		System.out.println(isPresent);
		
	}

  public static boolean findsubArray0Sum(int[] nums) {
	 
	int sum = 0;
	
	HashMap<Integer, Integer> map = new HashMap<>();
	
	map.put(0, 1);
	
	for(int i=0;i<nums.length;i++){
		
		sum += nums[i];
		
		if(map.containsKey(sum)) {
			
			return true;
		}
		map.put(sum, 1);

		}
		return false;
}
}
