package DSA;

//

public class SubArrayWithZeroSum {

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
