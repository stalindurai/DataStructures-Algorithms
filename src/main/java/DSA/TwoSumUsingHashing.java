package DSA;

public class TwoSumUsingHashing {

  @Test
	public static void Test4() {
		int[] inputArr = {5,25,75};
		int target = 100;
		System.out.println(Arrays.toString(distinctNums(inputArr,target)));
	}
	
	public static int[] distinctNums(int[] nums, int target) {
		
		HashMap<Integer,Integer> hashMap = new HashMap<>();
		
		for (int i = 0; i<nums.length; i++){
			
			if(hashMap.containsKey(target-nums[i])) {
				
				return new int[] {hashMap.get(target-nums[i]),i};
				
			}
			hashMap.put(nums[i], i);
		}
		
		
		return new int[] {-1,-1};
	} 
}
