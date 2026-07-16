package DSA;

public class L930_Binary_Subarrays_With_Sum_Using_Sliding_Window {

  @Test
	public static void Test1() {
		int[] inputArr = {1,0,1,0,1};
		int k = 2;
		System.out.println(maxSum(inputArr,k));
	}
	
	@Test
	public static void Test2() {
		int[] inputArr = {0,0,0,0,0};
		int k = 0;
		System.out.println(maxSum(inputArr,k));
	}
	
	@Test
	public static void Test3() {
		int[] inputArr = {100, 200, 300, 400};
		int k = 1;
		System.out.println(maxSum(inputArr,k));
	}
  
  public static int maxSum(int[] nums, int goal) {
		
		Map<Integer, Integer> prefixSumCount = new HashMap<>(); 
		
		prefixSumCount.put(0, 1); // To handle cases where the subarray starts from index 0 
		
		int currentSum = 0;
		int result = 0; 
		
		for (int num : nums) { 
			
			currentSum += num; 
			if (prefixSumCount.containsKey(currentSum - goal)) { 
				
				result += prefixSumCount.get(currentSum - goal);
				
				} 
			
			prefixSumCount.put(currentSum, prefixSumCount.getOrDefault(currentSum, 0) + 1); 
			
		   } 
		
		return result;
	}
}
