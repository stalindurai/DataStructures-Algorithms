package DSA;

public class LongestSubStringWithoutDupsASCII {

  @Test
	public static void Test1() {
		String inpStr = "abcabcdabc";
		int maxlen = findMaxSubArrayNoDuplicate(inpStr);
		System.out.println(maxlen);
	}
	
	public static int findMaxSubArrayNoDuplicate(String s) {
		int maxLen = Integer.MIN_VALUE, p1 = 0, p2 = 0;
		
	//	HashMap<Character,Integer> map = new HashMap<>();
		int[] ascii = new int[128];
		
		
		while(p2<s.length()) {
			ascii[s.charAt(p2) - ' ']++;
			//map.put(s.charAt(p2), map.getOrDefault(s.charAt(p2), 0) + 1);
			while(ascii[s.charAt(p2) - ' '] > 1) {
				ascii[s.charAt(p1) - ' ']--;
				//map.put(s.charAt(p1), map.getOrDefault(s.charAt(p1), 0) - 1);
				p1++;
			}
			maxLen = Math.max(maxLen, p2-p1+1);
			p2++;
		}
		
		return maxLen;
	}
}
