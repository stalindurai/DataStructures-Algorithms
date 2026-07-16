package DSA;

public class L1832_Check_if_the_Sentence_Is_Pangram {

  /*PsuedoCode:
	 * Define HAshmap. Initialize it with Key 0 and value 1. iterate through the input array, calculate prefixSum and add the PREFIX SUM as key in the map and count as value.
	 * Before adding, find sum-k = index value, if index value is present in the map, add it to the result. increment counter value and put it in the map both if else cases using getdefault.
	 * return result. 
	 */

  @Test
	public static void Test1() {
		String inpStr = "thequickbrownfoxjumpsoverthelazydog";
		boolean result = checkForPangram(inpStr);
		System.out.println(result);
	}
	@Test
	public static void Test2() {
		String inpStr = "aabbcdefghijklmnopqrstuvxyyz";
		boolean result = checkForPangram(inpStr);
		System.out.println(result);
	}
	
	@Test
	public static void Test3() {
		String inpStr = "leetcode";
		boolean result = checkForPangram(inpStr);
		System.out.println(result);
	}
	@Test
	public static void Test4() {
		String inpStr = "k";
		boolean result = checkForPangram(inpStr);
		System.out.println(result);
	}
	
	public static boolean checkForPangram(String sentence) {
		
		if(sentence.length()<26) {
			return false;
		}
		for(char c='a';c<='z';c++){
            if(sentence.indexOf(c)==-1){
                return false;
            }
        }
        return true;
	}
}
