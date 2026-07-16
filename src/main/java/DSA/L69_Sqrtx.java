package DSA;

public class L69_Sqrtx {

  @Test
	public static void Test1() {
		
		int x = 4;
		System.out.println(findSquareRoot(x));
		
	}
	
	@Test
	public static void Test2() {
		
		int x = 8;
		System.out.println(findSquareRoot(x));
		
	}

  public static int findSquareRoot(int x) {


		if(x==0){
			
            return 0;
        
		}
		int high = x, low = 1;  
		
		while(low <= high) {
			
			int mid = (low+high)/2;  
			
			//if(mid*mid == x)
			
			if(mid == (x/mid)) {  
				return mid;
			}
			else if (mid > (x/mid) ) {   
				high = mid - 1;
			}
			else {
				low = mid + 1;
			}
		}
		
		return high;
	}
}
