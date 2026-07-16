package DSA;

public class L532_K_diff_Pairs_in_an_Array {

  @Test
	public static void Test1() {
		int[] inputArray = {3,1,4,1,5};
		int k = 2;
		int count = findkUniquePairs(inputArray, k);
		System.out.println(count);
	}
	@Test
	public static void Test2() {
		int[] inputArray = {1,2,3,4,5};
		int k = 1;
		int count = findkUniquePairs(inputArray, k);
		System.out.println(count);
	}
	@Test
	public static void Test3() {
		int[] inputArray = {1,3,1,5,4};
		int k = 2;
		int count = findkUniquePairs(inputArray, k);
		System.out.println(count);
	}
	@Test
	public static void Test4() {
		int[] inputArray = {1,1,1,2,1};
		int k = 1;
		int count = findkUniquePairs(inputArray, k);
		System.out.println(count);
	}
	@Test
	public static void Test5() {
		int[] inputArray = {1,1,1,1,1};
		int k = 0;
		int count = findkUniquePairs(inputArray, k);
		System.out.println(count);
	}
	@Test
	public static void Test6() {
		int[] inputArray = {6,2,9,3,9,6,7,7,6,4};
		int k = 3;
		int count = findkUniquePairs(inputArray, k);
		System.out.println(count);
	}

  public static int findkUniquePairs(int[] nums, int k) {
		
		Arrays.sort(nums); 
		
		int left = 0, right = 1, count = 0; 
		while (left < nums.length && right < nums.length) { 
			if (left == right || nums[right] - nums[left] < k) {
				
				right++; 
				
				} 
			else if (nums[right] - nums[left] > k) {
				
				left++;
				
				} 
			else { 
					
				count++;
				left++; 
				right++; 
				
				while (left < nums.length && nums[left] == nums[left - 1]) { 
					left++; 
					} 
				}
			 
		}
		return count;
		}
}
