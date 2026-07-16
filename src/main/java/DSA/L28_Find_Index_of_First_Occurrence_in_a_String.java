package DSA;

public class L28_Find_Index_of_First_Occurrence_in_a_String {

  @Test
	public static void Test1() {
	
		String haystack = "bsadbutsad";
		String needle = "sad";
		int result = strStr(haystack, needle);
		System.out.println(result);
	}
	@Test
	public static void Test2() {
	
		String haystack = "sadbutsad";
		String needle = "bad";
		int result = strStr(haystack, needle);
		System.out.println(result);
	}
	@Test
	public static void Test3() {
	
		String haystack = "sad";
		String needle = "sad";
		int result = strStr(haystack, needle);
		System.out.println(result);
	}

  public static int strStr(String haystack, String needle) {
		
		int s1p1 = 0 , s1p2 = 0;
		int s2 = 0;
		//return haystack.indexOf(needle);
		if(!haystack.contains(needle) || needle.length() == 0) { 
			return -1;
		}
		
			
		while(s1p2<=haystack.length() && s2<=needle.length()) {
			
			if(haystack.charAt(s1p2) != needle.charAt(s2)) {
				
				s1p2 = ++s1p1 ;
				s2 = 0;
			
			}
			else {
							
				if(s2 == needle.length()-1 ) {
					return s1p1;
				}
				
				s1p2++;
				s2++;
				}
			}
				
		return -1;
	}
}
