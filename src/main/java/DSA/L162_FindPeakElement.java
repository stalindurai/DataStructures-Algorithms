package DSA;

public class L162_FindPeakElement {

      @Test
      public static void Test1()
	    {
	        int[] nums={1,2,3,1};
	        int peakElement = findPeakElement(nums);
	        System.out.println(peakElement);
	    }
	    @Test
	    public static void Test2()
	    {
	    	int[] nums={1,2,1,3,5,6,4};
	        int peakElement = findPeakElement(nums);
	        System.out.println(peakElement);
	    }

	    @Test
	    public static void Test3()
	    {
	        int[] nums={1,2,1,3,5,6,8};
	        int peakElement = findPeakElement(nums);
	        System.out.println(peakElement);
	    }

	    @Test
	    public static void Test4()
	    {
	        int[] nums={1,1};
	        int peakElement = findPeakElement(nums);
	        System.out.println(peakElement);
	    }

  public static int findPeakElement(int[] nums) {
	        
	    	int low = 0, high = nums.length - 1;
	        int n = nums.length;
	        if (n == 1) return 0;
	        if (nums[0] > nums[1]) return 0;
	        if (nums[n - 1] > nums[n - 2]) return n - 1;
	        
	        while (low < high) {
	            
	        	int mid = (low + high) / 2;
	            
	            if (nums[mid] > nums[mid + 1]) {
	        
	            	high = mid;
	        
	            }
	            else {
	            	
	            	 low = mid + 1;
	            }
	        }
	    return low;
}
}
