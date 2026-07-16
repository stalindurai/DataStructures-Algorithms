package DSA;

public class G_AlternatePositiveAndNegative {

  /*PsuedoCode:Two Pointers
	 * initialize i and j to 0.
	 *first element should be positive.i is slow pointer. j is fast pointer.
	 * 
	 * if idx modulo 2 is 0, then store positive.
	 * 			if nums[idx] is positive then continue;
	 * 			else store nums[idx] value in temp.set j =idx++;
	 * 			while(nums[j]>=0| j != nums.length){
	 * 			j++;
	 * }
	 * if(j==nums.length){
	 * return nums;
	 * }
	 * 		    store nums[idx] = nums[j];
	 * 			idx++;
	 * 			nums[idx] = temp;
	 * }
	 * 	
	 * 					 
	 * if idx modulo 2 is >0 then negative value.
	 * if(nums[idx]) is negative then continue.
	 * else store nums[idx] value in temp. set j = idx++;
	 * while(nums[j]<0 || j != nums.length)
	 * j++;
	 * if(j==nums.length){
	 * return nums;
	 * }
	 * store nums[idx] = nums[j];
	 * idx++;
	 * nums[idx]=temp;
	 * 
	 * return nums;
	 *
	 *
	 *
	 *
	 *
	 */
	@Test
	public static void Test1() {
		int[] inpArray = {9, 4, -2, -1, 5, 0, -5, -3, 2};
		
		int[] result = alternateArrange(inpArray);
		System.out.println(Arrays.toString(result));
	}
	
	@Test
	public static void Test2() {
		int[] inpArray = {-5, -2, 5, 2, 4, 7, 1, 8, 0, -8};
		
		int[] result = alternateArrange(inpArray);
		System.out.println(Arrays.toString(result));
	}

  public static int[] alternateArrange(int[] nums) {
		int n = nums.length; // Start with finding the next misplaced element
		for (int i = 0; i < n; i++) {
			if (i % 2 == 0 && nums[i] < 0) { 
				// Find the next positive number 
				int j = i + 1;
				while (j < n && nums[j] < 0) {
					j++; 
					} 
				if (j < n) {
					rightRotate(nums, i, j); 
					} 
				} else if (i % 2 != 0 && nums[i] >= 0) {
					// Find the next negative number
					int j = i + 1;
					while (j < n && nums[j] >= 0) { 
						j++; 
						} 
					if (j < n) { 
						rightRotate(nums, i, j); 
						} 
					} 
			}
		return nums;
		} 
	
	
private static void rightRotate(int[] arr, int start, int end) { 
		int temp = arr[end]; 
		for (int i = end; i > start; i--) {
			arr[i] = arr[i - 1];
			}
		arr[start] = temp;
	}
}
}
