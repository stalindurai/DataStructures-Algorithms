package DSA;

public class L15_3Sum {

  public static void Test1() {
		int[] inpArray = {-1,0,1,2,-1,-4}; // {-4,-1,-1,0,1,2}
		System.out.println(findTriplets(inpArray));
	}
	
	
	public static void Test2() {
		int[] inpArray = {0,0,0,0,0}; // {-4,-1,-1,0,1,2}
		System.out.println(findTriplets(inpArray));
	}
	
	public static void Test3() {
		int[] inpArray = {1,1,0}; // {-4,-1,-1,0,1,2}
		System.out.println(findTriplets(inpArray));
	}
	
	public static void Test4() {
		int[] inpArray = {-1,0,1,0}; // {-4,-1,-1,0,1,2} [-2,0,1,1,2]
		System.out.println(findTriplets(inpArray));
	}
	
	public static void Test5() {
		int[] inpArray = {-2,0,1,1,2}; // {-4,-1,-1,0,1,2} [-2,0,1,1,2]
		System.out.println(findTriplets(inpArray));
	}
	//-1,0,1,2,-1,-4,-2,-3,3,0,4
	@Test
	public static void Test6() {
		int[] inpArray = {-1,0,1,2,-1,-4,-2,-3,3,0,4}; 
		System.out.println(findTriplets(inpArray));
	}

  public static List<List<Integer>> findTriplets(int[] nums){
		
		List<List<Integer>> result = new ArrayList<>();
		Arrays.sort(nums);
		for (int i = 0; i < nums.length - 2; i++) {
			if (i > 0 && nums[i] == nums[i - 1]) {
				continue; 
				}
			int left = i + 1;
			int right = nums.length - 1;
			while (left < right) {
			
				int sum = nums[i] + nums[left] + nums[right];
				if (sum == 0) { result.add(Arrays.asList(nums[i], nums[left], nums[right]));
				// Skip duplicates for left and right
				while (left < right && nums[left] == nums[left + 1]) {
					left++;
				} 
				while (left < right && nums[right] == nums[right - 1]) {
					right--;
				}
				left++; 
				right--;
				} else if (sum < 0) {
					left++;
				} else {
					right--;
				} 
				} 
			} 
		return result; 
		}
}
