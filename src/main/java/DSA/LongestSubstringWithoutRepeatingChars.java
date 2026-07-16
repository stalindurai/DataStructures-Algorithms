package DSA;

public class LongestSubstringWithoutRepeatingChars {

  @Test
	public static void Test1() {
		String inpStr = "abcabcdabc";
		int maxlen = findMaxSubArrayNoDuplicate(inpStr);
		System.out.println(maxlen);
	}
	
	public static int findMaxSubArrayNoDuplicate(String s) {
		int maxLen = Integer.MIN_VALUE, p1 = 0, p2 = 0;
		
		HashMap<Character,Integer> map = new HashMap<>();
		
		while(p2<s.length()) {
			
			map.put(s.charAt(p2), map.getOrDefault(s.charAt(p2), 0) + 1);
			while(map.get(s.charAt(p2))>1) {
				map.put(s.charAt(p1), map.getOrDefault(s.charAt(p1), 0) - 1);
				p1++;
			}
			maxLen = Math.max(maxLen, p2-p1+1);
			p2++;
		}
		
		
		
		return maxLen;
	}
}
