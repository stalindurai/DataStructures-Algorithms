package DSA;

public class diagonalSum {

  @Test
	public static void Test1() {
		int[][] inputNums={{1,2,3},{4,5,6},{7,8,9}};
		int diagonalSum = twoDArray(inputNums);
		System.out.println(diagonalSum);
	}	
	

	public static int twoDArray(int[][] nums) {
	
    int sum=0;
    int n = nums.length;
    
    for (int i=0;i<n;i++){
       
            sum += nums[i][i] + nums[i][n-1-i];
                       
           }
    if(n % 2 != 0) {
    	sum = sum - nums[n/2][n/2];
    }
    System.out.println(Arrays.deepToString(nums));
    
    return sum;
}
