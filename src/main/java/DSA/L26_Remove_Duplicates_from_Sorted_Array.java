package DSA;

public class L26_Remove_Duplicates_from_Sorted_Array {

  @Test
		public static void Test1() {
		int[] nums = {1,1,2};
		int result = removeDupsFromSortedArr(nums);
		System.out.println(result);
	}
	@Test
	
	public static void Test2() {
		int[] nums = {0,0,1,1,1,2,2,3,3,4};
		int result = removeDupsFromSortedArr(nums);
		System.out.println(result);
	}
	
	@Test
	
	public static void Test3() {
		int[] nums = {-100,-99,-98,0,0,1,1,100,100};
		int result = removeDupsFromSortedArr(nums);
		System.out.println(result);
	}
	@Test
	
	public static void Test4() {
		int[] nums = {0,0};
		int result = removeDupsFromSortedArr(nums);
		System.out.println(result);
	}

  public static int removeDupsFromSortedArr(int[] nums) {
		
		int j = 1;
		
		if (nums.length == 0) {
			return 0;
		}
		
		for (int i = 0; i<nums.length-1; i++) {
			if(nums[i]!=nums[i+1]) {
				nums[j] = nums[i+1];
				j++;
				
			}
		}
		
		for(int k=j; k<=nums.length-1;k++) {
			nums[k] = 101;}
		
		System.out.println(Arrays.toString(nums));
		
	    return j;
		
	}
}
