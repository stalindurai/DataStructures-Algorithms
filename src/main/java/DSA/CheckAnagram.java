package DSA;

public class CheckAnagram {

  /*PsuedoCode:
	 * If length of both the strings are not matching then return false
	 * Inside for loop check for the following condition until length of str1(any string) 
	 * If char at str1 not present in str2 or chat at str2 not present in str1 then return false.
	 * At the end of the loop, return true.
	 *
	 */
	@Test
	public static void Test1() {
		String inpStr1 = "geeks";
		String inpStr2 = "kseeg";
		boolean result = checkForAnagram(inpStr1,inpStr2);
		System.out.println(result);
	}
	@Test
	public static void Test2() {
		String inpStr1 = "a";
		String inpStr2 = "a";
		boolean result = checkForAnagram(inpStr1,inpStr2);
		System.out.println(result);
	}
	@Test
	public static void Test3() {
		String inpStr1 = "a";
		String inpStr2 = "ab";
		boolean result = checkForAnagram(inpStr1,inpStr2);
		System.out.println(result);
	}
	@Test
	public static void Test4() {
		String inpStr1 = "ac";
		String inpStr2 = "ab";
		boolean result = checkForAnagram(inpStr1,inpStr2);
		System.out.println(result);
	}
	@Test
	public static void Test5() {
		String inpStr1 = "allergy";
		String inpStr2 = "allergic";
		boolean result = checkForAnagram(inpStr1,inpStr2);
		System.out.println(result);
	}
	@Test
	public static void Test6() {
		String inpStr1 = "aca";
		String inpStr2 = "ace";
		boolean result = checkForAnagram(inpStr1,inpStr2);
		System.out.println(result);
	}
	@Test
	public static void Test7() {
		String inpStr1 = "ace";
		String inpStr2 = "aca";
		boolean result = checkForAnagram(inpStr1,inpStr2);
		System.out.println(result);
	}
	public static boolean checkForAnagram(String str1, String str2) {
		
		if(str1.length() != str2.length()) {
			return false;
		}
		for(int i = 0; i<str1.length();i++){
            if((str1.indexOf(str2.charAt(i)) == -1 ) || (str2.indexOf(str1.charAt(i)) == -1)) {
               return false;
            }
        }
		return true;
	}
}
