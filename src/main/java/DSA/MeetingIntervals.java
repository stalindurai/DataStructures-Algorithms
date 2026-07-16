package DSA;

public class MeetingIntervals {

  @Test
	public static void Test1() {
		int[][] inpArray =  {{0,30},{5,10},{15,20}};
		System.out.println(isAttendAllMeeting(inpArray));
	}
	
	@Test
	public static void Test2() {
		int[][] inpArray =  {{7,10},{2,4}};
		System.out.println(isAttendAllMeeting(inpArray));
	}
	
	@Test
	public static void Test3() {
		int[][] inpArray =  {{1,4},{2,3}};
		System.out.println(isAttendAllMeeting(inpArray));
	}

  public static boolean isAttendAllMeeting(int[][] intervals) {
		
		Arrays.sort(intervals, (a,b)->a[0]-b[0]);
	//	int starti = intervals[0][0];
	//	int temps = intervals[0][0];
		int endi = intervals[0][1];
	//	int tempe = intervals[0][1];
		
		for(int i =1;i<intervals.length;i++) {
			if(intervals[i][0] <= endi) {
				return false;
			}
			else {
			//	starti=intervals[i][0];
				endi=intervals[i][1];
			}
		
		}
			
		
			return true;
		
		
		
		
	}
}
