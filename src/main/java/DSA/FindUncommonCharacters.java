package DSA;

public class FindUncommonCharacters {

  /*PsuedoCode:
	 * From a to z check whether it is present in str1 and not in str2  or viceversa, print.
	 *
	 */
	@Test
	public static void Test1() {
		String inpStr1 = "characters";
		String inpStr2 = "alphabets";
		//boolean result = checkForUncommonChars(inpStr);
		checkForUncommonChars(inpStr1,inpStr2);
		//System.out.println(result);
	}
	@Test
	public static void Test2() {
		String inpStr1 = "geeksforgeeks";
		String inpStr2 = "geeksquiz";
		//boolean result = checkForUncommonChars(inpStr);
		checkForUncommonChars(inpStr1,inpStr2);
		//System.out.println(result);
	}
	
	
	public static void checkForUncommonChars(String str1, String str2) {
		
		if(str1.equals(str2)) {
			System.out.println(str1);
		}
		for(char c='a';c<='z';c++){
            if((str1.indexOf(c)==-1 && str2.indexOf(c) > -1 )||(str2.indexOf(c)==-1 && str1.indexOf(c) > -1 )) {
               System.out.print(c);
            }
        
		}

	}
}
