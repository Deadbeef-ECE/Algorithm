/*************************************************************************
	> File Name: Solution.java
	> Author: 
	> Mail: 
	> Created Time: Wed 14 Jan 2015 02:37:09 AM EST
 ************************************************************************/

package Q1_1;

public class Solution{
    public static boolean isUniqueChars(String str){
        if(str.length() > 128){
            return false;
        }
        boolean[] set = new boolean[128];
        for(int i = 0; i < str.length(); i++){
            int val = str.charAt(i);
            System.out.println("val is :" + val);
            if(set[val]){
                return false;
            }
            set[val] = true;
        }
        return true;
    }
    
    //For string only have little letter a-z
    public static boolean isUniqueString(String str){
    	if(str.length() > 128){
    		return false;
    	}
    	int checker = 0;
    	for(int i = 0; i < str.length(); i++){
    		int val = str.charAt(i) - 'a';
            System.out.println("val is :" + val);
    		if(val < 0 || val > 26)
    			return false;
    		if((checker & (1 << val)) > 0)
    			return false;
    		checker |= (1 << val);
    	}
    	return true;
    }

    public static void main(String[] args){
        String[] words = {"acss", "abcdefgh","1234567", "122444", " 12345%^&*", "$^^&#$#$"};
        for(String word : words){
                System.out.println(word + ":" + isUniqueChars(word) + " " + isUniqueString(word));
        }
    }
}

