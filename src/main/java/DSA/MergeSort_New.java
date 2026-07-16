package DSA;

public class MergeSort_New {

  @Test
	public static void Test1() {
		int[] inputArr1 = {1,2,3,0,0,0};
		int m=3;
		int[] inputArr2 = {2,5,6};
		int n = 3;
		inputArr1 = mergeSort(inputArr1,m,inputArr2,n);
		
	    System.out.println(Arrays.toString(inputArr1));
	}

  public static int[] mergeSort(int[] nums1, int m, int[] nums2,int n) {
	

		int idx = nums1.length-1;
		int p1= m-1;
		int p2=n-1;
		
		while(p1>=0 && p2>=0) {
			if(nums1[p1]<=nums2[p2]) {
				nums1[idx]=nums2[p2];
				p2--;
				idx--;
			}
			else if(nums1[p1]>nums2[p2]) {
				nums1[idx]=nums1[p1];
				p1--;
				idx--;
			}
			
		}
		
		while(p2>=0) {
			nums1[idx]=nums2[p2];
			p2--;
			idx--;
		}
		
		
		return nums1;
	}
}
