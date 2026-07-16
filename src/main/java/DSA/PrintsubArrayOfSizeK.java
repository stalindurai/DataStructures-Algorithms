package DSA;

public class PrintsubArrayOfSizeK {

  @Test
		public static void Test1() {
			int[] inputArr = {100, 200, 300, 400};
			int k = 2;
		//	System.out.println(maxSum(inputArr,k));
			maxSum(inputArr,k);
		}
		
		@Test
		public static void Test2() {
			int[] inputArr = {100, 200, 300, 400};
			int k = 4;
		//	System.out.println(maxSum(inputArr,k));
			maxSum(inputArr,k);
		}
		
		@Test
		public static void Test3() {
			int[] inputArr = {100, 200, 300, 400};
			int k = 1;
			//System.out.println(maxSum(inputArr,k));
			maxSum(inputArr,k);
		}
		
		@Test
		public static void Test4() {
			int[] inputArr = {1,2,3,4,5};
			int k = 3;
			//System.out.println(maxSum(inputArr,k));
			maxSum(inputArr,k);
		}

  @Test
		public static void Test5() {
			int[] inputArr = {9,7,0,1,2,5};
			int k = 2;
			//System.out.println(maxSum(inputArr,k));
			maxSum(inputArr,k);
		}
  
  public static void maxSum(int[] arr, int k) {
			
			int currentSum = 0, start= 0, end =0;
			
			for(end =0;end<arr.length;end++) { //calculate  for 0 to k first in for loop always for sliding window.
				
				currentSum += arr[end];
				
			if(end >= k-1) {
				
				System.out.println(currentSum);
				currentSum -= arr[start];
				start++;
				
			}
			
			
		}
	}
  
  public static void longestSubStringMUnique(int[] arr, int m) {//aabbcc k =1
			
			int currentSum = 0, start= 0, end =0;
			
			for(end =0;end<arr.length;end++) { //calculate  for 0 to k first in for loop always for sliding window.
				
				currentSum += arr[end];
				
			if(end >= m-1) {
				
				System.out.println(currentSum);
				currentSum -= arr[start];
				start++;
				
			}
			
			
		}
	}
}
