package Q1_3;

public class Solution3 {
	
	public static String sort(String str){
		char[] newString = str.toCharArray();
		java.util.Arrays.sort(newString);
		return new String(newString);
	}
	public static boolean perm1(String str1, String str2) {
		if(str1.length() != str2.length())
			return false;
		
		return sort(str1).equals(sort(str2));
	}
	
	
	public static boolean perm2(String str1, String str2){
		if(str1.length() != str2.length())
			return false;
		
		int[] freq = new int[256];
		char[] str1Array = str1.toCharArray();
		
		for(char c: str1Array){
			++freq[c];
		}
		
		char[] str2Array = str2.toCharArray();
		for(int i = 0; i < str2.length(); i++){
			if(--freq[str2Array[i]] < 0)
				return false;
		}
		return true;
	
	}
	public static void main(String[] args){
		String str1 = new String("WTF1234");
		String str2 = new String("1234WTF");
		
		String str3 = new String("312$#$@@#");
		String str4 = new String("@@$$##123");
		
		String str5 = new String("312");
		String str6 = new String(" 1 2 3");
		
		System.out.println("test perm1");
		
		System.out.println("str1(" + str1 + ") is the permutation of str2(" + str2 + "): " + perm1(str1, str2));
		System.out.println("str3(" + str3 + ") is the permutation of str4(" + str4 + "): " + perm1(str3, str4));

		System.out.println("str1(" + str1 + ") is the permutation of str3(" + str3 + "): " + perm1(str1, str3));
		System.out.println("str2(" + str2 + ") is the permutation of str4(" + str4 + "): " + perm1(str2, str4));
		
		System.out.println("str5(" + str5 + ") is the permutation of str6(" + str6 + "): " + perm1(str5, str6));
		
		System.out.println("test perm2");

		System.out.println("str1(" + str1 + ") is the permutation of str2(" + str2 + "): " + perm2(str1, str2));
		System.out.println("str3(" + str3 + ") is the permutation of str4(" + str4 + "): " + perm2(str3, str4));

		System.out.println("str1(" + str1 + ") is the permutation of str3(" + str3 + "): " + perm2(str1, str3));
		System.out.println("str2(" + str2 + ") is the permutation of str4(" + str4 + "): " + perm2(str2, str4));
		
		System.out.println("str5(" + str5 + ") is the permutation of str6(" + str6 + "): " + perm2(str5, str6));
	}
	
}
