package DSA;

public class FindMaxSubArrayofSizeK {

 //  * sort it 
	// * Initialize pointer left to 0, right to length-1. And tempSum to -1.
	// * sum left and right pointer values.
	// *  if sum is greater than or equal to k , then decrease right.
	// *  if sum is lesser than k, then increase left. Also store it in tempsum, 
	// *  by comparing whether recent sum is greater than previous sum.
	// *  If recent is the greater sum, then update tempSum with recent sum. 
	// *  return tempSum in the end.

  @Test
	public static void Test1() {
		int[] inputArray = {34,23,1,24,75,33,54,8};
		int k = 60;
		int maxSum = findMaxSumK(inputArray, k);
		System.out.println(maxSum);
		
	}//1,8,23,24, 33,34,54,75 //1 8,23,61  60 62 63 64 58 59   //58
	
	@Test
	public static void Test2() {
		int[] inputArray = {34,23,5,24,75,33,54,8};
		int k = 60;
		int maxSum = findMaxSumK(inputArray, k);
		System.out.println(maxSum);
		
	}//59
	@Test
	public static void Test3() {
		int[] inputArray = {61,62};
		int k = 60;
		int maxSum = findMaxSumK(inputArray, k);
		System.out.println(maxSum);
		
	}//-1
	@Test
	public static void Test4() {
		int[] inputArray = {0,60};
		int k = 60;
		int maxSum = findMaxSumK(inputArray, k);
		System.out.println(maxSum);
		
	}//-1

  @Test
	public static void Test5() {
		int[] inputArray = {1};
		int k = 60;
		int maxSum = findMaxSumK(inputArray, k);
		System.out.println(maxSum);
		
	}//-1 
	@Test
	public static void Test6() {
		int[] inputArray = {38,23,1,24,75,33,54,8};
		int k = 60;
		int maxSum = findMaxSumK(inputArray, k);
		System.out.println(maxSum);
		
	}//1,8,23,24, 33,38,54,75 //Middle 57
	@Test
	public static void Test7() {
		int[] inputArray = {};
		int k = 60;
		int maxSum = findMaxSumK(inputArray, k);
		System.out.println(maxSum);
		
	}//Empty //-1
	@Test
	public static void Test8() {
		int[] inputArray = {2,39,37,4,10,15,24};
		int k = 40;
		int maxSum = findMaxSumK(inputArray, k);
		System.out.println(maxSum);
		
	}//Empty //-1

  public static int findMaxSumK(int[] inpArray, int k) {
		
		Arrays.sort(inpArray);
		int left = 0;
		int right = inpArray.length-1;
		int tempSum = -1;
		
		while(left < right) {
			
		if((inpArray[right] + inpArray[left]) >= k) {
			
			right--;
			
		}
		
		else {
			
		//Math.max(tempSum, (inpArray[right] + inpArray[left]));
			if(tempSum < (inpArray[right] + inpArray[left])) {
				
			tempSum = inpArray[right] + inpArray[left];
			
			}
			
			left++;
		}
		
		}		
		
		
		return tempSum;
		
	}
}
