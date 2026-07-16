package DSA;

public class L80_Remove_Duplicates_from_Sorted_Array_II {

 //  /*
 //    * use two pointers
 //  	* first pointer  to 0
 //  	* second point to 1
 //  	* start comparing both pointers, if (p1!=p2) ,  increment both the pointers p1 and p2. 
 //  	* else
 //  	* increment p2 counter.count++;
 //  	* while(p2<length-1)
 //  	* if (p1==p2)
 //  	*  increment count value.and p2.
 //  	* else
 //  	*    value[p1+1]=value[p2];
 //  	*    p1=p2;
 //  	*    p2 += 1;
 //  	*    break;
 //  	*    
 //  	* once the loop ends,
 //  	* whil(p1<=length-1)
 //  	* fill the remaining index values with -101.
	// * /

  @Test
		public static void Test1() {
		int[] nums = {1,1,2};
		int result = removeDupsFromSortedArr(nums);
		System.out.println(result);
	}
	
	@Test
	public static void Test2() {
		int[] nums = {1,1,1,2,2,3};
		int result = removeDupsFromSortedArr(nums);
		System.out.println(result);
	}
	
	
	@Test
	public static void Test3() {
		int[] nums = {0,0,1,1,1,1,2,3,3};
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
		int count = 1;
		
		if (nums.length == 0) {
			return 0;
		}
		
		for (int i = 0; i<nums.length-1; i++) {//1,1,1,2,2,3
			
			if(nums[i]!=nums[i+1] ) {
				nums[j] = nums[i+1];
				j++;
				count = 1;
				
			}
			else if (nums[i]==nums[i+1] ) {
				if(count==1)
				{
					nums[j]=nums[i+1];
					j++;
				}
				
				
				count++;
		}
		}
		for(int k=j; k<=nums.length-1;k++) {
			nums[k] = 101;}
		
		System.out.println(Arrays.toString(nums));
		
	    return j;
		
	}
}
