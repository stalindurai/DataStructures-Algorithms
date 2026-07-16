package DSA;

public class L2073TimeNeededtoBuyTickets {

  public static void Test1() {
		int[] inpArray = {2,3,2}; int k =2;
		System.out.println(timeRequiredToBuy(inpArray, k));
	}
	

	 
	public static void Test2() {
		int[] inpArray = {5,1,1,1}; int k =0;
		System.out.println(timeRequiredToBuy(inpArray, k));
	}
	
	@Test
	public static void Test3() {
		int[] inpArray = {15,66,3,47,71,27,54,43,97,34,94,33,54,26,15,52,20,71,88,42,50,6,66,88,36,99,27,82,7,72}; int k = 18;
		System.out.println(timeRequiredToBuy(inpArray, k));
	}

  public static int timeRequiredToBuy(int[] tickets, int k) {
		int timeTaken= 0;
		int ticket = tickets[k]-1;
		
		for(int i =0;i<=k;i++) {
			
			if(tickets[i]>tickets[k]) {			 
				
				timeTaken = tickets[k]+timeTaken;
	 
			}
			else {	 
					timeTaken = tickets[i]+timeTaken;
		 
			}
		}
		for(int i =k+1;i<tickets.length;i++) {
			
			if(tickets[i]>ticket) {
				
				timeTaken = ticket+timeTaken;
			}
			
			else {
				
				timeTaken = tickets[i]+timeTaken;
			}
		}
		
		
		return timeTaken;
	}
}
