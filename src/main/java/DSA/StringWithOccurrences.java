package DSA;

public class StringWithOccurrences {

  @Test
	public static void Test2() {
		String inpString = "a";
		
		String result = appendStrWithOccurences(inpString);
		System.out.println(result);
	}

  public static String appendStrWithOccurences(String inpStr) {
		
		HashMap<Character,Integer> charCountMap = new HashMap<>();
		List<Character> arrayList = new ArrayList<>();
		
		
		for(int i =0; i<inpStr.length();i++) {
		
			char currentChar = inpStr.charAt(i);
			charCountMap.put(currentChar, charCountMap.getOrDefault(currentChar, 0) + 1);

			if (i == inpStr.length() - 1 || inpStr.charAt(i + 1) != currentChar) {
				int count = charCountMap.get(currentChar); 
				arrayList.add(currentChar);
				arrayList.add((char)('0'+ count));
				count = 0;
				
			
			}
		
			
		}
		return arrayList.toString();
		
		
	}
}
