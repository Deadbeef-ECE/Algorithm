import sun.security.util.Length;


public class Solution {
	public static void replaceSpace(char[] str, int len){
		int space = 0, index = 0;
		for(int i = 0; i < len; i++){
			if(str[i] == ' ')
				space++;
		}
		index = len + space*2;
		str[index] = '\0';
		
		for (int i = len - 1; i >= 0; i--) {
			if (str[i] == ' ') {
				str[index - 1] = '0';
				str[index - 2] = '2';
				str[index - 3] = '%';
				index = index - 3;
			} else {
				str[index - 1] = str[i];
				index--;
			}
		}
	}
	
	public static void main(String[] args){
		String str = "abc de f ";
		System.out.println(str.length());
		char[] array = new char[str.length()*3];
		for (int i = 0; i < str.length(); i++) {
			array[i] = str.charAt(i);
		}
		
		replaceSpace(array, str.length());
		
		return;
	}
}