package DSA;

public class L34_Find_First_Last_PositionofElementinSortedArray {

  @Test
	public static void Test1() {
		int[] inpArray = {5,7,7,8,8,10};
		int target = 8;
		System.out.println(Arrays.toString(findFirstAndLastPstn(inpArray,target)));
	}
	@Test
	public static void Test2() {
		int[] inpArray = {5,7,7,8,8,10};
		int target = 6;
		System.out.println(Arrays.toString(findFirstAndLastPstn(inpArray,target)));
	}
	@Test
	public static void Test3() {
		int[] inpArray = {8,8,8,8};
		int target = 8;
		System.out.println(Arrays.toString(findFirstAndLastPstn(inpArray,target)));
	}
	@Test
	public static void Test4() {
		int[] inpArray = {};
		int target = 0;
		System.out.println(Arrays.toString(findFirstAndLastPstn(inpArray,target)));
	}

  public static int[] findFirstAndLastPstn(int[] nums, int target) {
		
		int left = 0, right = nums.length-1;
		int[] outputArray = new int[2];
		
		while(left <= right) {
			
			int mid = (left+right)/2;
			
			if(nums[mid] < target) {
				left = mid + 1;
			}
			else if(nums[mid] > target) {
				right = mid-1;
			}
			else {
				int temp = mid;
				while(temp>=0 && nums[temp]==target) {
					  temp--;
					  
				 }
				outputArray[0] = temp+1; 
				temp = mid;
				while(temp<nums.length && nums[temp]==target) {
					  temp++;
					  
				 }
				outputArray[1] = temp-1; 
				return outputArray;
				
			}
		}
		
		return new int[] {-1,-1};
	}
}
