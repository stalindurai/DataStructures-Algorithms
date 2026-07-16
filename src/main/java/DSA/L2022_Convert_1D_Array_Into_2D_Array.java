package DSA;

public class L2022_Convert_1D_Array_Into_2D_Array {

  @Test
	public static void Test1() {
		int[] inpArray = {1,2,3,4};
		int m = 2, n = 2;
		
		System.out.println(Arrays.deepToString(convert1DTo2D(inpArray, m, n)));
	}
	
	@Test
	public static void Test2() {
		int[] inpArray = {1,2,3};
		int m = 1, n = 3;
		
		System.out.println(Arrays.deepToString(convert1DTo2D(inpArray, m, n)));
	}
	
	
	@Test
	public static void Test3() {
		int[] inpArray = {1,2};
		int m = 1, n = 1;
		
		System.out.println(Arrays.deepToString(convert1DTo2D(inpArray, m, n)));
	}

	@Test
	public static void Test4() {
		int[] inpArray = {2};
		int m = 1, n = 1;
		
		System.out.println(Arrays.deepToString(convert1DTo2D(inpArray, m, n)));
	}

  public static int[][] convert1DTo2D(int[] original, int m, int n){
		
		if(original.length!=(m*n)) {
		
			return new int[][] {};
		
		}
		
		int[][] output2D = new int[m][n];
		int index = 0;
		
		for (int i = 0;i<m;i++) {
			for (int j = 0;j<n;j++) {
				output2D[i][j] = original[index];
				index++;
						
				
			}
		}
		
		
		
		return output2D;
		
	}

}
