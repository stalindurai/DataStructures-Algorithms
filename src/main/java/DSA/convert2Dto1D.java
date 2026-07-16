package DSA;

public class convert2Dto1D {

  @Test
	public static void Test1() {
		int[][] inpArray = {{1,2,3},{4,5,6},{7,8,9}};
		System.out.println(Arrays.toString(convert2DTo1D(inpArray)));
						
		}
	public static int[] convert2DTo1D(int[][] matrix) {
		
		if(matrix == null || matrix.length == 0) {
			return new int[] {};
		}
		
		int rows = matrix.length;
		int columns = matrix[0].length;
		int[] result = new int[rows*columns];
		int index = 0;
		
		for(int i=0;i<rows;i++) {
			for(int j = 0;j<columns;j++) {
				result[index] =  matrix[i][j];
				index++;
			}
		}
		return result;
	}
}
